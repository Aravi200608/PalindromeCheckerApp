import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Aravina
 * @version 7.0
 * Use Case 7: Deque Based Optimized Palindrome Checker
 */
public class palindromecheckerapp {
    public static void main(String[] args) {
        String word = "madam";

        // Insert characters into Deque
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear elements
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + word);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}