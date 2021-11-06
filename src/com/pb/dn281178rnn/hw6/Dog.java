package com.pb.dn281178rnn.hw6;


import java.util.Objects;

public class Dog extends Animal {
    private String name;


    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Лает.";
    }

    /*
    equals и hashCode в данной реализации смысла не имеют, но усложнять не стал. Принцип понятен.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Собака." + "\n" +
                "Еда: " + getFood() + " \n" +
                "Живёт: " + getLocation() + "\n" +
                "Имя: " + getName() + "\n";
    }
}