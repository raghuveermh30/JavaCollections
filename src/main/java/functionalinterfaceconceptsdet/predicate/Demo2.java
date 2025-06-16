package functionalinterfaceconceptsdet.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo2 {


    public static void main(String[] args) {

        //emp object -> return name of the employee if salaray is greater than 50k and experece > 3
        Employee emp = new Employee("Raghu", 60000, 6);
        Employee emp1 = new Employee("Raghu", 60000, 3);
        Employee emp2 = new Employee("Raghu", 2000, 6);

        Predicate<Employee> employeePredicate = e -> (e.salary > 30000 && e.exp > 3);
        System.out.println(employeePredicate.test(emp));
        System.out.println(employeePredicate.test(emp1));
        System.out.println(employeePredicate.test(emp2));
        System.out.println("*********");

        //2 - Get the employee name whose salary is >30k and exp > 3

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("John", 50000, 5));
        employeeArrayList.add(new Employee("Tom", 30000, 5));
        employeeArrayList.add(new Employee("Peter", 50000, 2));
        employeeArrayList.add(new Employee("Steve", 40000, 4));
        employeeArrayList.add(new Employee("Vibha", 30001, 6));

        for (Employee employee : employeeArrayList) {

            if (employeePredicate.test(employee)) {
                System.out.println(employee.ename + " " + employee.salary);
            }
        }

    }

}
