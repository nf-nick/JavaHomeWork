package com.pb.dn281178rnn.hw2;
import java.util.Scanner;

public class Interval {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getInt();
        if (num >= 0 && num <= 14) {
            System.out.println("Введенное число " + num + " относится к диапазону [0 - 14]");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Введенное число " + num + " относится к диапазону [15 - 35]");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Введенное число " + num + " относится к диапазону [36 - 50]");
        } else if (num >= 51 && num <= 100) {
            System.out.println("Введенное число " + num + " относится к диапазону [51 - 100]");
        } else {
            System.out.println("Введенное число " + num + " не относится ни к ни одному из заданых диапазонов");
        }
    }

    // для обработки ввода и проверки создаем метод getInt
    public static int getInt() {
        System.out.println("Введите число: ");
        int num;
        if (input.hasNextInt()) {
            num = input.nextInt();
        } else {
            System.out.println("Ошибка ввода, повторите ввод.");
            input.next();
            num = getInt(); //перезагрузка метода в случае если введены не цифры
        }
        return num;
    }

}