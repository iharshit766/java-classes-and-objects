class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs." + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("Harshit", "123456789", 5000);
        
        // Performing transactions
        account1.displayBalance();
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.displayBalance();
    }
}

/*
Input:
Initial Balance: Rs.5000
Deposit: Rs.2000
Withdraw: Rs.1500

Output:
Account Holder: Harshit
Account Number: 123456789
Current Balance: Rs.5000
Deposited: Rs.2000
Withdrawn: Rs.1500
Account Holder: Harshit
Account Number: 123456789
Current Balance: Rs.5500
*/
