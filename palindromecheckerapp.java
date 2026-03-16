import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aravina
 * @version 6.0
 * Use Case 6: Queue + Stack Based Palindrome Check
 */
public class palindromecheckerapp {
    public static void main(String[] args) {
        String word = "madam";

        // Queue - FIFO
        Queue<Character> queue = new LinkedList<>();
        for (char c : word.toCharArray()) {
            queue.add(c);
        }

        // Stack - LIFO
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + word);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}