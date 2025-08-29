package abstraction;

public class LoginPage extends Page {

    public LoginPage() {
        System.out.println("Login Page Constructor..this is default constructor");
    }

    public LoginPage(int a) {
        System.out.println("Login Page Constructor..this is default constructor.." +a);
    }

    public LoginPage(int a, int b) {
        System.out.println("Login Page Constructor..this is default constructor.." +(a+b));
    }

    @Override
    public void title() {
        System.out.println("Login Page Title");
    }

    @Override
    public void url() {
        System.out.println("Login Page URL");
    }

    public void getUserDetails() {
        System.out.println("Get User Details");
    }

    @Override
    public void loading(){
        System.out.println("Page Loading is taking 5s");
    }

    public void doLogin(){
        System.out.println("Login Page Loaded");
    }

}
