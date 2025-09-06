package githubcopilot;

/*
 * CalculatorOptimized provides basic arithmetic operations using an enum to represent
 * the operation type and a centralized calculation method.
 */
public class CalculatorOptimized {

    /*
     * Operation enum defines supported arithmetic operations.
     */
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    /*
     * Main method to demonstrate calculator operations.
     * Iterates over all Operation values and prints the result of each operation
     * for sample inputs.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.println(op.name() + ": " + calculate(op, a, b));
        }
    }

    /*
     * Performs the specified arithmetic operation on two integers.
     *
     * @param op the operation to perform (ADD, SUBTRACT, MULTIPLY, DIVIDE)
     * @param a the first operand
     * @param b the second operand
     * @return the result of the operation as a double
     * @throws IllegalArgumentException if division by zero is attempted
     * @throws UnsupportedOperationException if an unknown operation is provided
     */
    public static double calculate(Operation op, int a, int b) {
        switch (op) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) throw new IllegalArgumentException("Division by zero is not allowed.");
                return (double) a / b;
            default:
                throw new UnsupportedOperationException("Unknown operation");
        }
    }
}