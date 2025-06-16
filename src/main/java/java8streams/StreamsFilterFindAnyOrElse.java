package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

    public static void main(String[] args) {

        //List of Customers Object
        List<Customer> customerList = Arrays.asList(
                new Customer("Tom", 30),
                new Customer("Steve", 31),
                new Customer("Peter", 32),
                new Customer("Simon", 23)
        );

        //1. Filter --> FindAny
        Customer customer = customerList.stream() //convert List to Stream
                .filter(x -> "Peter".equals(x.getCustomerName())) //filter it for Peter Customer
                .findAny() //if it finds then return the list
                .orElse(null); //suppose if element is not find then return null using orElse
        System.out.println(customer.getCustomerName() + " " + customer.getAge());

        System.out.println("*******************");

        //2. Filter --> Didn't FindAny
        Customer customer1 = customerList.stream() //convert List to Stream
                .filter(x -> "Naveen".equals(x.getCustomerName())) //filter it for Peter Customer
                .findAny() //if it finds then return the list
                .orElse(null); //suppose if element is not find then return null using orElse
        System.out.println(customer1);
        System.out.println("*******************");

        //3. Filter with multiple conditions
        Customer customer2 = customerList.stream()
                .filter(x -> "Simon".equals(x.getCustomerName()) && 23 == x.getAge())
                .findAny()
                .orElse(null);
        System.out.println(customer2.getCustomerName() + " " + customer2.getAge());

    }
}
