package exceptiohandling;

public class Browser {

    /**
     * Throws keyword is not handling in the Exception
     * It just throws the exception in the method
     * Never add the try-catch block in the main method
     * Purpose of the throws keyword is by pass the exception from one method to another
     * It is an indentifier, it says i might give the exception to the caller method, so we need to handle it
     */

    //amazon
    public void search() {
        System.out.println("m1 method");
        cart();
    }

    //amazon
    public void cart() {
        System.out.println("m2 method");
        try {
            bankPayment();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Some AE is coming...");
        }

    }

    //HDFC Bank application: Third Party application
    public void bankPayment() throws ArithmeticException {
        System.out.println("bankPayment method");
        int i = 9 / 0;
    }


    //Caller Method: user method
    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.search();

        System.out.println("bye...");
    }
}
