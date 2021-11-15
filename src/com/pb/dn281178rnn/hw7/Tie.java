package com.pb.dn281178rnn.hw7;

class Tie extends Clothes implements ManClothes{
    public Tie(Size size, String color) {
        super(size, color);
    }

    public Tie(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Галстук:\n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
