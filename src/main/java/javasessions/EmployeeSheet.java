package javasessions;

public class EmployeeSheet {

    // Method OverLoading --> PolyMorphism --> Poly(Many)+Morphism(forms) --> same method with different forms
    // within the same class if we have multiple methods
    // 1. Method name is same
    // 2. with different number of parameters
    // 3. with different sequence of parameters (if number of parameters are same)
    // 4. return type doesn;t matter
    // This is called Compile Time Polymorphism or Static Polymorphism

    public void test() {
        System.out.println("test 1 Method");
    }

    public void test(int a) {
        System.out.println("test 2 Method");
    }

    public void test(String x) {
        System.out.println("test 3 Method");
    }

    public void test(String x, String y) {
        System.out.println("test 4 Method");
    }

    public void test(String a, int b) {
        System.out.println("test 5 Method");
    }

    public void test(int a, String b) {
        System.out.println("test 6 Method");
    }

    /**
     * Use cases of Method Overloading
     * 1. Login method in selenium
     * 2. search with number of filters
     * Method overloading will be used for same functionality and it will give varitery of the features to the users
     * This will be easy to fix and it is more readable
     */

    public void login() {

    }

    public void login(String uname, String pwd) {

    }

    public void login(String uname, String pwd, int otp) {

    }

    //search
    public void search() {

    }

    public void search(String name) {

    }

    public void search(String name, String color) {

    }

    public void search(String name, String color, int price) {
        System.out.println("search with name " + name + " " + color + " " + price);
    }

    //Uber
    //Car Booking

    public void carBooking(String startingPoint, String endPoint) {

    }

    public void carBooking(String startingPoint, String endPoint, String sedan) {

    }

    public void carBooking(String startingPoint, String endPoint, int totalNumberofPassangers) {

    }

    public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
        System.out.println("Calculate Tax");
        double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100 + (stocksProfit * 2) / 100;
        return totalTax;
    }

    public double calculateTax(int totalIncome, int bonus) {
        System.out.println("Calculate Tax");
        double totalTax = (totalIncome * 30) / 100 + (bonus * 5) / 100;
        return totalTax;
    }

    //void with blank return
    public void click(String element) {
        System.out.println("Clicking on the element " + element);
    }

    public static void main(String[] args) {
        EmployeeSheet obj = new EmployeeSheet();
        obj.test();
        obj.test(90);
        obj.test("raghu");
        obj.test("raghu", "test");
        obj.test("raghu", 25);
        obj.test(15, "raghu");

        obj.search("Tshirt", "Black", 100);
        double totalTax = obj.calculateTax(1000, 500);
        System.out.println(totalTax);
    }
}
