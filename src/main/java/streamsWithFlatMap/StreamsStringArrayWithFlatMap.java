package streamsWithFlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

    public static void main(String[] args) {

        String data[][] = new String[][]{
                {"a", "b"},
                {"c", "d"},
                {"e", "f"}
        };

        Stream<String[]> dataStream = Arrays.stream(data);

        //Apply flatMap on dataStream
        Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));

        Stream<String> dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));
        dataStreamFilter.forEach(System.out::println);
        System.out.println("***************");

        //2nd approach --> composite action
        Stream<String> finalStream = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "c".equals(x.toString()));
        finalStream.forEach(System.out::println);

    }

}
