import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {

        MainClient mainClient = new MainClient();


        mainClient.connectToServer("127.0.0.1", 6666);
    }
}
