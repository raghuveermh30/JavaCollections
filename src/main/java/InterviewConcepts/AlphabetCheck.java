package InterviewConcepts;

public class AlphabetCheck {

    public static void main(String[] args) {

        char c = 'a';
        char c1 = '$';

        if(Character.isLetter(c)){
            System.out.println(c + " is an alphabet");
        }
        else{
            System.out.println(c + " is not an alphabet");
        }
    }
}
