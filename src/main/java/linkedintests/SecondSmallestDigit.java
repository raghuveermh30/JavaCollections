package linkedintests;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SecondSmallestDigit {

    public static void main(String[] args) {

        String input = "claude2403edualc";

        //Collet unique digits from the string

        TreeSet<Integer> digits = new TreeSet<>();
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(Character.getNumericValue(ch));
            }
        }

        if (digits.size() < 2) {
            System.out.println("There are less than 2 unique digits in the string.");
        } else {
            digits.pollFirst(); // remove smallest
            System.out.println("The second smallest digit is: " + digits.first());
        }


        /*
        TreeSet automatically stores integers in sorted order and only keeps unique values
        pollFirst() removes the smallest element
        first() then gives us the second smallest → Output: 2 (digits are 0,2,3,4 → second smallest is 2)
         */

        //Using Lamda 8

        List<Integer> digits1 = input.chars().filter(Character::isDigit)
                .map(Character::getNumericValue)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        if (digits1.size() < 2) {
            System.out.println("There are less than 2 unique digits in the string.");
        } else {
            System.out.println("The second smallest digit is: " + digits1.get(1));
        }
    }
}
