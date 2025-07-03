package javainterviewquestions;

public class PrintHelloWorld {

    public static void main(String[] args) {

        //print Hello world without using a semicolon in java

       // System.out.println("Hello World");

        if (System.out.printf("Hello World \n") == null) {
            // This line will not execute, but it allows us to print without a semicolon
        }

        if(System.out.append("Hello world \n") == null) {
            // This line will not execute, but it allows us to print without a semicolon
        }

        if(System.out.append("Hello world").equals(null)) {
            // This line will not execute, but it allows us to print without a semicolon
        }
    }
}
