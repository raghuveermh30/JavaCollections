package java8features;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierInterfaceConcept {

    public static void main(String[] args) {


        /*
         * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
         * This is a functional interface whose functional method is get().
         * This interface won;t take any operands but it will give results.
         */

        getText(() -> "Java");
        getText(() -> LocalDate.now().toString());
        getText(() -> "Naveen");
        getText(() -> "Test Automation");

    }

    public static void getText(Supplier<String> test){
        System.out.println(test.get());
    }
}
