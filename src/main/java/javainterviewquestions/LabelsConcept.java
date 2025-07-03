package javainterviewquestions;

public class LabelsConcept {

    public static void main(String[] args) {

        System.out.println("Hello");
        http: //java.com --> http: --> this is a label, not a comment
        {
            System.out.println("World");
        }


        System.out.println("OK");

        //When we have 2 for loops, then we can use labels to break out of the outer loop directly
        task:
        for(int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at " + i);
                break task; // breaks out of the labeled block
            }
            System.out.println("i = " + i);
        }


        outerLoop: // label for the outer loop
        for(int i =0;i<5;i++){
            innerLoop: // label for the inner loop
            for(int j = 0; j < 5; j++) {
                if (i!=j) {
                    System.out.println("If block value "+i);
                    break outerLoop; // breaks out of the outer loop
                }
                else {
                    System.out.println("Else block value "+i);
                    continue innerLoop; // continues to the next iteration of the inner loop
                }

            }
        }

    }
}
