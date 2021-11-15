package com.pb.dn281178rnn.hw7;

class Tshirt extends Clothes implements ManClothes, WomenClothes {
    public Tshirt(Size size, String color) {
        super(size, color);
    }

    public Tshirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка:\n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
