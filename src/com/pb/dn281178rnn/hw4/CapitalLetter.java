package com.pb.dn281178rnn.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        String str = getText();

        String strout = ""; //Переменная для результата
        strout = strout + str.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < str.length(); i++) { // Перебираем строку далее, если слева пробел, то следующая буква должна быть большой
            if (" ".equals(str.substring(i - 1, i))) strout = strout + str.substring(i, i + 1).toUpperCase();
            else strout = strout + str.charAt(i);
        }
        System.out.println("Результат:");
        System.out.println(strout);
    }

    public static String getText() {
        Scanner fraze = new Scanner(System.in);
         String text=fraze.nextLine();
        return text;
    }

}
