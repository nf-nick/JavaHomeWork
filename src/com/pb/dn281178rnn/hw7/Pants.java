package com.pb.dn281178rnn.hw7;

class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(Size size, String color) {
        super(size, color);
    }

    public Pants(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны:\n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
