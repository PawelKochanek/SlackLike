package sandbox;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        MainClient mainClient = new MainClient();

        mainClient.connectToServer("192.168.1.74", 55555);
    }
}
