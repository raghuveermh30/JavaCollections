package superpackage;

public class Audi extends Car {

    /*
     * Super should be always first statement when we are calling the Constructor
     * Super Keyword will be used for Parent Class Constructor
     * We cannot call the Parent class constructor 2 times
     * Super keyword will be always only one
     * Super cannot be called in the methods.
     *
     * Super Keyword is used for Parent class constructor from the child class constructor
     * But it should be used as first element in the child class constructor
     * Super keyword is used to call Parent class vars/methods in the child class
     * If child class has overridden method name (start), now if i want to use the parent class method then we need to use super.start()
     * If immediate Parent class has no vars/methods then super can be used to call the vars/methods from Grand Parent
     * Super is only applicable for the child class there should be Parent and Child relationship
     * If we have parent as interface then better to avoid super keyword
     */

    /*
     * THIS Keyword
     * this keyword is used to initialise the class/global variables
     * can be used for methods or Constructor
     * can be used for same class Constructor class
     * Recursive constructor calling is not allowed
     * Super and this cannot be together.
     * this if we are using for constructor then this keyword should be first line
     * We can return this keyword from the function: This is called Builder Pattern
     * this keyword will be also used in the encapsulation
     * this keyword cannot be used in the static methods
     */

    public Audi() {
        System.out.println("This is my Audi Default Constructor");
    }

    public Audi(int a) {
        super(100);
        System.out.println("This is my Audi Default Constructor " + a);
    }

    public Audi(int a, int b) {
        super(a,b);
        System.out.println("This is my Audi Default Constructor " + (a + b));
        System.out.println(super.speed);
        super.start();
        //super.testing(); -> this is also allowed but not a good practise. static methods called always using Class name
        Car.testing();
    }

    //Method
    public void billing(){

    }
}
