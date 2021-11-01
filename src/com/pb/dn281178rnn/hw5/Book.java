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
//набор геттеров для доступа к приватным полям класса

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    // В текущем виде  сеттеры никак не используются, созданны "на всякий случай"
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String author) {
        this.date = date;
    }
    //запрос информации о книге
    public String getInfo() {
        return "'" + name + "' ("  + author + " "+date+")";
    }
}