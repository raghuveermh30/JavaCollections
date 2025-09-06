package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {

        double arr[] = {1,2,2,2,3,4,2,4,4,5,7,8,0.8};

       // System.out.println("******");

        Set<Double> set = new HashSet<>();

        for(double store: arr){
            set.add(store);
        }

     //   set.forEach(s -> System.out.println(s));


        Map<Double, Integer> map = new HashMap<>();

        for(double m : set){

            if(map.containsKey(m)){
                map.put(m, map.get(m)+1);
            }

            else{
                map.put(m, 1);
            }

        }

        map.forEach((K, V) -> System.out.println(K + " " +V));



    }
}
