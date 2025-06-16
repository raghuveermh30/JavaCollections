package stringmanipulation;

public class StringIntern {

    public static void main(String[] args) {

        String str = new String("Java"); //Heap and SCP
        String s1 = str.intern();
        System.out.println(s1);
        System.out.println(s1==str);
        System.out.println(s1.equals(str));


    }
}
