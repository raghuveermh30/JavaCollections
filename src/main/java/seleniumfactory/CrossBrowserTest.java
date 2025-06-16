package seleniumfactory;

public class CrossBrowserTest {

    public static void main(String[] args) {

        String browser = "chrome";

        if (browser.equals("chrome")) {
            System.out.println("Launch chrome");
        }
        else if (browser.equals("firefox")) {
            System.out.println("Launch Firefix");
        }
        else if (browser.equals("safari")) {
            System.out.println("Launch safari");
        }
        else {
            System.out.println("Please pass the correct browser");
        }

    }
}
