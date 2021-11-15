package com.pb.dn281178rnn.hw7;

public abstract class Clothes {
    private final Size size;
    private final String color;
    private double cost;
// размер и цвет не меняются, поэтому они final и без сеттеров. А вот цены (теоретически) можно менять

    public Clothes(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(Size size, String color, double cost) {
        this(size, color);
        this.cost = cost;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}

