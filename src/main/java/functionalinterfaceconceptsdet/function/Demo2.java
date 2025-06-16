package functionalinterfaceconceptsdet.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Raghu", 50000));
        emp.add(new Employee("Naveen", 20000));
        emp.add(new Employee("Tom", 30000));
        emp.add(new Employee("Peter", 25000));

        Function<Employee, Integer> function = e -> {
            int sal = e.salary;
            if (sal >= 10000 && sal <= 20000) {
                return (sal * 10 / 100);
            } else if (sal > 20000 && sal <= 30000) {
                return (sal * 20 / 100);
            } else if (sal > 30000 && sal <= 50000) {
                return (sal * 30 / 100);
            } else {
                return (sal * 40 / 100);
            }
        };

        Predicate<Integer> predicate = (b -> b > 5000);
        for (Employee e : emp) {
            int bonus = function.apply(e); //Function
            if (predicate.test(bonus)) {//Predicate
                System.out.println(e.name + " " + e.salary);
                System.out.println("Bonus is : " + bonus);
            }
        }
    }
}
