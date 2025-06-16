package java8interviewquestions.streamconcept.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo3 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Smith", 101, 'A'));
        list.add(new Student("Tom", 102, 'B'));
        list.add(new Student("Peter", 103, 'C'));
        list.add(new Student("Veena", 104, 'A'));

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Vibha", 105, 'A'));
        list1.add(new Student("Rahul", 106, 'B'));
        list1.add(new Student("John", 107, 'A'));

        List<List<Student>> lists = Arrays.asList(list, list1);
        List<String> studentNameList = lists.stream().flatMap(x -> x.stream()).map(s -> s.name).collect(Collectors.toList());
        studentNameList.forEach(System.out::println);

    }
}
