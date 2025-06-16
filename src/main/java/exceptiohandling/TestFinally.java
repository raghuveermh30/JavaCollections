package exceptiohandling;

public class TestFinally {

    public static int getMarks(String studentName) {

        System.out.println("Getting student Marks for " + studentName);

        if (studentName.equals("vibha")) {
            try {
                int i = 9 / 0;
                System.exit(1); //shutdown the JVM
                return 30;
            } catch (ArithmeticException e) {
                System.out.println("AE is coming");
                return 10;
            } finally {
                System.out.println("Bye...");
                return 80;
            }
        } else if (studentName.equals("monika")) {
            return 90;
        } else if (studentName.equals("veena")) {
            return 9;
        } else {
            System.out.println("No Student Found.." + studentName);

            try {
                int p = 9 / 0;
            } finally {
                return 5;
            }
        }
    }

    public static void main(String[] args) {

        int m1 = TestFinally.getMarks("vibha");
        System.out.println(m1);

    }
}
