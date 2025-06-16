package superpackage;

public class Browser {

    String name;
    double version;

    public void addBrowser(String name, double version) {
        this.name = name;
        this.version = version;
        System.out.println(name);
        System.out.println(version);

    }

    public static void main(String[] args) {

        Browser browser = new Browser();
        browser.addBrowser("chrome", 124.45);


    }
}
