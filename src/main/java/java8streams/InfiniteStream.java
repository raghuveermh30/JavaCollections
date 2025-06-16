package java8streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {

        //infinite stream --> used to generate the data for infinite time but we have limitations.
        // It will generate the infinite stream of data

        //1. iterate() --> method --> static method available in the stream class
        //iterate(T seed, UnaryOperator<T> f)
        // this will return the Stream<T>

        List<Integer> collect = IntStream.iterate(0, n -> n + 2)
                .mapToObj(Integer::valueOf)
                .limit(100)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("**********");


        //2. generate() --> static method
        //generate(Supplier<T> s)

        //Generate Random Numbers upto 100
        List<Integer> collect2 =  Stream.generate(() -> (new Random().nextInt(1000))).limit(20).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
