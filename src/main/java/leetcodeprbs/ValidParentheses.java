package leetcodeprbs;

import java.util.Stack;

public class ValidParentheses {

    /*Problem: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    An input string is valid if open brackets are closed by the same type of brackets in the correct order.*/

    public boolean isValid(String s) {
        // Use a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If it's a closing bracket
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                // Pop the top opening bracket
                char top = stack.pop();

                // Check if the closing bracket matches the last opening bracket
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        // Return true if stack is empty (all brackets matched)
        return stack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();

        // Test cases
        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([])")); // true
        System.out.println(solution.isValid("([)]")); // false
    }

}
