import java.io.*;
import java.net.*;
import java.util.*;

public class PoetryServer {
    private static final int PORT = 6789;
    private static final String POETRY_FILE = "poems.txt";
    private static final String DELIMITER = "---";

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Сервер запущен и ожидает подключений...");

        try {
            while (true) {
                Socket connectionSocket = serverSocket.accept();
                PrintWriter outToClient = new PrintWriter(connectionSocket.getOutputStream(), true);
                String poem = getRandomPoem(POETRY_FILE);
                outToClient.println(poem);
                connectionSocket.close();
            }
        } finally {
            serverSocket.close();
        }
    }

    private static String getRandomPoem(String poetryFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(poetryFile));
        List<String> poems = new ArrayList<>();
        scanner.useDelimiter(DELIMITER);
        while (scanner.hasNext()) {
            poems.add(scanner.next());
        }
        scanner.close();
        Random random = new Random();
        return poems.get(random.nextInt(poems.size())).trim();
    }
}