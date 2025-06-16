package singletonpattenconcept;

public class BrowserClone {

    public static void main(String[] args) {

        Browser instance1 = Browser.getInstance();
        try {
            Browser instance2 = (Browser) instance1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
