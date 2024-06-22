import java.io.*;
import java.net.*;

public class PoetryClient {
    private static final String SERVER_IP = "127.0.0.1"; // IP-адрес сервера
    private static final int SERVER_PORT = 6789; // Порт, который слушает сервер

    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket(SERVER_IP, SERVER_PORT);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Получение стихотворения от сервера
            StringBuilder poem = new StringBuilder();
            String line;
            while ((line = inFromServer.readLine()) != null) {
                poem.append(line).append("\n");
            }
            System.out.println("Полученное стихотворение:\n" + poem.toString());

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удалось подключиться к серверу. Проверьте IP-адрес и порт.");
        }
    }
}
