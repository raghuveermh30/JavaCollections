package javasessions;

public class TestingStack {


    public void m1(){
        System.out.println("m1 method");
        m2();
    }

    public void m2(){
        System.out.println("m2 method");
        m3();
    }

    public void m3(){
        System.out.println("m3 method");
    }

    public static void main(String[] args) {

        TestingStack obj = new TestingStack();
        obj.m1();

        /**
         *
         * Stack memory will allocate and deallocate
         *
         * It will work on LIFO
         * suppose if we create the circular chain then it will give stackoverflow exception
         *
         *
         */
    }
}
