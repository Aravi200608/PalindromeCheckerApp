import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Aravina
 * @version 12.0
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 */

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}

// Stack Strategy - LIFO
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return word.equals(reversed);
    }
}

// Deque Strategy - Double Ended Queue
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class - Injects strategy at runtime
class PalindromeContext {
    private PalindromeStrategy strategy;

    // Inject strategy
    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    // Execute strategy
    public boolean execute(String word) {
        return strategy.checkPalindrome(word);
    }
}

public class palindromecheckerapp {
    public static void main(String[] args) {
        String word = "madam";

        // Using Stack Strategy
        PalindromeContext context1 = new PalindromeContext(new StackStrategy());
        System.out.println("Input : " + word);
        System.out.println("Stack Strategy - Is Palindrome? : " + context1.execute(word));

        // Using Deque Strategy
        PalindromeContext context2 = new PalindromeContext(new DequeStrategy());
        System.out.println("Input : " + word);
        System.out.println("Deque Strategy - Is Palindrome? : " + context2.execute(word));
    }
}