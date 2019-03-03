package sandbox;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        MainServer mainServer = new MainServer();

        mainServer.startServer(6666);
    }
}
