package singletonpattenconcept;

import org.testng.annotations.BeforeTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserTestReflectionAttack {

    public static void main(String[] args) {

        Browser instance1 = Browser.getInstance();
        Browser instance2 = null;

        try {
            Constructor<Browser> constructor = Browser.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance();

            System.out.println("Hashcode of instance1: " + instance1.hashCode());
            System.out.println("Hashcode of instance2: " + instance2.hashCode());


        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}
