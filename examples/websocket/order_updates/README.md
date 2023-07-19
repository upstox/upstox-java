# Portfolio Stream Feed WebSocket Client

This Java project demonstrates how to connect to the Upstox WebSocket API for streaming live order updates. It fetches the order updates and prints them to the console.

## Getting Started

These instructions will help you run the sample WebSocket client.

### Prerequisites

Before you can run this script, you need to have Java 11 or later installed on your system. If you haven't installed Java yet, you can download it from the official website:

[Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

You will also need to add several dependencies to your project:

- `upstox-java-sdk`
- `java-websocket`

#### Maven

Add these dependencies your `pom.xml` file.

```
<dependencies>
  <!-- Java WebSocket -->
  <dependency>
    <groupId>org.java-websocket</groupId>
    <artifactId>Java-WebSocket</artifactId>
    <version>1.5.1</version>
  </dependency>

  <!-- Upstox API client -->
  <dependency>
    <groupId>com.upstox.api</groupId>
    <artifactId>upstox-java-sdk</artifactId>
    <version>1.0.0</version>
  </dependency>
</dependencies>
```

#### Gradle

Add these dependencies your `build.gradle` file.

```
dependencies {
  // Java WebSocket
  implementation 'org.java-websocket:Java-WebSocket:1.5.1'

  // Upstox API client
  implementation 'com.upstox.api:upstox-java-sdk:1.0.0'
}
```

### Configuration

The script requires an Upstox API access token for authorization. You will need to specify your Upstox API access token in the Java class. Look for the line below and replace 'ACCESS_TOKEN' with your actual access token.

```
String accessToken = "ACCESS_TOKEN";
```

### Running the Script

After installing the prerequisites and setting up your access token, you can run the script. Use your preferred Java IDE to run the main method of the OrderUpdatesClient class.

## Understanding the Code

The script first authenticates an API client using an OAuth2 access token. It then uses the authenticated client to retrieve the authorized redirect URI for a portfolio stream feed from the Upstox server. Using this URI, it creates and connects a WebSocket client.

As the WebSocket client starts running, it continuously receives and prints portfolio updates to the console, thanks to the overridden onMessage method. Other methods like onOpen, onClose, and onError provide information about the connection status and potential issues.

## Support

If you encounter any problems or have any questions about this project, feel free to open an issue in this repository.

## Disclaimer

This is a sample script meant for educational purposes. It may require modifications to work with your specific requirements.

Please replace 'ACCESS_TOKEN' with your actual access token and `OrderUpdatesClient` with the name of your Java class. Modify any other details as needed to fit your project.

