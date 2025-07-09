package java8interviewquestions.streamconcept.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

    public static void main(String[] args) {

        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 84, 4, 3, 4, 5);

        List<Integer> evenNumList = integersList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        evenNumList.forEach(s -> System.out.println(s));
        System.out.println("******************");


        List<Integer> oddNumList = integersList.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        oddNumList.forEach(s -> System.out.println(s));
        System.out.println("******************");


        integersList.stream().filter(e -> e % 2 == 0).forEach(s -> System.out.println(s));
        System.out.println("******************");

        //Example 2- In the below list, names should be > 3 characters and < 6 characters

        List<String> stringList1 = Arrays.asList("Tom", "peter", "steve", "Naveen", "Vibha", "Veena", "Raghu");
        List<String> longNamesList = new ArrayList<>();

        longNamesList = stringList1.stream().filter(s -> s.length() > 3 && s.length() < 6).collect(Collectors.toList());
        longNamesList.forEach(s -> System.out.println(s));
        System.out.println("******************");
        stringList1.stream().filter(s -> s.length() > 3 && s.length() < 6).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("******************");

        //Example 3 -> Remove null values in the given String
        List<String> stringList2 = Arrays.asList("Tom", "peter", null, "steve", "Naveen", null, "Vibha", "Veena", "Raghu", null);
        List<String> result = new ArrayList<>();
        result = stringList2.stream().filter(s -> s != null).collect(Collectors.toList());
        result.forEach(s -> System.out.println(s));
        System.out.println("******************");

        //Example 4 -> Streaming operations using Objects of Product class
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(123, "HP", 25000));
        productList.add(new Product(124, "Dell", 30000));
        productList.add(new Product(125, "MacBook", 28000));
        productList.add(new Product(126, "Lenevo", 23000));
        productList.add(new Product(127, "Sony", 90000));

        productList.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));

    }
}
