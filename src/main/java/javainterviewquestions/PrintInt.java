package javainterviewquestions;

public class PrintInt {

    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(int... i) {
        System.out.println("int...");
    }

    public void print(byte i) {
        System.out.println("byte");
    }

    public void print(short i) {
        System.out.println("short");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public void print(float i) {
        System.out.println("float");
    }

    public static void main(String[] args) {

        PrintInt test = new PrintInt();
        test.print(10); //int --> by default, Java will call the method with the most specific type
        test.print((byte) 10);
        test.print((short) 10);
        test.print((long) 10);
        test.print((float) 10);
        test.print((Integer) 10);

        //preferred method is the one with the most specific type
        //int, long, Integer, int ... --> this is the order of preference
    }

}
