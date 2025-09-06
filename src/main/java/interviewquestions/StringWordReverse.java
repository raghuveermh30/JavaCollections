package interviewquestions;

public class StringWordReverse {

    public static void main(String[] args) {

        String str = "Raghuveer is working in Manhatten Associates";

        // Test for position = 0 (reverse even-indexed words)
        System.out.println("Position 0: " + reverseWordsByPosition(str, 0));

        // Test for position = 1 (reverse odd-indexed words)
        System.out.println("Position 1: " + reverseWordsByPosition(str, 1));

    }

    public static String reverseWordsByPosition(String str, int position){
       String [] words =  str.split(" ");

        // Process each word based on position
        for(int i=0; i<words.length;i++){
            // Reverse words at even indices if position = 0
            // Reverse words at odd indices if position = 1
            if((position == 0 && i%2==0) || (position ==1 && i%2!=0)){
                words[i] = new StringBuffer(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);
    }


}
