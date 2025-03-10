/*
 * Program to handle book details
 */

import java.util.Scanner;

class Book {
    // Fields (Attributes)
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        // Creating a Book object
        Book book = new Book(title, author, price);
        
        // Displaying book details
        book.displayDetails();
        
        scanner.close();
    }
}

/*
 * Input:
 * Enter Book Title: The Alchemist
 * Enter Author: Paulo Coelho
 * Enter Price: 299.99
 * 
 * Output:
 * Book Title: The Alchemist
 * Author: Paulo Coelho
 * Price: 299.99
 */
