package com.pb.dn281178rnn.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Tshirt(Size.XS, "Синий", 350),
                new Tshirt(Size.L, "Белый", 250),
                new Pants(Size.M, "Черный", 500),
                new Pants(Size.XXS, "Тёмно-синий", 225),
                new Skirt(Size.S, "Черный", 400),
                new Skirt(Size.M, "Розовый", 520),
                new Tie(Size.L, "Коричневый", 300),
                new Tie(Size.L, "Голубой", 280),
        };

        Atelier set = new Atelier();
        set.dressMan(clothes);
        System.out.println();
        set.dressWomen(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}

