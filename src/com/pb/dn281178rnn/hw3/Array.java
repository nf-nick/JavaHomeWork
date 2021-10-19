package com.pb.dn281178rnn.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {


    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            int c = i + 1; //для отображения нумерации не с нуля, а с 1 :)
            System.out.println("Введите число #" + c);
            int x = getInt(); // Повторяющиеся действия, типа ввода данных вынесены в метод
            mas[i] = x;
        }
        System.out.println("Введены данные:");
        System.out.println(Arrays.toString(mas));
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println("Результат сортировки:");
        System.out.println(Arrays.toString(mas));
    }

    private static int getInt() {
        Scanner data = new Scanner(System.in);

        int x;
        // Проверяем введенные данные на соответствие числовому типу  int
        if (data.hasNextInt()) {
            x = data.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
            data.next();
            // Перегружаем метод для повторного ввода
            x = getInt();
        }
        return x;
    }
}


