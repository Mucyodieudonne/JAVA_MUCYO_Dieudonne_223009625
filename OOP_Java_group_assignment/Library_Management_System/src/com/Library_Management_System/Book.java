package com.Library_Management_System;

class Book {
    String title;
    String author;
    boolean available;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; 
    }

    // Borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed!");
        }
    }

    // Return a book
    void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Show book details
    void display() {
        System.out.println(title + " by " + author + " | Available: " + available);
    }
}