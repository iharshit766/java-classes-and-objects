import java.util.Scanner;

class Item {
    // Fields (Attributes)
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();
        
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        
        // Creating an Item object
        Item item = new Item(itemCode, itemName, price);
        
        // Displaying item details
        item.displayDetails();
        
        // Calculating and displaying total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
        
        scanner.close();
    }
}

/*
 * Input:
 * Enter Item Code: I101
 * Enter Item Name: Laptop
 * Enter Price: 50000
 * Enter Quantity: 2
 * 
 * Output:
 * Item Code: I101
 * Item Name: Laptop
 * Price: 50000.0
 * Total Cost for 2 items: 100000.0
 */
