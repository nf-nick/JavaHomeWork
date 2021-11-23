package com.pb.dn281178rnn.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNumbers {

    //пути к файлам
    public static String path = ".\\src\\com\\pb\\dn281178rnn\\hw9\\numbers.txt";
    public static String path2 = ".\\src\\com\\pb\\dn281178rnn\\hw9\\odd-numbers.txt";

    public static void main(String[] args) throws IOException, NumberFormatException {
        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile() {
        System.out.println("Создаём файл заполненый случайными числами");
        System.out.println("File " + path);
        int[][] arr = new int[10][10];
        try {
            int count = 1;

            FileWriter writer = new FileWriter(path);
            for (int n = 0; n < 10; n++) {
                for (int m = 0; m < 10; m++) {
                    arr[n][m] = getRandom(1, 99);
                    if (count % 10 == 0) {
                        System.out.println(arr[n][m]);
                        writer.write(arr[n][m] + "\n");
                    } else {
                        System.out.print(arr[n][m] + " ");
                        writer.write(arr[n][m] + " ");
                    }
                    count++;
                }


            }
            System.out.println();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void createOddNumbersFile() {
        System.out.println("Результат замены чётных значений нулями");
        System.out.println("File " + path2);

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(path));
            String line;
            int value;
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(path2));
            while ((line = reader.readLine()) != null) {

                String[] strOut = line.split(" ");
                for (int i = 0; i < strOut.length; i++) {
                    try {
                        value = Integer.parseInt(strOut[i]);
                    } catch (Exception e1) {
                        value = 0;
                    }
                    if (value % 2 == 0) {
                        writer.write(0 + " ");
                        System.out.print(0 + " ");
                    } else {
                        writer.write(strOut[i] + " ");
                        System.out.print(strOut[i] + " ");
                    }
                }
                writer.newLine();
                System.out.println();
            }
            writer.close();
        } catch (Exception e) {

        }
    }

    public static int getRandom(int min, int max) {

        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}