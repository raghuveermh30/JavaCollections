package interfaceconcept;

public interface USMedical extends WHO{

    int MIN_FEE = 100;


    /*
     * Interface doesn;t have method body. Only method declaration will be present
     * Abstract methods: Methods which doesn't have method body only for non static methods
     * In Interface we can acheive 100% abstraction
     * We cannot create the object of the interface
     * Instantion of the interface is not allowed
     * With the Interface only Top casting is allowed
     * Down casting is not allowed it will give compile time error
     * Interface variables are static and final in nature by default
     * Private methods are not allowed and it cannot be abstract in nature
     * Final methods are abstract in Interface and it is not allowed in the interface
     * Multiple and Multi-Level interface can be achievable
     * same default methods in the many interfaces that is not allowed
     * cannot create the constructor of the interface
     * In interface no need to write the abstract keyword
     * In interface we can acheive 100% abstarction
     * Interface cannot allow Parent as a class
     * Interface with Class as Parent --> Not Allowed
     */

    public abstract void physioServices();

    public void oncologyServices();

    public void dentalServices();

    public void emergencyServices();

    //private void freeMedical();
    // private methods cannot be overridden

    //final method cannot be overridden
   // public final void medicalResults();



    /*
     * Can i have a method with body? YES
     * After JDK 1.8, its allowed
     * In the interface, we need to have only static methods are allowed
     */
    public static void billing() {
        System.out.println("US Medical Billing");
    }

    /*
     * Second Change
     * Can have non-static method with the method body but it should written default keyword
     * <p>
     * can we override the default method of interface?
     * YES but in the child class the method should be public
     * <p>
     * Default methods will be present in only and only Interface not in the class
     */

    default void medicalInsurance() {
        System.out.println("US -- Medical Insurance");
    }

}
