package interviewquestions;

public class WordLengthCounter {

    public static void main(String[] args) {

        String str = "Raghuveer is working in Manhatten Associates!";

        // Split the string by spaces and special characters
        String words[] = str.split("[\\s!]+");

        // Process each word and print its length
        for (int i = 0; i < words.length; i++) {
            // Skip empty strings
            if (!words[i].isEmpty()) {
                System.out.print(words[i] + " : " + words[i].length());
            }
            //Add comma if not the last word
            if (i < words.length - 1) {
                System.out.print(",");
                System.out.print(" ");
            }
        }


    }


}
