package org;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsClasses {

    public static void main(String[] args) {

        // JDK 8
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2==0).forEach(e-> System.out.println(e));

        Stream.of("hello", "java")
                .map(e -> e + "world")
                .forEach(System.out::println);

        //Optional Class
        String [] s = new String[5];
        s[2] = "Raghu";
        Optional<String> isNull = Optional.ofNullable(s[2]); //to avoid the null pointer exceptions we can use Optional class

        if(isNull.isPresent()){
            System.out.println(s[2]+ " " + s[2].length());
        }
        else {
            System.out.println("Value is not available");
        }

       Optional<String> nothing= Optional.empty();
        nothing.ifPresent(e -> System.out.println("Bye.."));

        // Jshell - JDK 9 -->  jshell --enable-preview (Provide this in the terminal)

        // Factory Methods for immutable collections:

        List<Integer> list=Arrays.asList(1,2,3,4,5);

       // List<String> list = List.of("java", "python", "ruby", "Js"); --> Java 9 --> Immutable collections
        list.stream().forEach(e -> System.out.println(e));

        //Jdk 10 --> var keyword
      //  var x = 10;







    }
}
