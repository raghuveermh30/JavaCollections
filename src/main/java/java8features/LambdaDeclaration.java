package java8features;

public class LambdaDeclaration {

    public static void main(String[] args) {

        WebPage webPage = new WebPage() {

            @Override
            public void header(String value) {
                System.out.println("hi " + value);
            }
        };

        WebPage webPage1 = new WebPage() {
            @Override
            public void header(String value) {
                System.out.println("hello " + value);
            }
        };

        webPage.header("google");
        webPage1.header("facebook");

        WebPage webPage3 = (name) -> {
            System.out.println("hi " + name);
        };
        webPage3.header("amazon");

        WebPage webPage4 = (value -> System.out.println(value.toUpperCase()));
        webPage4.header("naveen");

        WebPage webPage5 = (n -> System.out.println(n.length()));
        webPage5.header("Raghu");
    }


}
