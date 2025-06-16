package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndReferences {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Tom", "Peter", "Naveen", "Simon");

        //1. Anonymous Class
        System.out.println("*** Using Anonymous Class ****");
        names.forEach(new Consumer<String>() { //Anonymous Class
                          @Override
                          public void accept(String s) {
                              System.out.println(s);
                          }
                      }
        );

        //2. Lambda Expressions: ->
        System.out.println("*** Using Lamda Expression ****");
        names.forEach(str -> System.out.println(str));

        //3. Method References
        System.out.println("*** Using Method References ****");
        names.forEach(System.out::println);

        //4. Typical For Loop
        System.out.println("*** Using Typical For Loop ****");
        for (int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }

        //4. Typical For-Each Loop
        System.out.println("*** Using For-Each Loop ****");
        for(String str: names){
            System.out.println(str);
        }
    }
}
