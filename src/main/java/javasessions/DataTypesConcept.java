package javasessions;

public class DataTypesConcept {

    public static void main(String[] args) {

        //DataType -> Type of data, it could be anything.

        /**
         *  1. Premetive Data Type -> all are reserved data types
         *  Keywords will never start with the capital
         *  //Integral Value
         *    Integer: byte, short, int, long
         *    Floating type: double, float
         * // Character Value
         *    char:
         *
         * //Boolean Value --> true or false
         *
         * 2. Non Premetive Data Type --> class, interface, arrays, object
         */

        //1. Byte
        // Size and Range
        // Size = 1 byte -> 8 bits
        // Range = -128 to 127 --> (-2^7 to 2^7-1)
        byte b = 10;
        b = 20;
        byte c1 = -20;
        System.out.println(b);
        System.out.println(c1);

        //2. Short
        // Size = 2 byte --> 2 * 8 == 16 bits
        //Range = -32768 to 32767 --> (-2^15 to 2^15-1)
        short sh = 100;
        short bh = 600;
        System.out.println(sh);
        System.out.println(bh);
        short gh = 1; // 2 bytes --> unneccessary we are using short, we can use byte here
        short h = 400;
        System.out.println(h);

        //3. Integer
        // Size = 4 bytes --> 4 * 8 == 32 bits
        // Range  = -2147483648 to 2147483647 --> (-2^31 to 2^31-1)

        int i = 10000;
        int j = 1; // Right data type is byte
        System.out.println(i);
        System.out.println(j);

        //4. Long
        // Size = 8 Bytes --> 8 * 8 => 64
        //Range = - 2^63 to 2 ^ 63 -1
        long l = 100000888909L;
        System.out.println(l);

        // 5. Float
        // Size = 4 bits = 32 bits
        // Range -> after . it can take around upto 6 tp 7 digits

        float n = 13.33f; // 4 bytes
        float n1 = (float) 12.33;
        System.out.println(n);
        System.out.println(n1);
        float n2 = 100;
        System.out.println(n2); //100.00

        //6. Double
        // Size = 8 Bytes = 64 bits
        // Range -> after . it can take around upto 15 digits
        // Value of pi
        double d = 12.33; // 8 bytes

        //7. char
        // Size = 2 bytes
        // Range = 16 bits
        // char will store in 2 bytes reason being its due to unicode values + ASCII values, like arabic, japanese, chinise chars, hence char is stored 2 bytes

        char ch = 'a';
        System.out.println(ch);
        char ch1 = '$';
        System.out.println(ch1);
        char ch2 = 1; // 0-9 --> only 1 character
        System.out.println(ch2);

        System.out.println('t');
        System.out.println('t' + 10); //this will print the ascii values


        //7. Boolean
        // Size: ~1 bit --> Approximatley 1 bit
        boolean b1 = true;
        System.out.println(b1);
        boolean bl = false;
        System.out.println(bl);

        /**
         * Before . in float we can use upto 39 digits
         * Before . in double we can use upto 309 digits
         *
         */

    }
}
