package javasessions;

public class MainMethodOveroLoading {

    public static void main(int a) {
        System.out.println("Hi " + a);
    }

    public static void main(int a, int b) {
        System.out.println("Bye " + (a + b));
    }

    //JVM will look for psv with String args argument
    public static void main(String[] args) {
        System.out.println("Hello");
        MainMethodOveroLoading.main(5);
        MainMethodOveroLoading.main(5, 10);
    }


}
