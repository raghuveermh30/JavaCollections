package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamsMethods3 {

    public static void main(String[] args) {

        //anyMatch() -> this will return anything
        // allMatch()  --> this will return boolean value, suppose if the element is matching with all the elements in the string then it will return true
        // noneMatch()

        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("One Apple");
        fruitsSet.add("One Mango");
        fruitsSet.add("Two Apple");
        fruitsSet.add("Two Guavas");

        //anyMatch -> Atleast one element should match in the collection
        boolean result = fruitsSet.stream().anyMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(result);
        System.out.println("*************");

        //allMatch() - All elements should match in the collection then it will return true
        result = fruitsSet.stream().allMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(result);
        System.out.println("*************");

        //noneMatch() - All elements should not match in the collection then it will return true
        //None of the element shouldn't start with One --> it will return false
        result = fruitsSet.stream().noneMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println(result);
    }
}
