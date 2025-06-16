package functionalinterfaceconceptsdet.function;

import java.util.function.Function;

public class Demo3 {

    public static void main(String[] args) {

        /**
         * Function chaining can be achiveable using
         * andThen()
         * compose()
         */

        Function<Integer, Integer> f1 = n -> n * 2;

        Function<Integer, Integer> f2 = n -> n * n * n;
        System.out.println(f1.andThen(f2).apply(2)); //f1 to f2 -> 2*2 = 4 --> 4*4*4=64
        System.out.println(f1.compose(f2).apply(2)); //f2 to f1 -> 2*2*2 = 8 --> 8*2 =16
    }
}
