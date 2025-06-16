package exceptiohandling;

public class Student {

    public void m1() {
        System.out.println("m1 method");
        m2();
    }

    public void m2() {
        System.out.println("m2 method");
        m1();
    }

    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.m1();
        } catch (StackOverflowError e) {
            System.out.println("Some Error is coming ");
        }

        System.out.println("Bye");


    }
}
