package javainterviewquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {

    private static String seperator;

    public static void main(String[] args) {

        String[] arr = {"t", "r", "v"}; //trv or t:r:v or t|r|v

        String join1 = String.join(":", arr); //t:r:v
        System.out.println(join1);

        String join2 = String.join("", arr); //trv
        System.out.println(join2);

        String join3 = String.join("|", arr); //trv
        System.out.println(join3);

        String join4 = Arrays.asList("t", "r", "v", "i", "n", "m", "g").stream()
                .collect(Collectors.joining(": "));
        System.out.println(join4); //t: r: v: i: n: m: g


        joinString(":", "t", "r", "v", null, "i", "n", "m", "g"); //t:r:v:i:n:m:g

        joinInt(":", 1, 2, 3, 4, 5); //1:2:3:4:5

        String join5 = Arrays.asList(1, 4, 5, 6, 33, 5, 2, 5).stream().map(e -> String.valueOf(e))
                .collect(Collectors.joining(" ; "));
        System.out.println(join5); //1 ; 4 ; 5 ; 6 ; 33 ; 5 ; 2 ; 5

    }

    public static String joinString(String seperator, String... values) {

        StringBuilder sb = new StringBuilder();
        int end = 0;

        for (String str : values) {
            if (str != null) {
                sb.append(str);
                end = sb.length();
                sb.append(seperator);
            }
        }
        return sb.substring(0, end); // remove the last ;
    }

    public static String joinInt(String seperator, Integer... values) {

        StringBuilder sb = new StringBuilder();
        int end = 0;

        for (Integer str : values) {
            if (str != null) {
                sb.append(str);
                end = sb.length();
                sb.append(seperator);
            }
        }
        return sb.substring(0, end); // remove the last ;
    }
}
