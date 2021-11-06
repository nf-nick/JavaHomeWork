package com.pb.dn281178rnn.hw6;

import java.io.Serializable;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    private double weight;


    public Horse(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Стук копыт.";
    }

    /*
equals и hashCode в данной реализации смысла не имеют, но усложнять не стал. Принцип понятен.
   */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }


    @Override
    public String toString() {
        return "Лошадь. " + "\n" +
                "Еда: " + getFood() + "\n" +
                "Живёт: " + getLocation() + "\n" +
                "Вес: " + weight + "\n";

    }


}