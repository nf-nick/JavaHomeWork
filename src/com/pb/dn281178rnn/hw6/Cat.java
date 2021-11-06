package com.pb.dn281178rnn.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String color;


    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мя-я-я-я-я-я-у-у-у-у-у";
    }

    /*
    equals и hashCode в данной реализации смысла не имеют, но усложнять не стал. Принцип понятен.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }


    @Override
    public String toString() {
        return "Кот." + "\n" +
                "Еда: " + getFood() + "\n" +
                "Живёт: " + getLocation() + "\n" +
                "Цвет: " + color + "\n";

    }
}