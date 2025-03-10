import java.util.Scanner;

class MobilePhone {
    // Fields (Attributes)
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Mobile Brand: ");
        String brand = scanner.nextLine();
        
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        // Creating a MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);
        
        // Displaying mobile phone details
        phone.displayDetails();
        
        scanner.close();
    }
}

/*
 * Input:
 * Enter Mobile Brand: Samsung
 * Enter Model: Galaxy S21
 * Enter Price: 79999.99
 * 
 * Output:
 * Brand: Samsung
 * Model: Galaxy S21
 * Price: 79999.99
 */
