package com.kodilla.booksfifo;

public class Book {String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    // getters
    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}
