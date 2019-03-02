import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    private ServerSocket serverSocket;
    private Socket clientSocet;
    private PrintWriter output;
    private BufferedReader input;

    public void startServer (int port) throws IOException {
        serverSocket = new ServerSocket(port);

        System.out.println("Server is running");
        clientSocet = serverSocket.accept();
        System.out.println("Client has been connected");
        input = new BufferedReader(new InputStreamReader(clientSocet.getInputStream()));
        System.out.println(input.readLine());

        while(true){
            String text = input.readLine();
            System.out.println(text);
        }
        ///////////// odpowiedź do clienta /////////////////////
//        output = new PrintWriter(clientSocet.getOutputStream(),true);
//        output.println("Hello from server");

        ///////////////////// wiadomosc ze kliet sie rozlaczyl ///////////////////////////////////////

//        while(!clientSocet.isClosed() && !clientSocet.isInputShutdown()){
//        }
//        System.out.println("Client has been disconnected");
    }
}
