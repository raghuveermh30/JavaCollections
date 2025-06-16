package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect {

    public static void main(String[] args) {

        List<String> productList = Arrays.asList("MacBook", "iphone", "shoes", "Battery Charger", "Bat");
        System.out.println(productList);

        System.out.println("*********");
        productList.forEach(ele -> System.out.println(ele));

        List<String> resStream = productList.stream()
                .filter(ele -> !(ele.equals("shoes")))
                .collect(Collectors.toList());
        System.out.println("*********");
       // System.out.println(resStream);
        resStream.forEach(System.out::println);


    }

}
