package javasessions;

public class SwitchCaseExamples {

    public static void main(String[] args) {

        String browser = "chrome";
        String version = "121";

        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Chrome is Launched");
                switch (version) {
                    case "120":
                        System.out.println("The chrome browser version is 120");
                        break;
                    case "121":
                        System.out.println("The chrome browser version is 121");
                        break;
                    case "122":
                        System.out.println("The chrome browser version is 122");
                        break;
                }
                break;
            case "FireFox":
                System.out.println("FireFox is Launched");
                break;
            case "IE":
                System.out.println("IE is Launched");
                break;
            case "Edge":
                System.out.println("Edge is Launched");
                break;
            default:
                System.out.println("Please provide the correct.." + browser);
        }

        /*
         * Here, suppose if the browser value is given as Edge, then the compiler will directly jump to Edge case.
         * Suppose if we give opera then also the compiler will go to default.
         * Compiler has already compiled the case values then it will reach the direct jump for case level
         *
         * Commenting the break in the switch case, then if we pass the chrome, here we are not putting the break and it will
         *
         * I can write the case after the default as well but its not readable
         *
         */

        int marks = 100;

        switch (marks) {
            case 1:
                System.out.println("Student has scored 1 marks");
                break;
            default:
                break;
        }

        /*
         * Here the problem is i need to maintain the 100 case, in this case i can go with te if else loop
         * For numbers better if-else will be good apprach
         * Condition cannot be a boolean value
         *
         * Switch case is applicable only for byte, short, String and int family and not applicable for Float,  Long and Double
         *
         */

        char ch = 'a';
        switch (ch) {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
                break;
        }

        /*
         * Uses of switch case
         *
         * 1. Cross browser Logic
         * 2. Cross OS logic
         * 3. Month
         * 4. cross users/ RBAC- user permissions
         * 5. Run the test cases in different env
         * 6. Different Timezones, Subjects
         * 7. Uber - cases: -Sedan, Prime, SUV, Mini
         * 8. HR: user Roles
         * 9. Localization
         * 10. Product Category --> Electronis, Fashion, Makeup, StateWise
         *
         */

    }
}
