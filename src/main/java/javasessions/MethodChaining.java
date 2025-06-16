package javasessions;

public class MethodChaining {

    public void m1() {
        System.out.println("m1 method");
        m2();
    }

    public void m2() {
        System.out.println("m2 method");
        m3();
    }

    public void m3() {
        System.out.println("m3 method");
        MethodChaining.t1();
    }

    public void m4() {
        System.out.println("m4 method");
        MethodChaining.t1();
    }

    public static void t1() {
        System.out.println("t1 Method");
        t2();
    }

    public static void t2() {
        System.out.println("t2 Method");
        t3();
    }

    public static void t3() {
        System.out.println("t3 Method");
        MethodChaining obj1 = new MethodChaining();
        obj1.m4();
    }

    /**
     * Non-Static Method --> Non-Static Method --> Direct Calling (No Object Required due to they are in same Memory)
     * Static Method --> static Method --> Direct calling/use class name
     * Non-Static Method --> Static Method --> Direct calling/use class name
     * Static Method --> Non-Static Method --> Create the Object and then call it
     * Here we are creating another object and we need to call it, This is a Problem, To Solve this we need to Call by Reference and Call by Value
     *
     */


    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m1();
        MethodChaining.t1();


    }
}
