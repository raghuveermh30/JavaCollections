package java8interviewquestions.streamconcept.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods5 {

    public static void main(String[] args) {

        List<String> animalList = Arrays.asList("Dog", "cat", "Lion", "Tiger");
        List<String> birdsList = Arrays.asList("Peakock", "parrot", "crow", "sparrow");

        Stream<String> stream1 = animalList.stream();
        Stream<String> stream2 = birdsList.stream();

        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        finalList.forEach(s -> System.out.println(s));

    }
}
