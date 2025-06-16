package streamsWithFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpName("Naveen");

        emp1.addDevices("iphone8");
        emp1.addDevices("samsung9");
        emp1.addDevices("iphone9");
        emp1.addDevices("macBook pro");

        Employee emp2 = new Employee();
        emp2.setEmpName("Tom");

        emp2.addDevices("lenevo windows 10");
        emp2.addDevices("samsung9");
        emp2.addDevices("iphone9");
        emp2.addDevices("macBook air");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);

        List<String> devicesList = employeeList.stream()
                .map(x -> x.getDevices()) //this is returning Stream<Set<String>>
                .flatMap(x -> x.stream()) //this is returning Stream<String>
                .distinct()
                .collect(Collectors.toList());

        devicesList.forEach(x -> System.out.println(x));


    }


}
