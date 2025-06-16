package stringmanipulation;

public class StringBuilderAndStringBuffer {

    public static void main(String[] args) {

        /*
         * StringBuffer and StringBuilder cannot create the Literals
         * Any manipulation is doing in the string builder then it will modify the same entry it won;t create the new entry
         *
         */

        StringBuilder sb = new StringBuilder("selenium");
        sb.append("automation");
        System.out.println(sb); //seleniumautomation

        /*
         * StringBuffer --> Added in 1.0 Java version
         * This is Thread safe
         * This will go in the Sequential execution
         * Performance is slow
         * In case of Write operation, then we need to perform in Thread safe env
         *
         * StringBuilder --> Added in 1.4 Java version
         * This is not Thread Safe
         * Performance is very high
         * we can use the multi threading env
         * In case of read operation we need to use not thread safe env
         */

        String st = "selenium";
        //  System.out.println(st.reve); // There is no reverse method

        StringBuilder sb1 = new StringBuilder("selenium");
        StringBuilder sb2 = new StringBuilder(st);
        System.out.println(sb1.reverse()); //this will reverse the String
        System.out.println(sb2.reverse());

        System.out.println(st); //selenium




    }
}
