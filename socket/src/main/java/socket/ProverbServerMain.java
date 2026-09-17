package socket;

import java.io.*;
import java.net.*;

public class ProverbServerMain {

    public static void main(String[] args) throws IOException {

        int porta = 12345;
        ProverbServer servidor = new ProverbServer();

        ServerSocket serverSocket = new ServerSocket(porta);
        System.out.println("Servidor à escuta na porta " + porta + "...");

        Socket clienteSocket = serverSocket.accept();
        System.out.println("Cliente ligado!");

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(clienteSocket.getInputStream())
        );
        PrintWriter saida = new PrintWriter(
                clienteSocket.getOutputStream(), true
        );

        String mensagem;
        while (true) {
            // Envia a primeira metade
            String primeiraParte = servidor.getPrimeiraParte();
            saida.println("Completa o proverbio: " + primeiraParte);
            System.out.println("Enviado: " + primeiraParte);

            // Lê resposta do cliente
            mensagem = entrada.readLine();
            if (mensagem == null || mensagem.equalsIgnoreCase("sair")) {
                saida.println("Ate logo!");
                break;
            }

            System.out.println("Cliente respondeu: " + mensagem);

            // Verifica resposta
            if (servidor.verificarResposta(mensagem)) {
                saida.println("Correto! Muito bem!");
            } else {
                saida.println("Errado! A resposta era: " + servidor.getSegundaParte());
            }
        }

        clienteSocket.close();
        serverSocket.close();
        System.out.println("Servidor encerrado.");
    }
}