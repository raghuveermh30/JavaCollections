package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods4 {

    public static void main(String[] args) {

        //findAny()
        //findFirst()

        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 8, 4, 4, 3, 4, 5);
        Optional<Integer> integerOptional = integersList.stream().findAny();
        System.out.println(integerOptional.get());
        System.out.println("****************");
        //Suppose if its empty collection, then it will return NoSuchElementException
        List<Integer> integersList1 = Arrays.asList();
      //  int emptyValue = integersList1.stream().findAny().get();
        //  System.out.println(emptyValue); //NoSuchElementException

        Optional<Integer> integerOptional1 = integersList.stream().findFirst();
        System.out.println(integerOptional1.get());
    }
}
