# Market Stream feed WebSocket client

This Java project demonstrates how to connect to the Upstox WebSocket API for streaming live market data. It fetches market data for a list of instrument keys. When the client receives updates from the server, it decodes the incoming protobuf data into a FeedResponse object.

## Getting Started

These instructions will help you run the sample WebSocket client.

### Prerequisites

Before you can run this script, you need to have Java 11 or later installed on your system. If you haven't installed Java yet, you can download it from the official website:

[Download Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

You will also need to add several dependencies to your project:

- `protobuf`
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

  <!-- Google Gson for JSON handling -->
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
  </dependency>

  <!-- Protocol Buffers -->
  <dependency>
    <groupId>com.google.protobuf</groupId>
    <artifactId>protobuf-java</artifactId>
    <version>3.15.8</version>
  </dependency>
</dependencies>
```

#### Gradle

Add these dependencies your `build.gradle` file.

```
dependencies {
  // Java WebSocket
  implementation 'org.java-websocket:Java-WebSocket:1.5.1'

  // Google Gson for JSON handling
  implementation 'com.google.code.gson:gson:2.8.8'

  // Protocol Buffers
  implementation 'com.google.protobuf:protobuf-java:3.15.8'

}
```

### Protocol Buffers (Protobuf) Classes Generation

Generate the Protobuf classes in Java from `.proto` file.

Before you can generate the Protobuf classes, you need to download the [proto file](https://assets.upstox.com/feed/market-data-feed/v3/MarketDataFeed.proto) and install the Protocol Buffers compiler (protoc).

To download the Protocol Buffers compiler, go to the [Google Protocol Buffers GitHub repository](https://github.com/protocolbuffers/protobuf/releases) and download the appropriate `protoc-<version>-<os>.zip` file for your operating system. Extract the ZIP file and add the `bin` directory to your system PATH.

For example, on a Unix-like system, you can add the directory to your PATH like this:

```bash
export PATH=$PATH:/path/to/protoc/bin
```

You can confirm that the compiler is correctly installed by opening a new terminal window and running the following command:

```
protoc --version
```

This should print the protoc version.

#### Generate Protobuf classes

Navigate to the directory containing your .proto files and run the following command:

```
protoc --java_out=. *.proto
```

This will generate .java files for each .proto file in the directory.

In your Java code, you can now import the generated classes like any other classes.

Sample class included as part of this repo.

### Configuration

The script requires an Upstox API access token for authorization. You will need to specify your Upstox API access token in the Java class. Look for the line below and replace 'ACCESS_TOKEN' with your actual access token.

```
String accessToken = "ACCESS_TOKEN";
```

### Running the Script

After installing the prerequisites and setting up your access token, you can run the script. Use your preferred Java IDE to run the main method of the MarketFeederClient class.

## Understanding the Code

The script first sets up an SSL context. It then fetches the authorized redirect URI from the Upstox server using a valid access token and utilizes this URI to establish a connection with the WebSocket server.

The script sends a subscription request for "NSE_INDEX|Nifty Bank" and "NSE_INDEX|Nifty 50". When it receives data from the server, it decodes the protobuf data into a FeedResponse object, converts this object into a dictionary, and then prints the dictionary.

## Support

If you encounter any problems or have any questions about this project, feel free to post it on our [Developer Community](https://community.upstox.com/c/developer-api/15).
## Disclaimer

This is a sample script meant for educational purposes. It may require modifications to work with your specific requirements.

Please replace 'ACCESS_TOKEN' with your actual access token and `MarketFeederClient` with the name of your Java class. Modify any other details as needed to fit your project.



