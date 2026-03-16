import java.util.Stack;

/**
 * @author Aravina
 * @version 5.0
 * Use Case 5: Stack Based Palindrome Check
 */
public class palindromecheckerapp {
    public static void main(String[] args) {
        String word = "madam";

        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        boolean isPalindrome = word.equals(reversed);
        System.out.println("Input : " + word);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}