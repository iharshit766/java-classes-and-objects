class PalindromeChecker {
    private String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanedText.length() - 1;
        
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a PalindromeChecker object
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        
        // Displaying results
        checker1.displayResult();
        checker2.displayResult();
    }
}

/*
Input:
Text: "Madam"
Text: "Hello"

Output:
The text "Madam" is a palindrome.
The text "Hello" is not a palindrome.
*/
