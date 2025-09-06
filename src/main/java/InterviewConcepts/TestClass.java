package InterviewConcepts;

import java.util.HashSet;
import java.util.*;

public class TestClass {


    public static void main(String[] args) {

        String s = "Java";

        char chars[] = s.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Iterator<Character> it = map.keySet().iterator();

        while (it.hasNext()) {
            Character key = it.next();
            String value = map.get(key).toString();
            System.out.println(key + " contains " + value);
        }


    }

}
