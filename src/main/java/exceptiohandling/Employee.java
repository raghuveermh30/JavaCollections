package exceptiohandling;

public class Employee {

    String name;

    public static void main(String[] args) {

        /**
         * Exception means suddently my code is terminated due to that my Program is terminated and I cannot proceed with further
         * Try and Catch are both together
         * Try can be written along with finally keyword
         * When any exception is coming then immideatly it will go to catch block
         * super class of Exception is Throwable
         * Throwable's Parent is Object class, we cannot use Object class for Exception Handling
         * Error is class, Throwable is a parent of Error class
         * We can use Try catch with Error also
         * Errors cannot handle the Exception
         * Exception handling is limited to only till Throwable
         */

        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        try {
            Employee employee = new Employee();
            //employee = null; //NPE
            employee.name = "Naveen";

            int i = 9 / 0; //ArithmeticException
            System.out.println("hello"); // this won;t be called

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is coming");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exceptions");
            e.getMessage();
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("some Exception is coming " + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Some Exception is coming" + e.getMessage());
            e.printStackTrace();
        }

       /* catch (Error e){
            System.out.println("some error is coming");
            e.printStackTrace();
        }*/

        System.out.println("Bye");

    }
}
