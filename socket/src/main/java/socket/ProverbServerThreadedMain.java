package socket;

import java.io.*;
import java.net.*;

public class ProverbServerThreadedMain {

    public static void main(String[] args) throws IOException {

        int porta = 12345;

        ServerSocket serverSocket = new ServerSocket(porta);
        System.out.println("Servidor Threaded à escuta na porta " + porta + "...");

        while (true) {
            Socket clienteSocket = serverSocket.accept();
            System.out.println("Cliente ligado: " + clienteSocket.getInetAddress());

            // Cada cliente tem a sua própria thread
            Thread t = new Thread(() -> {
                try {
                    ProverbServer servidor = new ProverbServer();

                    BufferedReader entrada = new BufferedReader(
                            new InputStreamReader(clienteSocket.getInputStream())
                    );
                    PrintWriter saida = new PrintWriter(
                            clienteSocket.getOutputStream(), true
                    );

                    while (true) {
                        // Envia a primeira metade
                        String primeiraParte = servidor.getPrimeiraParte();
                        saida.println("Completa o proverbio: " + primeiraParte);
                        System.out.println("[Cliente " + clienteSocket.getInetAddress() + "] Enviado: " + primeiraParte);

                        // Lê resposta do cliente
                        String mensagem = entrada.readLine();
                        if (mensagem == null || mensagem.equalsIgnoreCase("sair")) {
                            saida.println("Ate logo!");
                            break;
                        }

                        System.out.println("[Cliente " + clienteSocket.getInetAddress() + "] Respondeu: " + mensagem);

                        // Verifica resposta
                        if (servidor.verificarResposta(mensagem)) {
                            saida.println("Correto! Muito bem!");
                        } else {
                            saida.println("Errado! A resposta era: " + servidor.getSegundaParte());
                        }
                    }

                    clienteSocket.close();
                    System.out.println("Cliente " + clienteSocket.getInetAddress() + " desligado.");

                } catch (IOException e) {
                    System.out.println("Erro com cliente: " + e.getMessage());
                }
            });

            t.start();
        }
    }
}