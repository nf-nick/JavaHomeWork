package com.pb.dn281178rnn.hw5;

public class Library {
    public static void main(String[] args) {


Book book1 = new Book("ABC", "Autor1", "1975");
Book book2 = new Book("CDE", "Autor2", "1981");
Book book3 = new Book("FGH", "Autor3", "2000");
Book book4 = new Book("JHK", "Autor4", "1965");

Reader reader1 =new Reader("User1", "fak1", 991324567, 10001, "19/05/1975");
Reader reader2 =new Reader("User2", "fak2", 939876543, 10002, "25/07/1980");
Reader reader3 = new Reader("user3", "fak3", 950456789, 10003, "01/01/2000");

        book1.bookInfo();


    }



}
