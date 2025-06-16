package starbasedquestion;

public class StarTrianglePattern {

    public static void main(String[] args) {

        System.out.println("Normal Triangle");
        for(int i =0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("Reverse Triangle");
        for(int i =0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Combine both");

        for(int i =0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0;i<=4;i++){
            for(int j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
