package javainterviewquestions;

public class CapatilizedWord {

    public static void main(String[] args) {

        System.out.println(capitalizeFirstLetter("naveen automation labs"));
        System.out.println(capitalizeFirstLetter("naveen"));
        System.out.println(capitalizeFirstLetter(""));
        System.out.println(capitalizeFirstLetter(null));
        System.out.println(capitalizeFirstLetter("n"));
        System.out.println(capitalizeFirstLetter("n n n n")); //N N N N
        System.out.println(capitalizeFirstLetter("123"));
        System.out.println(capitalizeFirstLetter("123 test naveen automation labs"));

    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (str.length() == 1) {
            return str.toUpperCase(); // If the string has only one character, return it in uppercase
        }
        String[] words = str.split(" "); //str.split(\\s) can also be used to split by whitespace
        StringBuilder result = new StringBuilder();
        for (String str1 : words) {
            String first = str1.substring(0, 1).toUpperCase(); //N
            String resultString = str1.substring(1); //aveen
            result.append(first).append(resultString).append(" "); //Naveen
        }
        return result.toString().trim(); // trim() to remove the trailing space
    }

    static void capitalizeString(String str) {
        StringBuilder result = new StringBuilder();
        String[] ar = str.split("\\s");
        for (String s : ar) {
            char c = Character.toUpperCase(s.charAt(0));
            result.append(s.replace(s.charAt(0), c)).append(" ");

        }
        System.out.println(result);
    }
}
