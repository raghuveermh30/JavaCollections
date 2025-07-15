package javasessions;

public class FunctionsInJava {

    /*
     * Functions/Method in Java
     * Main is the starting point of the code. JVM will look the main Method and it will always go inside the main method
     *
     * Method --> Functions will give the reuseability, I can reuse the method again and again
     * input --> return
     * input --> no return
     * no input --> no return
     * no input --> return
     * Function is nothing but set of code that we will return and the code will be written
     * Function are parallel to each other
     * cannot create function inside the function but i can call the function inside the function
     */

    /*
     * class data members:
     * 1. class variables - static and non static
     * 2. class methods -static and non static
     */

    //1. no input no return
    //void --> No return, function that doesn't return anything (no return keyword)
    public void test() {
        System.out.println("test method");
    }

    //no input no return --> Output is not considered as return
    public void cals() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    //2. no input but some return
    // return type is Integer
    public int getNumber() { //0 Param
        System.out.println("get Number");
        int fee = 100;
        int tax = 20;
        int totalFee = fee + tax;
        return totalFee;
    }

    public String getTrainerName() {
        System.out.println("get Trainer Name");
        return "Naveen";
    }

    public boolean isUserActive() {
        System.out.println("checking user status");
        return true;
    }

    //3. input but no return
    public void add(int a, int b) { // 2 Parameters
        System.out.println("Adding 2 numbers");
        int sum = a + b;
        System.out.println(sum);
    }

    //4. some input and return
    public int sum(int a, int b, int c) {
        System.out.println("Addition of 3 numbers");
        return  a + b + c;

    }


    public static void main(String[] args) {

        FunctionsInJava obj = new FunctionsInJava();
        obj.test();
        obj.cals();
        // System.out.println(obj.getNumber());
        int totalFee = obj.getNumber();
        System.out.println(totalFee);
        System.out.println(totalFee - 100 + 30);
        String trainerName = obj.getTrainerName();
        System.out.println(trainerName);
        boolean flag = obj.isUserActive();
        System.out.println(flag);

        if (flag) {
            System.out.println("login to app");
        }

        System.out.println("***********");
        obj.add(10, 20); //10 and 20 are Arguments

        System.out.println("***********");
        int sum = obj.sum(10, 20, 30);
        System.out.println(sum);

        int sum1 = obj.sum(100, 200, 300);
        System.out.println(sum1);

    }
}
