package builderpattern;

public class Application {

    public Application login() {
        System.out.println("Login to App");
        return this;
    }

    public Application login(String uname, String pwd) {
        System.out.println("Login to application using username" + uname + " Password " + pwd);
        return this;
    }

    public Application search(String productName) {
        System.out.println("Searching the Product name " + productName);
        return this;
    }

    public Application search(String productName, int price) {
        System.out.println("Searching the Product name " + productName + " with Price is " + price);
        return this;
    }

    public Application addToCart(String productName) {
        System.out.println("Adding to the cart " + productName);
        return this;
    }

    public Application doPayment(String upi) {
        System.out.println("Making Payment using UPI " + upi);
        return this;
    }

    public Application doPayment(String cc, int cvv) {
        System.out.println("Making Payment using credit card " + cc + " cvv is " + cvv);
        return this;
    }

    public Application generateOrder() {
        System.out.println("your order number is " + 12345);
        return this;
    }

    public Application logout() {
        System.out.println("Logging out from the application");
        return this;
    }

}
