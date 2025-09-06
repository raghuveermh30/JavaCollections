package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StirngPatternTest {

    public static void main(String[] args) {

        String str = "$Raghuveer-43@Wipro-12%Pavan-23*India-77^";

        Pattern p = Pattern.compile("[A-Za-z]+-\\d+");

        Matcher m = p.matcher(str);

        List<String> list = new ArrayList<>();

        while (m.find()) {
            list.add(m.group());
        }

        Collections.sort(list);

        list.forEach(System.out::println);

    }
}
