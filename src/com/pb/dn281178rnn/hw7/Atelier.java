package com.pb.dn281178rnn.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TeeShirt(Size.XS, "Синий", 350),
                new TeeShirt(Size.L, "Белый", 250),
                new Trousers(Size.M, "Черный", 500),
                new Trousers(Size.XXS, "Тёмно-синий", 225),
                new Skirt(Size.S, "Черный", 400),
                new Skirt(Size.M, "Розовый", 520),
                new Tie(Size.L, "Коричневый", 300),
                new Tie(Size.L, "Голубой", 280),
        };

        Atelier studio = new Atelier();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
    }

    public void dressMale(Clothes[] clothes) {
        System.out.println("Мужская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Женская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}

