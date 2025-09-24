package com.upstox.sanity;

import com.upstox.ApiClient;
import com.upstox.Configuration;
import com.upstox.auth.OAuth;
import com.upstox.feeder.MarketDataStreamerV3;
import com.upstox.feeder.MarketUpdateV3;
import com.upstox.feeder.constants.Mode;
import com.upstox.feeder.listener.OnErrorListener;
import com.upstox.feeder.listener.OnMarketUpdateV3Listener;
import com.upstox.feeder.listener.OnOpenListener;

import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class MarketStreamerV3Test {
    private static MarketDataStreamerV3 marketDataStreamer;
    private static Timer timer;
    private static final CountDownLatch shutdownLatch = new CountDownLatch(1);
    
    public static void main(String[] args) throws InterruptedException {
        // Configure the client
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("OAUTH2");
        oAuth.setAccessToken(DataToken.accessToken);

        // Initialize streamer
        marketDataStreamer = new MarketDataStreamerV3(defaultClient);
        timer = new Timer("MarketStreamerV3-Timer", true);

        // Set up event handlers
        setupEventHandlers();

        // Display timeline
        displayTimeline();

        // Add shutdown hook for cleanup
        Runtime.getRuntime().addShutdownHook(new Thread(MarketStreamerV3Test::cleanupAndExit));

        System.out.println("\nConnecting...");
        
        try {
            // Start the connection
            marketDataStreamer.connect();
            
            // Wait for the test to complete
            shutdownLatch.await();
        } catch (Exception e) {
            System.err.println("Error connecting to streamer: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void setupEventHandlers() {
        marketDataStreamer.setOnOpenListener(new OnOpenListener() {
            @Override
            public void onOpen() {
                System.out.println("WebSocket connection opened");
                System.out.println("Initial subscription: NSE_INDEX|Nifty 50 in 'full' mode");
                
                // Subscribe to initial instrument
                try {
                    Set<String> instruments = new HashSet<>();
                    instruments.add("NSE_INDEX|Nifty 50");
                    marketDataStreamer.subscribe(instruments, Mode.FULL);
                    System.out.println("Successfully subscribed to Nifty 50");
                } catch (Exception error) {
                    System.err.println("Error subscribing to Nifty 50: " + error.getMessage());
                }
                
                // Schedule timed operations
                scheduleTimedOperations();
            }
        });

        marketDataStreamer.setOnMarketUpdateListener(new OnMarketUpdateV3Listener() {
            @Override
            public void onUpdate(MarketUpdateV3 marketUpdate) {
                try {
                    // Extract key information from market update
                    String instrumentKey = "Unknown";
                    String mode = "Unknown";
                    
                    if (marketUpdate != null) {
                        // Try to extract instrument key from the market update
                        String updateStr = marketUpdate.toString();
                        
                        // Extract instrument key if available
                        if (updateStr.contains("NSE_INDEX|Nifty 50")) {
                            instrumentKey = "NSE_INDEX|Nifty 50";
                        } else if (updateStr.contains("NSE_INDEX|Nifty Bank")) {
                            instrumentKey = "NSE_INDEX|Nifty Bank";
                        }
                        
                        // Determine mode based on data structure (simplified)
                        if (updateStr.contains("FULL_D30")) {
                            mode = "FULL_D30";
                        } else if (updateStr.contains("FULL")) {
                            mode = "FULL";
                        } else if (updateStr.contains("LTPC")) {
                            mode = "LTPC";
                        }
                        
                        System.out.println(String.format("[%s] %s - Market Update: %s", 
                            mode.toUpperCase(), instrumentKey, marketUpdate));
                    }
                } catch (Exception e) {
                    System.err.println("Error processing market update: " + e.getMessage());
                    System.out.println("Raw update: " + marketUpdate);
                }
            }
        });

        marketDataStreamer.setOnErrorListener(new OnErrorListener() {
            @Override
            public void onError(Throwable error) {
                System.err.println("WebSocket error: " + error.getMessage());
                error.printStackTrace();
            }
        });
    }

    private static void scheduleTimedOperations() {
        // 6 seconds: Subscribe to Bank Nifty
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                subscribeBankNifty();
            }
        }, 6000);

        // 15 seconds: Unsubscribe from Nifty 50
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                unsubscribeNifty50();
            }
        }, 15000);

        // 30 seconds: Change mode to full_d30
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                changeModeToD30();
            }
        }, 30000);

        // 50 seconds: Cleanup and exit
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cleanupAndExit();
            }
        }, 50000);
    }

    private static void subscribeBankNifty() {
        System.out.println("\n[6 SECONDS] Subscribing to 'NSE_INDEX|Nifty Bank' in 'full' mode");
        try {
            Set<String> instruments = new HashSet<>();
            instruments.add("NSE_INDEX|Nifty Bank");
            marketDataStreamer.subscribe(instruments, Mode.FULL);
            System.out.println("Successfully subscribed to Nifty Bank");
        } catch (Exception error) {
            System.err.println("Error subscribing to Nifty Bank: " + error.getMessage());
        }
    }

    private static void unsubscribeNifty50() {
        System.out.println("\n[15 SECONDS] Unsubscribing from 'NSE_INDEX|Nifty 50'");
        try {
            Set<String> instruments = new HashSet<>();
            instruments.add("NSE_INDEX|Nifty 50");
            marketDataStreamer.unsubscribe(instruments);
            System.out.println("Successfully unsubscribed from Nifty 50");
        } catch (Exception error) {
            System.err.println("Error unsubscribing from Nifty 50: " + error.getMessage());
        }
    }

    private static void changeModeToD30() {
        System.out.println("\n[30 SECONDS] Changing mode to 'full_d30' for all remaining subscriptions");
        try {
            // Change mode for Nifty Bank (which should be the only remaining subscription)
            Set<String> instruments = new HashSet<>();
            instruments.add("NSE_INDEX|Nifty Bank");
            marketDataStreamer.changeMode(instruments, Mode.FULL_D30);
            System.out.println("Successfully changed mode to 'full_d30' for Nifty Bank");
        } catch (Exception error) {
            System.err.println("Error changing mode to full_d30: " + error.getMessage());
        }
    }

    private static void cleanupAndExit() {
        System.out.println("\n[50 SECONDS] Cleaning up and disconnecting...");
        try {
            // Cancel timer
            if (timer != null) {
                timer.cancel();
                timer = null;
            }
            
            // Disconnect the streamer
            if (marketDataStreamer != null) {
                marketDataStreamer.disconnect();
                marketDataStreamer = null;
            }
            
            System.out.println("Cleanup completed. Exiting...");
            
            // Signal shutdown
            shutdownLatch.countDown();
            
        } catch (Exception error) {
            System.err.println("Error during cleanup: " + error.getMessage());
            error.printStackTrace();
        }
    }

    private static void displayTimeline() {
        System.out.println("Starting MarketDataStreamerV3 with timed operations...");
        System.out.println("Timeline:");
        System.out.println("  0 sec: Connect with 'NSE_INDEX|Nifty 50' in 'full' mode");
        System.out.println("  6 sec: Subscribe to 'NSE_INDEX|Nifty Bank' in 'full' mode");
        System.out.println("  15 sec: Unsubscribe from 'NSE_INDEX|Nifty 50'");
        System.out.println("  30 sec: Change mode to 'full_d30' for remaining subscriptions");
        System.out.println("  50 sec: Cleanup and exit");
    }
}