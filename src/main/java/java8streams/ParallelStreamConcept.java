package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

    public static void main(String[] args) {

        ForkJoinPool corePools = ForkJoinPool.commonPool();
        System.out.println(corePools.getParallelism());
        System.out.println("****************");

        //Using Parallel Steam using Parallel Method on the stream directly

        Stream<String> stream = Stream.of("Naveen", "Tom", "Selvin", "Raj", "Simon");
        // BaseStream parallelStream = stream.parallel();
        Stream.of("Naveen", "Tom", "Selvin", "Raj", "Simon").forEach(System.out::println); //Sequential Stream
        System.out.println("****************");

        //2. use parallelStream() method on the collection stream
        Stream.of("Naveen", "Tom", "Selvin", "Raj", "Simon").parallel().forEach(System.out::println);
        System.out.println("****************");

        Arrays.asList("Naveen", "Tom", "Selvin", "Raj", "Simon").parallelStream()
                .forEach(System.out::println);
        System.out.println("****************");

        //3. Print 1 to 10
        System.out.println("*******Using Sequential Stream *********");
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        System.out.println("*******Using Parallel Stream *********");
        IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);

        //4. print from a -z --> 97 -122
        System.out.println("***********");
        System.out.println(getAlphabetList());

        System.out.println("*****Using Sequential Streams ******");
        getAlphabetList().stream().forEach(System.out::println);

        System.out.println("*****Using Parallel Streams ******");
        getAlphabetList().parallelStream().forEach(System.out::println);

        //Check Stream is running in Parallel Mode
        System.out.println("*** Check Stream is running in Parallel Mode ***");
        IntStream range = IntStream.rangeClosed(1, 10);
        System.out.println(range.isParallel()); //false

        IntStream range1 = IntStream.rangeClosed(1, 10).parallel();
        System.out.println(range1.isParallel()); //false

    }

    public static List<String> getAlphabetList(){
        List<String> alpha = new ArrayList<>();
        int n = 97;
        while (n <=122){
            char ch = (char) n ;
            alpha.add(String.valueOf(ch));
            n++;
        }
    return alpha;
    }
}
