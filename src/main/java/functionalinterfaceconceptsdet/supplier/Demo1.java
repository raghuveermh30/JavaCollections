package functionalinterfaceconceptsdet.supplier;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {

    public static void main(String[] args) {

        /**
         * Supplier won;t take any input value and it will retuen something using get()
         */

        Supplier<LocalDate> s = () -> LocalDate.now();
        System.out.println(s.get());

        Supplier<Date> s1 = () -> new Date();
        System.out.println(s1.get());
    }
}
