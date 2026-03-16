/**
 * @author Aravina
 * @version 11.0
 * Use Case 11: Object-Oriented Palindrome Service
 */

// PalindromeChecker class - Encapsulates palindrome logic
class PalindromeChecker {

    // Single Responsibility - only checks palindrome
    public boolean checkPalindrome(String word) {

        // Normalize - remove spaces and lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Reverse using StringBuilder
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Return result
        return normalized.equals(reversed);
    }
}

public class palindromecheckerapp {
    public static void main(String[] args) {

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Test words
        String word1 = "madam";
        String word2 = "hello";
        String word3 = "A man a plan a canal Panama";

        System.out.println("Input : " + word1);
        System.out.println("Is Palindrome? : " + checker.checkPalindrome(word1));

        System.out.println("Input : " + word2);
        System.out.println("Is Palindrome? : " + checker.checkPalindrome(word2));

        System.out.println("Input : " + word3);
        System.out.println("Is Palindrome? : " + checker.checkPalindrome(word3));
    }
}