package com.Library_Management_System;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create books
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Python Basics", "Guido van Rossum");
        Book b3 = new Book("C++ Guide", "Bjarne Stroustrup");

        // Borrow and return simulation
        b1.borrowBook(); 
        b1.borrowBook(); 
        b1.returnBook(); 
        b1.returnBook(); 

        // Print all available books
        System.out.println("\nAvailable Books:");
        Book[] library = {b1, b2, b3};
        for (Book b : library) {
            if (b.available) {
                b.display();
            }
        }
    }
}
