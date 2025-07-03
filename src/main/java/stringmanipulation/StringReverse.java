package stringmanipulation;

public class StringReverse {


    public static String reverse(String str) {

        if (str == null) {
            throw new RuntimeException("VALUE CANNOT BE NULL"); //null check should be always first check
        }

        int len = str.length();

        if (len == 1 || len == 0) { // len value is 1 or 0
            return str;
        }

        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev.trim();
    }

    public static void main(String[] args) {

        String str = "selenium";

        String m1 = reverse(str);
        System.out.println(m1);

        System.out.println(reverse("testing"));
        System.out.println(reverse("t"));
        System.out.println(""); //len=0
        //  System.out.println(reverse(null));
        System.out.println(" ");
        System.out.println(reverse("123"));
        System.out.println(reverse("null"));
        System.out.println(reverse("testing "));

        /*
         * This login is only for interview purpose, in the real time we won;t use.
         *
         */

        String test = "Java Python Ruby";
        String test1[] = test.split(" ");
        for(int i = test1.length-1; i>=0;i--){
            System.out.print(test1[i]+" ");
        }
    }
}
