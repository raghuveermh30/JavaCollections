package exceptiohandling;

public class ThrowKeyword {

    /**
     * Throw keyword means we can define the custom Exception
     * We can define the custom Exception using Throw keyword
     * Throw new cannot be called using try-catch block
     */

    public static void main(String[] args) {

        String data = null;

        if (data == null) {

            throw new RuntimeException("Data Not Found Exception"); //throwing the custom Exception
        }

        System.out.println("bye!!"); //Unreachable Code/DeadCode

    }
}
