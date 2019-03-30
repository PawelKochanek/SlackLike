import commands.ChatCommand;

interface NetworkBasedChatClient extends ChatClient {
    void connect(String ip, int port);
    void disconnect();
    void sendMessage(ChatCommand message);
    boolean isOnline();
}
