package linkedintests;

public class ReverseWords {

    public static void main(String[] args) {

        //Reverse Each Word in a Sentence

        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse()).append(" ");
        }

        System.out.println(reversedSentence.toString().trim());
    }
}
