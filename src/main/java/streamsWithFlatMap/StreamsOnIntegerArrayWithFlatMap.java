package streamsWithFlatMap;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsOnIntegerArrayWithFlatMap {

    public static void main(String[] args) {

        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Stream<int[]> streamIntArray = Stream.of(data);

       IntStream intStream= streamIntArray.flatMapToInt(x-> Arrays.stream(x)); //Stream<int> or Stream<String>

        intStream.forEach(x -> System.out.println(x));




    }
}
