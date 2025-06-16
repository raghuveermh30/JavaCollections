package javasessions;

import java.util.Arrays;

public class StatticArrayConcept {

    public static void main(String[] args) {

        int[] a = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        System.out.println(Arrays.toString(a)); // Print all the values in the array

        for (int k = 0; k <= a.length - 1; k++) {
            System.out.println(a[k]);
        }

        System.out.println("************");
        for (int e : a) {

            if (e % 2 == 0) {
                System.out.println(e);
            }
        }

        //2. Double Array
        double d[] = new double[3];
        d[0] = 12.33;
        d[1] = 12.44;
        d[2] = 12.55;
        System.out.println("************");
        for (double e : d) {
            System.out.println(e);
        }

        //3. Char Array
        char ch[] = new char[4];
        ch[0] = 'a';
        ch[1] = 'A';
        ch[2] = '0';
        ch[3] = '!';

        System.out.println("************");
        for (char c : ch) {
            System.out.println(c);
        }
        System.out.println("************");
        System.out.println(Arrays.toString(ch));

        // String Array

        String emp[] = new String[3];
        emp[0] = "Tom";
        emp[1] = "Peter";
        emp[2] = "Steve";
        System.out.println("************");
        for (String s : emp) {
            System.out.println(s);
            if (s.equals("Peter")) {
                System.out.println("Peter is working in Amazon");
            }
        }

        //empdata = name(string), age(int), gender(char), salary(double), isEmpPerm(boolean) --> Here we have different data types
        // In this case, we can use the Object Array

        Object data[] = new Object[5];
        data[0] = "Raghu";
        data[1] = 29;
        data[2] = 'M';
        data[3] = 10000;
        data[4] = true;
        System.out.println(Arrays.toString(data));
        System.out.println("************");
        for (Object obj : data) {
            System.out.println(obj);
        }

        System.out.println("************");
        for (int k = 0; k < data.length - 1; k++) {
            System.out.println(data[k]);
        }

        int p[] = new int[4];
        p[0] = 10;
        p[1] = 20;
        p[2] = 30;
        p[3] = 40;

        System.out.println("************");
        for (int k = p.length - 1; k >= 0; k--) {
            System.out.println(p[k]);
        }

        System.out.println("************");
        int count = p.length-1;
        for (int e : p){
            e = count;
            System.out.println(p[e]);
            count--;
        }

    }
}
