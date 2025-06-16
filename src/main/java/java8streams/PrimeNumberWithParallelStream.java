package java8streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(2));
        System.out.println(isPrime(1));

        /*long count = Stream.iterate(0, n -> n + 1)
                .limit(10000)
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(x -> System.out.println(x))
                .count();
        System.out.println("Total Prime Numbers are " + count);*/

        System.out.println("***************");

        long t1, t2;
        t1 = System.currentTimeMillis();
        long count1 = Stream.iterate(0, n -> n + 1)
                .limit(1000000).parallel()
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(x -> System.out.println(x))
                .count();
        System.out.println("Total Prime Numbers are " + count1);
        t2 = System.currentTimeMillis();
        System.out.println("Total time taken "+(t2-t1)/100);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, number / 2).anyMatch(x -> number % x == 0);
    }
}
