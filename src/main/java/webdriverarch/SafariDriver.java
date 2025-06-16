package webdriverarch;

public class SafariDriver implements WebDriver {

    public SafariDriver(){
        System.out.println("Launch SafariDriver Browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Enter the URL " + url);
    }

    @Override
    public String getTitle() {
        return "Google";
    }

    @Override
    public void click(String element) {
        System.out.println("Clicking on the element " + element);
    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Entering the value : " + value + "into field " + element);
    }

    @Override
    public void close() {
        System.out.println("Close Browser");
    }
}
