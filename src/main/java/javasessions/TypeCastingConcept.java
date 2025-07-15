package javasessions;

public class TypeCastingConcept {

    public static void main(String[] args) {

        //byte, short, char, int, long, float and double
        byte b = 10;

        short s = b;

        System.out.println(s);

        short s1 = 200;
        byte b1 = (byte) s1;
        System.out.println(b1); //-56

        // Byte can store upto 127 and we are loosing the data here

        /*
         * There are 2 types of TypeCasting
         *
         * 1. Widening --> Converting the lower data type into higher data type is called widening
         * 2. Narrowing --> Converting the higher data type into Lower data type is called Narrowing
         *
         *
         */

        short s2 = 10;
        byte b2 = (byte) s2;
        System.out.println(b2); //10

        byte b3 = 10;
        int i = b3;
        System.out.println(i); // 10 --> widening

        int j = 1000;
        byte b4 = (byte) j;
        System.out.println(b4); //-24 --> Narrowing

        int p = 100;
        float f1 = p;
        System.out.println(f1); //100.0 --> widening

        float f2 = 12.33f;
        int p1 = (int) f2;
        System.out.println(p1);//12 --> Narrowing

        int d = 10000;
        double dd = d;
        System.out.println(dd);

        char ch = 'a'; //97
        int w = ch;
        System.out.println(w); //97

        int v = 97;
        char cg = (char) v;
        System.out.println(cg); //a

        int v1 =1200;
        char cg1 = (char) v1;
        System.out.println(cg1);//Ұ



    }
}
