package com.pb.dn281178rnn.hw6;

import java.lang.reflect.Constructor;


public class VetClinic {
    public static void main(String[] args) throws Exception {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо", "Двор", "Тузик");
        animals[1] = new Cat("Молоко и рыба", "Квартира", "Black");
        animals[2] = new Horse("Сено", "Сарай", 100.500);


        for (Animal animal : animals) {
            System.out.println("На приём пришел:");
            veterinarian.treatAnimal(animal);
            System.out.print("Издаёт звук: ");
            System.out.println(animal.makeNoise());
            animal.eat();
            System.out.println();

        }
        System.out.println("***************************");
        System.out.println();

        Class clazz = Class.forName("com.pb.dn281178rnn.hw6.Veterinarian");
        Constructor construkt = clazz.getConstructor(new Class[]{});
        Object obj = construkt.newInstance();
        System.out.println("Создан объект калсса Veterinarian");
        System.out.println(obj);
        System.out.println("так как класс Veterinarian не имеет ни параметров ни конструкторов, то выводить особо нечего");


    }
}