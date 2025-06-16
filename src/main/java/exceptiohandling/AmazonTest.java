package exceptiohandling;

public class AmazonTest {

    public static void main(String[] args) {

        String browser = "opera";

        switch (browser.toLowerCase().trim()) {
            case "chorme":
                System.out.println("Chrome Browser is Launched");
                break;
            case "ie":
                System.out.println("IE Browser is Launched");
                break;
            case "edge":
                System.out.println("Edge Browser is Launched");
                break;
            case "safari":
                System.out.println("safari Browser is Launched");
                break;
            default:
                System.out.println("Please pass the correct browser name " + browser);
                throw new MyException("**** Wrong Browser Passed *****");
        }

        System.out.println("launch URL");
        System.out.println("Login to app");
        System.out.println("shop the product");
        System.out.println("Close the Browser");
    }
}
