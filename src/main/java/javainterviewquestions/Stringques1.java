package javainterviewquestions;

public class Stringques1 {

    public static void main(String[] args) {

        String str = "Hello World";
        String str1 = "Hello World";
        String str2 = new String("Hello World");
        String str3 = new String("Hello World");

        System.out.println(str == str1); // true, same string literal
        System.out.println(str == str2); // false, different object in heap
        System.out.println(str2 == str3); // false, different objects in heap
        System.out.println(str.equals(str2)); // true, same content

        System.out.println("**********");

        String x = "Hello";
        String y = "Hello";
        x.concat(y);
        System.out.println(x); // Hello, because strings are immutable in Java
        String z = x.concat(y);
        System.out.println(z); // HelloHello, new string created
    }
}
