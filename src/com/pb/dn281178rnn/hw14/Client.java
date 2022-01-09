package com.pb.dn281178rnn.hw14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("Запуск клиента");
        String serverIp = "127.0.0.1";
        int serverPort = 1234;
        System.out.println("Соединение с сервером " + serverIp + ":" + serverPort);

        try (Socket server = new Socket(serverIp, serverPort);
             BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
             BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter outServer = new PrintWriter(server.getOutputStream(), true)
        ) {

            Thread listener = new Thread(() -> {
                String dataFromServer;
                try {
                    while ((dataFromServer = inServer.readLine()) != null)
                        System.out.println(dataFromServer);
                } catch (IOException ex) {
                    ex.getStackTrace();
                }
            });
            listener.start();

            String dataFromUser;
            while ((dataFromUser = inConsole.readLine()) != null) {
                outServer.println(dataFromUser);

                if ("exit".equalsIgnoreCase(dataFromUser)) {
                    break;
                }
            }

        } catch (Exception ex) {
            ex.getStackTrace();
            System.out.println("Завершение работы клиента");
        }
    }
}