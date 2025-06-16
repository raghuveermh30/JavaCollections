package abstraction;

public abstract class Page {

    /**
     * Abstarct class, we can have both abstract and non abstarct class
     * In Abstract class it is not mandatory to have abstract and non abstract methods
     * In Abstract class, we can have 0-100% abstraction is allowed
     * In abstarction, we can have partial abstraction as well
     * Cannot create the Object of Abstract class
     * But we can create the constructor of Abstract class - This is allowed
     * But this will be called when we create the object of  child class
     * In constructor, first Parent class and child class constructor can be called
     * The Preferance will be always given to Parent class then child class constructor will be called
     */

    //This is mandatory to define the default class constructor
    public Page() {
        System.out.println("Page Constructor..this is default constructor");
    }


    public Page(int a) {
        System.out.println("Page Constructor..this is default constructor.." + a);
    }

    public Page(int a, int b ){
        System.out.println("Page Constructor..this is default constructor.." + (a+b));
    }

    //abstract methods
    public abstract void title();

    public abstract void url();


    //Non-abstract class
    public void loading() {
        System.out.println("Page Loading is taking 20s");
    }

    public final void displayLogo() {
        System.out.println("Amazon Display Logo");
    }

}
