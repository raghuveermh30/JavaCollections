package builderpattern;

public class AppTest {

    public static void main(String[] args) {

        /*
         * THIS Keyword
         * this keyword is used to initialise the class/global variables
         * can be used for methods or Constructor
         * can be used for same class Constructor class
         * Recursive constructor calling is not allowed
         * Super and this cannot be together.
         * this if we are using for constructor then this keyword should be first line
         * We can return this keyword from the function: This is called Builder Pattern
         * this keyword will be also used in the encapsulation
         * this keyword cannot be used in the static methods
         */

        Application app = new Application();
       /* app.login();
        app.search("macbook");*/


        //Work flow chain scenario
        app.login("naveen123@gmail.com", "Test123").search("MacBook Pro")
                .addToCart("MacBook Pro 16 inches")
                .doPayment("naveen@okai")
                .generateOrder()
                .logout();


        //2
        app.login("naveen123@gmail.com", "Test123")
                .search("T shirt")
                .addToCart("Nike")
                .logout();


        //3
        app.login("naveen123@gmail.com", "Test123")
                .search("T shirt", 1000)
                .addToCart("T shirt")
                .addToCart("Nike")
                .doPayment("1345566", 123)
                .generateOrder()
                .logout();

        //4
        app.login("naveen123@gmail.com", "Test123")
                .logout();

        //5
        app.login("raghu@gmail.com", "Test1234");

        //6
        app.login()
                .search("Keyboard")
                .addToCart("Apple Keyboard")
                .doPayment("naveen@okai")
                .generateOrder()
                .logout();

    }
}
