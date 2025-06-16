package functionalinterfaceconceptsdet.consumers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo1 {

    public static void main(String[] args) {
        /**
         * Consumer will alwyas take one argument
         * It doesn't return any value
         *
         */

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Raghuveer");
        c.accept("Welcome");
        System.out.println("******");

        //Example on Predicate, Function and Conumer
        //Create Multiple Employee objects and store all the emp objects in the array list. Based on the Salary, Want to calculate the Bonus
        //Once we calculate the Bonus then verify the Bonus is >5000 then Print all the details of Employee

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Raghu", 50000, 'M'));
//        empList.add(new Employee("Vibha", 60000, 'F'));
        empList.add(new Employee("Veena", 35000, 'F'));
        empList.add(new Employee("Tom", 45000, 'M'));
        empList.add(new Employee("Peter", 55000, 'M'));
        empList.add(new Employee("Victoria", 70000, 'F'));

        //Function
        Function<Employee, Integer> function = emp -> (emp.salary * 10) / 100; //task1

        //Predicate
        Predicate<Integer> predicate = b -> (b >= 500); //task2

        //Consumer
        Consumer<Employee> employeeConsumer = emp2 -> { //task3
            System.out.println(emp2.name);
            System.out.println(emp2.salary);
            System.out.println(emp2.gender);
        };


        for (Employee employee : empList) {
            int bonus = function.apply(employee);
            if (predicate.test(bonus)) {
                employeeConsumer.accept(employee);
                System.out.println("Bonus is "+ bonus);
                System.out.println("************");
            }
        }

    }
}
