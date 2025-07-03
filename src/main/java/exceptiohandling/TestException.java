package exceptiohandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TestException {

    public static void main(String[] args) {

        int i = 9 / 0; //Run time Exception

        try {
            FileInputStream fileInputStream = new FileInputStream("test.xls"); //Compile Time Exception
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // int p==20; //Syntax Error

        try {
            Thread.sleep(5000L); // Compile Time Exception
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
         * Compile Time Exception are also known as Checked Exception
         * Run Time Exceptions are also known as Unchecked Exception
         * 90% cases we will get the Run Time exception
         * We have to handle it for both Compile Time and Run Time Exception
         * All the Exception needs to define at the Server level. This should be outside the main method
         */

    }
}
