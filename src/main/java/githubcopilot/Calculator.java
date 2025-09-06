package githubcopilot;

/*
 * Calculator class provides basic arithmetic operations: addition, subtraction,
 * multiplication, and division.
 */
public class Calculator {

    /*
     * Main method to demonstrate calculator operations.
     * Prints the results of addition, subtraction, multiplication, and division
     * for sample inputs.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 5));
    }

    /*
     * Adds two integers.
     *
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /*
     * Subtracts the second integer from the first.
     *
     * @param a first operand
     * @param b second operand
     * @return the result of a minus b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /*
     * Multiplies two integers.
     *
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /*
     * Divides the first integer by the second.
     *
     * @param a numerator
     * @param b denominator
     * @return the result of a divided by b as a double
     * @throws IllegalArgumentException if b is zero
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

}