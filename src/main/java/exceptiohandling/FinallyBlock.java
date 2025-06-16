package exceptiohandling;

public class FinallyBlock {

    /**
     * Even Exception is coming or not, it will always execute
     * finally block should be always with try-catch or try block should be there
     * Try will be always looking for finally block
     * The sequence is alwyas try-catch and finally
     * Catch block is always come with try block
     * TRY --CATCH --FINALLY
     * Finally cannot be written without try.
     * Multiple Finally blocks cannot be handled
     * Catch block cannot be with only try block
     *
     */


    public static void main(String[] args) {

        System.out.println('A');
        System.out.println('B');

        System.out.println("*******************");
        try {
            int i = 9 / 3;
        } catch (ArithmeticException e) {
            System.out.println("AE is coming");
        } finally {
            System.out.println("I am finally block");
        }

        System.out.println("*******************");
        try {
            int i = 9 / 3;
            while (true){
                break;
            }
        } finally {
            System.out.println("I am finally block");
        }

    }

}
