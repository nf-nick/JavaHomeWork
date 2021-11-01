package com.pb.dn281178rnn.hw5;

public class Book {
    private String bookName;
    private String autor;
    private String year;
    //конструктор класса
    public Book(String bookName, String autor, String year) {
    }

    private static int bookCount = 0;
    public static int getBookCount(){
      return bookCount;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAutor() {
        return autor;
    }

    public String getYear() {
        return year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setYear(String year) {
        this.year = year;
    }

    String bookInfo(){
        System.out.println( "bookinfo" +bookName+autor+year );
        return bookName + " " + autor + " " + year;
}
}
