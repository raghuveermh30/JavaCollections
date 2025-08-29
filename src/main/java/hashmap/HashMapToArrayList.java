package hashmap;

import java.util.*;

public class HashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 1000);
        compMap.put("WallMart", 2000);
        compMap.put("Amazon", 3000);
        compMap.put("Facebook", 4000);
        compMap.put("Cisco", 5000);

        System.out.println("Company map Size is : " + compMap.size());

        Iterator it = compMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " " + pairs.getValue());
        }

        System.out.println("************");

        //Convert the keys into the ArrayList
        List<String> companyNamesList = new ArrayList<>(compMap.keySet());
        System.out.println("Company List Size = " + companyNamesList.size());
        for (String t : companyNamesList) {
            System.out.println(t);
        }
        System.out.println("************");
        //Convert the values into the ArrayList
        List<Integer> employeeCountList = new ArrayList<>(compMap.values());
        System.out.println("Company Employee Size = " + employeeCountList.size());
        for (Integer t : employeeCountList) {
            System.out.println(t);
        }
    }
}
