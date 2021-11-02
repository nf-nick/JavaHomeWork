package com.pb.dn281178rnn.hw5;

public class Library {
    public static void main(String[] args) {

        //С пользователями не заморачивался...

        Reader reader1 = new Reader("Иванов И. И.", 1, "ПБ ИТ", "21.10.1999", "+380975555555");
        Reader reader2 = new Reader("Петров А. И.", 2, "ФЭИ", "11.11.1977", "+380672222222");
        Reader reader3 = new Reader("Сидоров Д. А.", 3, "ФИТ", "05.04.2001", "+380957777777");
        Reader[] readers = {reader1, reader2, reader3};

        //Да и скнигами тоже, впрочем заморачиваться не стал, цель ведь не в этом :)
        Book book1 = new Book("Приключения", "Иванов И. И.","2000 г.");
        Book book2 = new Book("Словарь", "Сидоров А. В.","1980 г.");
        Book book3 = new Book("Энциклопедия", "Гусев К. В.","2010 г.");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);


        //
        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2,book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}


