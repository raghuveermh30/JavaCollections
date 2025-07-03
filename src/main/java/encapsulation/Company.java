package encapsulation;

public class Company {

    private Company() {

    }

    public static void getRevnue() {
        System.out.println("Get Revenue");
    }

    /*
     * Here no one can access the getRevenue using object but if we make static then we can access
     * Example is System class, All the methods are static in nature
     */
}
