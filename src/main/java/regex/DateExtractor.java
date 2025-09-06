package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

    public static void main(String[] args) {

        String str = "Jon has born on 30-05-1995 and Mary on 12/03/1995";

        // Regex pattern for dates in dd-mm-yyyy or dd/mm/yyyy format
        String regex = "\\d{2}[-/]\\d{2}[-/]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("***********************");
        pattern.matcher(str).results().forEach(s -> System.out.println(s.group()));


    }
}
