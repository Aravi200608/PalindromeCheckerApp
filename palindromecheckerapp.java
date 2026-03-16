/**
 * @author Aravina
 * @version 10.0
 * Use Case 10: Case-Insensitive and Space-Ignored Palindrome
 */
public class palindromecheckerapp {

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama";

        // Normalize - remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Reverse normalized string
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Compare
        boolean isPalindrome = normalized.equals(reversed);

        System.out.println("Input : " + word);
        System.out.println("Normalized : " + normalized);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}