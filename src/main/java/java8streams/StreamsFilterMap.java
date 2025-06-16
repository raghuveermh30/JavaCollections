package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Tom", 30),
                new Customer("Steve", 31),
                new Customer("Peter", 32),
                new Customer("Simon", 23)
        );

        String name = customerList.stream()
                .filter(x -> "Peter".equals(x.getCustomerName()))
                .map(Customer::getCustomerName)
                .findAny()
                .orElse(null);
        System.out.println(name);
        System.out.println("*************");

        //Print all the names from the List
        List<String> customerNameList = customerList.stream()
                .map(Customer::getCustomerName)
                .collect(Collectors.toList());
        customerNameList.forEach(System.out::println);

    }
}
