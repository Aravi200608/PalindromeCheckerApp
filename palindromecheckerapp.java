package PalindromeCheckerApp;

import java.util.Scanner;

/**
 * @author Aravina
 * @version 3.0
 * Use Case 3: User Input Palindrome Validation
 */
public class palindromecheckerapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equals(reversed);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
