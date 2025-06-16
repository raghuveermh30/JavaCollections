package javasessions;

public class TestMethod {

    public void getMail() {
        System.out.println("get mail");
    }

    public static void sendMail() {
        System.out.println("Send Mail");
    }

    public static void sendMail(int a) {
        System.out.println("Send Mail");
    }

    public static void sendMail(int a, int b) {
        System.out.println("Send Mail");
    }

    public void sendMail(String str) {
        System.out.println("Send Mail");
    }
    public static void main(String[] args) {

        //How to access the static method
        //1. using class name
        TestMethod.sendMail();
        //2. using Directly
        sendMail();

        //How to call the non-static method --> Create the object

        TestMethod testMethod = new TestMethod();
        testMethod.getMail();
       // testMethod.sendMail(); --> Warning -- not recommonded



    }
}
