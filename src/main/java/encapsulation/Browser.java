package encapsulation;

public class Browser {

    public void launchBrowser() {
        System.out.println("Launching Browser");
        checkRamSize();
        checkBrowserUpdates();
        verifyStorage();
        checkBrowserPolicy();
        System.out.println("chrome browser is Launched");
        // This is also called encapsulation
    }

    private void checkRamSize() {
        System.out.println("Check Ram Size");
    }

    private void checkBrowserUpdates() {
        System.out.println("Check Browser Updates");
    }

    private void verifyStorage() {
        System.out.println("Verify Storage");
    }

    private void checkBrowserPolicy() {
        System.out.println("Check Browser Policy");
    }


}
