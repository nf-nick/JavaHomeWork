package com.pb.dn281178rnn.hw5;

public class Book {
    private String bookName;
    private String autor;
    private int year;
    private static int bookCount = 0;

public Book (String bookName, String autor, int year){
    this(bookName,autor);

}


    public String getBookName(String book3) {
        return bookName;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
