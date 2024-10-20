package Data_structure;

 
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis_withStreams {

    // Method to check whether the input string is balanced or not
    public static boolean balancedParenthesis(String inputStr) {
        Stack<Character> stack = new Stack<>();

        return inputStr.chars()
            .mapToObj(c -> (char) c) // Convert int stream to Character stream
            .allMatch(current -> {
                // Check for opening brackets
                if (current == '{' || current == '[' || current == '(') {
                    stack.push(current);
                    return true;
                }
                // If stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }
                // Check for closing brackets
                char popChar = stack.pop();
                switch (current) {
                    case ')':
                        return popChar == '(';
                    case '}':
                        return popChar == '{';
                    case ']':
                        return popChar == '[';
                    default:
                        return true; // Ignore other characters
                }
            }) && stack.isEmpty(); // Finally check if stack is empty
    }

    // Main method start
    public static void main(String[] args) {
        System.out.println("Enter input string to check: ");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        System.out.println("Input String: " + inputStr);

        // Call balancedParenthesis() method to check whether input string is balanced
        if (balancedParenthesis(inputStr)) {
            System.out.println("Input string " + inputStr + " is balanced.");
        } else {
            System.out.println("Input string " + inputStr + " is not balanced.");
        }
    }
}
