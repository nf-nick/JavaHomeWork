package com.pb.dn281178rnn.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + num1 + " " + operation + " " + num2 + " = " + result);
    }

    // Создаем метод getInt, который будет обеспечивать ввод входящих данных
    public static int getInt() {
        System.out.println("Введите целое число:");
        int num;
        // Проверяем введенные данные на соответствие числовому типу  int
        if (data.hasNextInt()) {
            num = data.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
            data.next();
            // Перегружаем метод для повторного ввода
            num = getInt();
        }
        return num;
    }

    // Создаем метод  для ввода операции
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        // Проверяем введенные данные на соответствие типу char
        if (data.hasNext()) {
            operation = data.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Повторите ввод.");
            data.next();
            // Перегружаем метод для повторного ввода
            operation = getOperation();
        }
        return operation;
    }

    // Создаем метод  для вычислений
    public static int calc(int num1, int num2, char operation) {
        int result =0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! Попытка деления на ноль. Пeрезапустите программу.");
                    System.exit(0);
                    break;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                // На случай если введена не правильная операция повторяем ввод операции перегрузкой метода
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}