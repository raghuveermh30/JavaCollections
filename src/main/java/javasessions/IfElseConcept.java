package javasessions;

public class IfElseConcept {

    public static void main(String[] args) {

        // comparing the Primitive data type we need to use ==

        System.out.println(10 == 20);//false

        int a = 10;
        int b = 20;

        if (a > b) { //false
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }


        if (true) {
            System.out.println("Hi..");
        }

        if (false) {
            System.out.println("Hello..."); // dead code Warning --> Java compiler will never reach
        }

        boolean flag = true;

        if (flag) {
            System.out.println("Hello!!");
        } else {
            System.out.println("Bye...");
        }

        boolean isHeadless = true;
        if (isHeadless) {
            System.out.println("Run test cases in Headless Mode !!");
        } else {
            System.out.println("Run test cases in Normal Mode !!");
        }

        if (10 > 5) {
            System.out.println("Naveen");
        }

        //if---if--else--> if --> nested if

        int marks = 98;

        if (marks <= 100) {
            if (marks >= 90) {
                System.out.println("You got the grade A");
                if (marks >= 95) {
                    System.out.println("100% scolarship");
                    if (marks == 100) {
                        System.out.println("You are eligble for Tution Fee");
                    }
                }

            }

        } else {
            System.out.println("Invalid Marks");
        }

        // comparing the Non-Primitive data type we need to use equals method
        //if --elseif --elseif --else

        String browser = "chrome";

        /*if (browser.equals("chrome")) {
            System.out.println("Chrome is Launched");
        }
        if (browser.equals("Firefox")) {
            System.out.println("Firefox is Launched");
        }
        if (browser.equals("Egde")) {
            System.out.println("Egde is Launched");
        }
        if (browser.equals("IE")) {
            System.out.println("IE is Launched");
        } else {
            System.out.println("Please pass the correct browser: " + browser);
        }*/

        /**
         * If we use multiple if and else code then unneccssary all the if blocks will be executed and it is a performance issue
         * The Last else loop also it will be executed.
         * To avoid this, we need to use the else if block
         */

        if (browser.equals("chrome")) {
            System.out.println("Chrome is Launched");
        } else if (browser.equals("Firefox")) {
            System.out.println("Firefox is Launched");
        } else if (browser.equals("Egde")) {
            System.out.println("Egde is Launched");
        } else if (browser.equals("IE")) {
            System.out.println("IE is Launched");
        } else {
            System.out.println("Please pass the correct browser: " + browser);
        }

        /**
         * In the above example as well, suppose if the value is IE, still all the conditions will be checked in the above blocks will be executed and it is a performance issue
         * To solve this Switch case will come into picture
         *
         */
    }
}
