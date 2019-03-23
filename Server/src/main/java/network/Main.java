package network;

public class Main {
    public static void main(String[] args) {
        ChatServer chatServer = new TcpChatServer();
        chatServer.start(50500);
    }
}
