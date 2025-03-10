import java.util.Scanner;

class Circle {
    // Field (Attribute)
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Creating a Circle object
        Circle circle = new Circle(radius);
        
        // Displaying circle details
        circle.displayDetails();
        
        scanner.close();
    }
}

/*
 * Input:
 * Enter the radius of the circle: 5
 * 
 * Output:
 * Radius: 5.0
 * Area: 78.53981633974483
 * Circumference: 31.41592653589793
 */
