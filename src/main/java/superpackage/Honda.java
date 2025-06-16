package superpackage;

public class Honda extends Car{

    public Honda(){
        this(10); //this will be used to call the same class constructor
        System.out.println("This is my Honda Default Constructor");
    }

    public Honda(int a ){
        this(10,20);
        System.out.println("This is my Honda Default Constructor "+a);
    }

    public Honda(int a, int b){
        System.out.println("This is my Honda Default Constructor "+(a+b));
    }


}
