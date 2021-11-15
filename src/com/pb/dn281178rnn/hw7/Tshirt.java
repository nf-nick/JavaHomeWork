package com.pb.dn281178rnn.hw7;

class TeeShirt extends Clothes implements ManClothes, WomenClothes{
    public TeeShirt(Size size, String color) {
        super(size, color);
    }

    public TeeShirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка:\n" + "Размер - " + getSize() + "\nЦена - " + getCost() + " грн" + "\nЦвет - " + getColor() + "\n";
    }
}
