package Vector;

import java.util.Vector;

public class Vector2DConcept {

    public static void main(String[] args) {

        Vector<String> langVector = new Vector<>();
        langVector.add("Java");
        langVector.add("Python");
        langVector.add("JavaScript");
        langVector.add("Ruby");

        System.out.println(langVector);

        Vector osVector = new Vector<>();
        osVector.add(langVector);

        for (int i = 0; i < langVector.size(); i++) {
            String str = (String) ((Vector) osVector.get(0)).get(i); //Vector 2D concept -> Vector inside the Vector
            System.out.println(str);

        }


    }
}
