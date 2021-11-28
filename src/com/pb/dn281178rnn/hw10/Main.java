package com.pb.dn281178rnn.hw10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integer NumBox: ");
        NumBox<Integer> intArr = new NumBox<>(3);
        intArr.add(12);
        intArr.add(38);
        intArr.add(64);
        intArr.add(78);
        System.out.println("Размер массива: " + intArr.length());
        System.out.println("Сумма элементов: " + intArr.sum());
        System.out.println("Среднее значение: " + intArr.average());
        System.out.println("Максимальное значение: " + intArr.max()+"\n");

        System.out.println("Float NumBox: ");
        NumBox<Float> floatArr = new NumBox<>(4);
        floatArr.add(1.35f);
        floatArr.add(2.8f);
        floatArr.add(5.1f);
        floatArr.add(9.57f);
        System.out.println("Размер массива: " + floatArr.length());
        System.out.println("Сумма элементов: " + floatArr.sum());
        System.out.println("Среднее значение: " + floatArr.average());
        System.out.println("Максимальное значение: " + floatArr.max());
    }
}