import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Aravina
 * @version 13.0
 * Use Case 13: Performance Comparison of Palindrome Algorithms
 */
public class palindromecheckerapp {

    // Algorithm 1 - StringBuilder
    static boolean stringBuilderCheck(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // Algorithm 2 - Char Array Two Pointer
    static boolean charArrayCheck(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Algorithm 3 - Stack
    static boolean stackCheck(String word) {
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

    // Algorithm 4 - Deque
    static boolean dequeCheck(String word) {
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

    // Algorithm 5 - Recursive
    static boolean recursiveCheck(String word, int start, int end) {
        if (start >= end) return true;
        if (word.charAt(start) != word.charAt(end)) return false;
        return recursiveCheck(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "amanaplanacanalpanama";

        System.out.println("Input : " + word);
        System.out.println("----------------------------------");

        // Algorithm 1 - StringBuilder
        long start1 = System.nanoTime();
        boolean result1 = stringBuilderCheck(word);
        long end1 = System.nanoTime();
        System.out.println("StringBuilder   - Is Palindrome? : " + result1 + " | Time : " + (end1 - start1) + " ns");

        // Algorithm 2 - Char Array
        long start2 = System.nanoTime();
        boolean result2 = charArrayCheck(word);
        long end2 = System.nanoTime();
        System.out.println("Char Array      - Is Palindrome? : " + result2 + " | Time : " + (end2 - start2) + " ns");

        // Algorithm 3 - Stack
        long start3 = System.nanoTime();
        boolean result3 = stackCheck(word);
        long end3 = System.nanoTime();
        System.out.println("Stack           - Is Palindrome? : " + result3 + " | Time : " + (end3 - start3) + " ns");

        // Algorithm 4 - Deque
        long start4 = System.nanoTime();
        boolean result4 = dequeCheck(word);
        long end4 = System.nanoTime();
        System.out.println("Deque           - Is Palindrome? : " + result4 + " | Time : " + (end4 - start4) + " ns");

        // Algorithm 5 - Recursive
        long start5 = System.nanoTime();
        boolean result5 = recursiveCheck(word, 0, word.length() - 1);
        long end5 = System.nanoTime();
        System.out.println("Recursive       - Is Palindrome? : " + result5 + " | Time : " + (end5 - start5) + " ns");

        System.out.println("----------------------------------");
        System.out.println("Performance Comparison Complete!");
    }
}