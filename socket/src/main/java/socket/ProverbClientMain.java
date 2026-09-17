package socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ProverbClientMain {

    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int porta = 12345;

        Socket socket = new Socket(host, porta);
        System.out.println("Ligado ao servidor! (escreve 'sair' para terminar)\n");

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        PrintWriter saida = new PrintWriter(
                socket.getOutputStream(), true
        );

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Recebe a primeira metade do servidor
            String pergunta = entrada.readLine();
            if (pergunta == null) break;
            System.out.println("Servidor: " + pergunta);

            if (pergunta.contains("Ate logo")) break;

            // Cliente escreve a segunda metade
            System.out.print("Tu: ");
            String resposta = scanner.nextLine();
            saida.println(resposta);

            // Recebe feedback do servidor
            String feedback = entrada.readLine();
            System.out.println("Servidor: " + feedback + "\n");

            if (resposta.equalsIgnoreCase("sair")) break;
        }

        socket.close();
        scanner.close();
    }
}