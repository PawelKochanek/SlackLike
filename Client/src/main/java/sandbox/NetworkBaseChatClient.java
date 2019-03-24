package sandbox;

        import java.io.IOException;

interface NetworkBasedChatClient extends ChatClient {
    void connect(String ip, int port);
    void disconnect();
    void sendMessage(String message);
    boolean isOnline();
}
