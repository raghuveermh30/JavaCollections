package java8interviewquestions.streamconcept.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {

        List<String> vehicleList = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        //Example 1 --> All the elements will store into upper case and will store in another collection
        List<String> resultList1 = new ArrayList<>();
        for (String str : vehicleList) {
            resultList1.add(str);
        }
        System.out.println(resultList1);
        System.out.println("*************");

        //Example 1
        List<String> resultList2 = vehicleList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        resultList2.forEach(System.out::println);
        System.out.println("*************");

        //Example 2
        List<Integer> resultList3 = vehicleList.stream().map(s -> s.length()).collect(Collectors.toList());
        resultList3.forEach(s -> System.out.println(s));
        System.out.println("*************");
        vehicleList.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
        System.out.println("*************");

        //Example 3
        List<Integer> integersList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7, 5, 4, 6, 7, 7, 84, 4, 3, 4, 5);
        List<Integer> resultList4 = integersList.stream().map(s -> s * 3).collect(Collectors.toList());
        resultList4.forEach(System.out::println);
        System.out.println("*************");
        integersList.stream().map(s -> s * 3).forEach(System.out::println);
        System.out.println("*************");

        //Example 3

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(123, "Tom", 25000));
        employeeList.add(new Employee(124, "Steve", 30000));
        employeeList.add(new Employee(125, "Veena", 28000));
        employeeList.add(new Employee(126, "Vibha", 36000));
        employeeList.add(new Employee(127, "Naveen", 23000));

        List<Double> resultList5 = employeeList.stream().filter(e -> e.salary > 25000).map(e -> e.salary).collect(Collectors.toList());
        resultList5.forEach(s -> System.out.println(s));

    }


}
