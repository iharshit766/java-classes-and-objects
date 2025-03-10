class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs." + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Inception", 12, 250.50);
        
        // Displaying ticket details
        ticket1.displayTicket();
    }
}

/*
Input:
Movie: "Inception"
Seat Number: 12
Price: Rs.250.50

Output:
Movie: Inception
Seat Number: 12
Price: Rs.250.5
*/
