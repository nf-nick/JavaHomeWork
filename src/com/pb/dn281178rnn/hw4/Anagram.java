package com.pb.dn281178rnn.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Введите фразу №1");
        String an1 = getString();
        System.out.println("Введите фразу №2");
        String an2 = getString();
        String out1 = "";
        String out2 = "";
        System.out.println("Вы ввели строку № 1: ");
        System.out.println(an1);
        System.out.println("Вы ввели строку № 2: ");
        System.out.println(an2);



        for (char i : an1.toCharArray()) {  // Переводим все буквы первой фразы в нижний регистр
            if (Character.isLetter(i)) {    // попутно отсеивая всё кроме букв
                out1 = out1.toLowerCase() + i;
            } else {
                i++;
            }
        }
        char[] sort1 = out1.toCharArray(); //формируем символьный массив из нашей строки
        Arrays.sort(sort1);                 //сортируем содержимое массива


        for (char i : an2.toCharArray()) {  //Повторяем со второй фразой те же процедуры
            if (Character.isLetter(i)) {    //отсеиваем все кроме букв
                out2 = out2.toLowerCase() + i;
            } else {
                i++;
            }
        }


        char[] sort2 = out2.toCharArray();  //и тоже пихаем в массив символов
        Arrays.sort(sort2);                 //сортируем второй массив


        if (Arrays.equals(sort1, sort2)) {          //сравниваем оба массива

            System.out.println("Эти строки являются анаграммой");
        } else {
            System.out.println("Эти строки не являются анаграммой");
        }


    }

    public static String getString() {
        Scanner anagram = new Scanner(System.in);
        String an = anagram.nextLine();
        return an;
    }

}
