package starbasedquestion;

public class RightLeftAngleTriangle {

    public static void main(String[] args) {

        /**
         *  *
         *   **
         *  ***
         * ****
         *
         *
         */

        for(int i =1;i<=4;i++){
            for(int j =3;j>=i;j--){
                System.out.print(" ");//spaces
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
