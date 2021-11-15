package com.pb.dn281178rnn.hw7;

class Skirt extends Clothes implements WomenClothes {
    public Skirt(Size size, String color) {
        super(size, color);
    }

    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка: \n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
