package com.pb.dn281178rnn.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int y = 1; //колличество попыток, в любом случае минимум 1
        int x;  //переменная для вводимого числа
        System.out.println("Угадайте число от 0 до 100.");
        int num = getRandom();
        do {
            x = getInt();
            if (x == num) {
                System.out.println("Вы угадали");
                System.out.println("Число попыток - " + y);
                System.exit(0);
            }
            if (x < num) {
                System.out.println("Загаданное число больше. Попробуйте еще раз");
                y++;
            } else {
                System.out.println("Загаданное число меньше. Попробуйте еще раз");
                y++;
            }
        } while (true); // не красиво, но это первое что пришло в голову :)
    }

    // Генерируем случайное число в диапазоне 0-100.
    public static int getRandom() {
        Random random = new Random();
        int num = random.nextInt(100);
        return num;
    }

    // Создаем метод getInt, который будет обеспечивать ввод и контроль вводимых данных
    private static int getInt() {
        Scanner data = new Scanner(System.in);
        System.out.println("Введите число:");
        int x;
        // Проверяем введенные данные на соответствие числовому типу  int
        if (data.hasNextInt()) {
            x = data.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
            data.next();
            // Перегружаем метод для повторного ввода, рекурсия
            x = getInt();
        }
        // Проверяем вхождение введенного числа в заданый диапазон
        if (x < 0 || x > 100) {
            System.out.println("Введенное число вне загаданого диапазона.");
            x = getInt();
        }
        return x;
    }

}
