import java.util.Scanner;

class Employee {
    String name;
    int empId;
    double salary;

    // Constructor to initialize Employee attributes
    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        
        // Creating an Employee object
        Employee emp1 = new Employee(name, empId, salary);
        
        // Displaying the employee details
        emp1.displayDetails();
        
        scanner.close();
    }
}

/*
 * Input:
 * Enter Employee Name: John Doe
 * Enter Employee ID: 101
 * Enter Salary: 50000
 * 
 * Output:
 * Employee Name: John Doe
 * Employee ID: 101
 * Salary: 50000.0
 */
