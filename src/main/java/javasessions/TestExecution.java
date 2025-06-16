package javasessions;

public class TestExecution {

    //a Method is calling itself -- Recursive function
    public static void getNumber(){
        System.out.println("Get Number");
       // getNumber(); //This will give stack overflow exception
    }

    public static void main(String[] args) {
        TestExecution.getNumber();

    }
}
