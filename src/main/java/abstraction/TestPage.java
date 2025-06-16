package abstraction;

public class TestPage {

    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        LoginPage loginPage1 = new LoginPage(10);
        LoginPage loginPage2 = new LoginPage(10,20);
        loginPage.title();
        loginPage.url();
        loginPage.getUserDetails();
        loginPage.loading();
        loginPage.doLogin();

        System.out.println("******************");

        //TopCasting
        Page page = new LoginPage();
        page.title();
        page.displayLogo();
        page.loading();
        page.url();


    }
}
