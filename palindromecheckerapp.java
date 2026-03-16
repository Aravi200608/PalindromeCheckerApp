/**
 * @author Aravina
 * @version 9.0
 * Use Case 9: Recursive Palindrome Checker
 */
public class palindromecheckerapp {

    // Recursive method to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }
        // Compare start and end characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        System.out.println("Input : " + word);
        System.out.println("Is Palindrome? : " + result);
    }
}