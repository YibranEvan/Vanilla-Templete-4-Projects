package com.techelevator;

/**
 * Bookstore
 */
public class Bookstore {

    public static void main(String[] args) {

        System.out.println("Welcome to the Tech Elevator Bookstore");
        System.out.println();

//         Step Three: Test the getters and setters
//        Book twoCities = new Book();
//        twoCities.setTitle("A Tale of Two Cities");
//        twoCities.setAuthor("Charles Dickens");
//        twoCities.setPrice(14.99);

       // System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: $" + twoCities.getPrice());

        // Step Five: Test the Book constructor
    Book twoCities = new Book("A Tale of Two Cities", "Charles Dickens", 12.99);
    System.out.println("Title: " + twoCities.getTitle() + ", Author: " + twoCities.getAuthor() + ", Price: $" + twoCities.getPrice());

        // Step Nine: Test the ShoppingCart class
        
    }
}