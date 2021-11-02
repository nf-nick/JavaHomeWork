package com.pb.dn281178rnn.hw6;

public class Animal {
    private String food;
    private String location;

    public void makeNoise(){
        System.out.println("шумит");
    }

    public void eat(){
        System.out.println("eating");
    }

    public void sleep(){
        System.out.println("sleeping");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
