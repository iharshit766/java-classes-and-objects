class Student {
    private String name;
    private int rollNumber;
    private int marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student("Alice", 101, 85);

        // Displaying student details
        student1.displayDetails();
    }
}

/*
Input:
Alice 101 85

Output:
Student Name: Alice
Roll Number: 101
Marks: 85
Grade: B
*/

