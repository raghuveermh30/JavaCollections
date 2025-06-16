package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

    public static void main(String[] args) {

        Predicate<Integer> func = x -> x > 5;
        boolean flag = func.test(10);
        System.out.println(flag);

        Predicate<Integer> func1 = x -> x > 5;
        List<Integer> intArryList = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9);
        List<Integer> collectionList = intArryList.stream().filter(func1).collect(Collectors.toList());
        System.out.println(collectionList);

        //Predicate with And Operator: &&
        List<Integer> collectionList1 = intArryList.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
        System.out.println(collectionList1);

        //Predicate with Negate Operator: &~
        List<String> strList = Arrays.asList("Naveen", "Navee", "Nave", "Java", "Jav", "Ja", "J");
        Predicate<String> namesExp = x -> x.startsWith("Nav");
        List<String> negList = strList.stream().filter(namesExp.negate()).collect(Collectors.toList());
        System.out.println(negList);

    }
}
