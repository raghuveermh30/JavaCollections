package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {

        /**
         * Represents an operation on a single operand/argument that produces a result of the same type as its operand.
         * This is a specialization of Function for the case where the operand and result are of the same type.
         */

        UnaryOperator<Integer> func = x -> x* 7;
        int res = func.apply(10);
        System.out.println(res);

        UnaryOperator<String> func1 = x -> x.toUpperCase();
        String res1 = func1.apply("raghuveer");
        System.out.println(res1);

        //FunctionInterfacde

        Function<Integer, Integer> func3 = x -> x* 7;
        int res3 = func3.apply(20);
        System.out.println(res3);

        List<String> langList = new ArrayList<>();
        langList.add("Java");
        langList.add("Python");
        langList.add("Ruby");
        System.out.println(langList);

        langList.replaceAll(ele -> ele + " Naveen");
        System.out.println(langList);


    }
}
