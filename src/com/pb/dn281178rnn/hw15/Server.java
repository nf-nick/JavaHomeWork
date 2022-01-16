package com.pb.dn281178rnn.hw15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class Server {
    private static final List<Handler> handlers = new CopyOnWriteArrayList<>();


    static class Handler implements Runnable {
        private final static AtomicInteger connections = new AtomicInteger(0);
        private final int chatNumber;
        private final Socket clientSocket;
        private PrintWriter out;

        public Handler(Socket clientSocket) {
            this.clientSocket = clientSocket;
            handlers.add(this);
            chatNumber = connections.incrementAndGet();
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException ex) {
                ex.getStackTrace();
            }
            System.out.println("Клиент " + chatNumber + " подключился");

            BufferedReader in = null;

            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException ex) {
                System.out.println("Ошибка обмена данных");
                System.exit(-1);
            }

            String clientMessage;

            try {
                while ((clientMessage = in.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break;
                    }
                    print(clientMessage);
                }
            } catch (IOException ex) {
                ex.getStackTrace();
            }

            handlers.remove(this);
            try {
                out.close();
                in.close();
                clientSocket.close();
            } catch (IOException ex) {
                ex.getStackTrace();
            }
            print("Покинул чат");
        }

        public void print(String message) {
            for (Handler handler : handlers)
                handler.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")) + ": Клиент " + chatNumber + ": " + message);
        }

    }


    public static void main(String[] args) throws Exception {
        System.out.println("Запуск сервера");
        int serverPort = 1234;
        ServerSocket server = null;
        Socket clientSocket;


        try {
            server = new ServerSocket(serverPort);
        } catch (IOException e) {
            System.out.println("Ошибка связи с портом " + serverPort);
            System.exit(-1);
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        System.out.println("Ожидание соединения");
        while (true)
            try {
                clientSocket = server.accept();
                threadPool.submit(new Handler(clientSocket));
            } catch (IOException e) {
                System.out.println("Не удалось установить соединение");
                System.exit(-1);
            }

    }

}