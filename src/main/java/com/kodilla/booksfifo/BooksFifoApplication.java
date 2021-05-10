package com.kodilla.booksfifo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayDeque;

@SpringBootApplication
class BooksFifoApplication {

    public static void main (String[] args) throws java.lang.Exception
    {
        // Create 3 sample books
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book("4th book", "Gal Anonim", 2021);
        Book theBook5 = new Book("5th book", "Me, myself and I", 2020);


        // Create the FIFO queue
        ArrayDeque<Book> theBooks = new ArrayDeque<>();

        // Check size of the queue
        System.out.println("Queue is created. It's size: " + theBooks.size());

        // Put the orders into the queue
        theBooks.push(theBook1);
        theBooks.push(theBook2);
        theBooks.push(theBook3);
        theBooks.push(theBook4);
        theBooks.push(theBook5);

        // Check size of the queue
        System.out.println("Queue is filled. It's size: " + theBooks.size());
        System.out.println();

        // Examine the order at beginning of the queue
        System.out.println("First book in the queue is: \n" + theBooks.peek());
        System.out.println();


        // Get objects from queue
        Book temporaryList;
        temporaryList = theBooks.pop();

        // here you can do something with order taken from the queue
        temporaryList = theBooks.pop();
        temporaryList = theBooks.pop();
        temporaryList = theBooks.pop();
        temporaryList = theBooks.pop();

        // Check size of the queue
        System.out.println("Queue is emptied. It's size: " + theBooks.size());
        System.out.println();

        // Check what was taken as last
        System.out.println("Last book taken from queue was:\n" + temporaryList);
        System.out.println();
    }
}

