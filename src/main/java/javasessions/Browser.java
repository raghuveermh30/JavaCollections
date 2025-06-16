package javasessions;

public class Browser {

    public void click(String element) {
        System.out.println("click on the element" + element);
    }

    public void sendKeys(String element, String value) {
        System.out.println("Entering the value :" + value + " into the element " + element);
    }

    public String getTitle() {
        return "google";
    }

    //WAF: LaunchBrowser(String browserName)
    //browserName: chrome, firefox, IE, safari
    //Print the success messgae
    //Return boolean value it could be true or false

    public boolean launchBrowser(String browserName) {
        System.out.println("Browser Name is " + browserName);
        boolean flag = true;
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Launch Google chrome");
                break;
            case "Firefox":
                System.out.println("Launch Firefox browser");
                break;
            case "Edge":
                System.out.println("Launch Edge browser");
                break;
            default:
                System.out.println("Please pass the right browser " + browserName);
                flag = false;
        }
        return flag;
    }

    /*public void getNumber(int a) {
        System.out.println("hi int " + a);
    }*/

    public void getNumber(short a) {
        System.out.println("hi short " + a);
    }

    public void getNumber(byte a) {
        System.out.println("hi byte " + a);
    }

    public void getNumber(long a) {
        System.out.println("hi long " + a);
    }

    public static void main(String[] args) {

        Browser obj = new Browser();
        boolean exec = obj.launchBrowser("IE");
        System.out.println(exec);
        if (exec) {
            System.out.println("Enter the URL");
        }
        obj.getNumber(100);
        obj.getNumber('a');

    }
}
