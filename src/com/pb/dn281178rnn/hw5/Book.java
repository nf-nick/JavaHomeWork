package com.pb.dn281178rnn.hw5;

public class Book {
    private String name;
    private String author;
    private String date;


    public Book(String name, String author, String date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String author) {
        this.date = date;
    }

    public String getInfo() {
        return "'" + name + "' ("  + author + " "+date+")";
    }
}