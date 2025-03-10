import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize cart item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Get total cost for this item
    public double getTotalCost() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: Rs." + price + ", Quantity: " + quantity + ", Total: Rs." + getTotalCost());
    }

    // Getter for itemName to allow access in ShoppingCart
    public String getItemName() {
        return itemName;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> items;

    // Constructor to initialize cart
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        items.removeIf(item -> itemName.equals(item.getItemName()));
        System.out.println(itemName + " removed from cart.");
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Cost: Rs." + total);
    }

    // Method to display all cart items
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (CartItem item : items) {
            item.displayItem();
        }
        displayTotalCost();
    }

    // Main method to test the cart functionality
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 1500, 2);
        cart.displayCart();
        cart.removeItem("Mouse");
        cart.displayCart();
    }
}

/*
Input:
Add: Laptop, Rs.50000, Quantity: 1
Add: Mouse, Rs.1500, Quantity: 2
Remove: Mouse

Output:
Laptop added to cart.
Mouse added to cart.
Shopping Cart:
Item: Laptop, Price: Rs.50000.0, Quantity: 1, Total: Rs.50000.0
Item: Mouse, Price: Rs.1500.0, Quantity: 2, Total: Rs.3000.0
Total Cart Cost: Rs.53000.0
Mouse removed from cart.
Shopping Cart:
Item: Laptop, Price: Rs.50000.0, Quantity: 1, Total: Rs.50000.0
Total Cart Cost: Rs.50000.0
*/
