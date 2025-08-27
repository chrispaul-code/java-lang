
import java.util.Scanner;

class PalindromeRange {
    
    // A function to check if n is palindrome
    static int isPalindrome(int n) {
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        return (n == rev)? 1:0;
    }
    
    // Prints palindrome numbers between min and max
    static void countPal(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)==1) {
                System.out.print(i + " ");
            }
        }
    }
    
    // Driver Code
    public static void main(String args[]) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for min and max values
        System.out.print("Enter the lower limit (min): ");
        int min = scanner.nextInt();

        System.out.print("Enter the upper limit (max): ");
        int max = scanner.nextInt();

        // Print palindrome numbers in the range
        System.out.println("Palindromic numbers between " + min + " and " + max + ":");
        countPal(min, max);

        // Close the scanner
        // scanner.close();
    }
}
