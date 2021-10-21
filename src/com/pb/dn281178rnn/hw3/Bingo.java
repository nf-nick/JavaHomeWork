package com.pb.dn281178rnn.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        int y = 0; //число попыток
        int x;  //переменная для вводимого числа
        System.out.println("Угадайте число от 0 до 100.");
        int num = getRandom(); //загадываем число отдельным методом
//      do/while для того чтобы запрос отработал минимум 1 раз
        do {
            x = getInt(); //ввод данных с контролем ввода в отдельном методе

            if (x == num) {
                System.out.println("Вы угадали");
                System.out.println("Число попыток - " + y);
                System.out.println("End Game");
                System.exit(0);
            }

            if (x < num) {
                System.out.println("Загаданное число больше. Попробуйте еще раз");
                y++;
            } else {
                System.out.println("Загаданное число меньше. Попробуйте еще раз");
                y++;
            }
        } while (getRepeat()); // запрос на продолжение/выход
        //
        System.out.println("Число попыток - " + y);
        System.out.println("Конец игры");
    }

    // Генерируем случайное число в диапазоне 0-100.
    public static int getRandom() {
        Random random = new Random();
        int num = random.nextInt(100);
        return num;
    }

    private static boolean getRepeat() {
        String yes = "Y";
        String no = "N";
        System.out.println("Желаете продолжить? Y/N");
        Scanner repeat = new Scanner(System.in);
        String ansver;

        ansver = repeat.nextLine();


        if (yes.equals(ansver.toUpperCase())) {

            return true;
        }
        if (no.equals(ansver.toUpperCase())) {
            return false;
        } else {
            System.out.println("Ввод не распознан. Введите только оду букву Y или N");
            getRepeat();
        }

        return true;
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
