package singletonpattenconcept;


import java.io.Serializable;

public class Browser implements Serializable, Cloneable {



    /*
     * The Singleton Pattern is a Java Design Pattern that restricts the instantiation of a class to one "single" instance.
     * This is useful when exactly one object is needed to coordinate actions across the system.
     * The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.
     * Create the object at single time
     * The purpose of Singleton Pattern is to control the object creation, limiting the number of objects to one only.
     */

    //1. Private Static instance of the class
    private static volatile Browser browser; //null

    //2. Private Constructor to prevent the instantiation
    private Browser() {
       if (browser != null) { //handling reflection attack
            throw new IllegalArgumentException("Object already Exist"); //
        }
    }

    //3. Public static method to provide the access to the object/instance

    // To achieve Multi-threading, we need to add Synchronized keyword
    public static Browser getInstance() {
        if (browser == null) { // Double-checked synchronization. Performance is improved
            synchronized (Browser.class) {
                if (browser == null) {  // Check again to avoid multiple threads creating multiple instances
                    browser = new Browser();
                }
            }
        }
        return browser;
    }


    //Individual Methods

    public void displayMsg() {
        System.out.println("Browser Info");
    }


    //Singleton Pattern with Serialization - How to prevent Object creation during Serialization
    //Add readResolve() -- which will be called during the De-Serialization process -- this will return Class Instance
    protected Object readResolve() {
        return getInstance();
    }

    //Singleton Pattern with Cloning using Cloneable Interface - How to prevent it?
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton Instance Cannot be Cloned...");
    }
}
