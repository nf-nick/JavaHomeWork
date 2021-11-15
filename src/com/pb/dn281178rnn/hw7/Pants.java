package com.pb.dn281178rnn.hw7;

class Trousers extends Clothes implements ManClothes, WomenClothes{
    public Trousers(Size size, String color) {
        super(size, color);
    }

    public Trousers(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны:\n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
