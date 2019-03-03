package sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {

    private Socket socket;
    private PrintWriter output;
    private BufferedReader input;

    public void connectToServer(String ipAdress, int port) throws IOException, InterruptedException {
        socket = new Socket(ipAdress, port);

//        output = new PrintWriter(socket.getOutputStream(), true);
//        Thread.sleep(2000);
//        output.println("Hello from cilent");
//        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        System.out.println(input.readLine());
        output = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        while(!text.equals("koniec")){
            output.println(text);
            text = scanner.next();
        }
    }
//    public void disconnect() throws IOException {
//        socket.close();
//    }
}
