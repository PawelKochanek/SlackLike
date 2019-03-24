import network.*;
import utils.DefaultInitializer;
import utils.SlackLikeInitializer;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ChannelRepository channelRepository = new InMemoryChannelRepository();
        SlackLikeInitializer initializer = new DefaultInitializer(channelRepository);
        initializer.initialize();
        Collection<Channel> channel = channelRepository.getAll();
        ChatServer chatServer = new TcpChatServer(channelRepository);
        chatServer.start(50000);
    }
}
