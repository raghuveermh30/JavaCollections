package java8interviewquestions.streamconcept.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Tom", "Peter", "Steve");
        List<String> teamB = Arrays.asList("Sachin", "Dravid", "Laxman");
        List<String> teamC = Arrays.asList("Kohili", "Rohit", "Hardik");

        //Before Java 8
        List<List<String>> playersList = Arrays.asList(teamA, teamB, teamC);
        for (List<String> stringList : playersList) {
            for (String team : stringList) {
                System.out.println(team);
            }
        }
        System.out.println("******************");

        List<List<String>> playersList1 = Arrays.asList(teamA, teamB, teamC);
        List<String> result = playersList1.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        result.forEach(s -> System.out.println(s));


    }
}
