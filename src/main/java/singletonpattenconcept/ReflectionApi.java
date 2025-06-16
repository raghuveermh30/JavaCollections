package singletonpattenconcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionApi {

    public static void main(String[] args) {

        Browser instance1 = Browser.getInstance();
        Browser instance2 = null;

        try {
            Constructor<Browser> constructor = Browser.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            try {
                instance2 = constructor.newInstance();

                System.out.println("Hashcode of instance1 " + instance1.hashCode());
                System.out.println("Hashcode of instance2 " + instance2.hashCode());

            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
