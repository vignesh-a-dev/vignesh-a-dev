package collections.EMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class assignment2_listofname_Repeated {

   
    public static Map<String, Integer> countOccurrences(List<String> list) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String name : list) {
            if (nameCountMap.containsKey(name)) {
                nameCountMap.put(name, nameCountMap.get(name) + 1);
            } else {
                nameCountMap.put(name, 1);
            }
        }
        return nameCountMap;
    }

  
    public static void printOccurrences(Map<String, Integer> nameCountMap) {
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

   
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("vicky");
        names.add("babu");
        names.add("vicky");
        names.add("Charlie");
        names.add("babu");
        names.add("vicky");

        // Count occurrences of each name
        Map<String, Integer> nameCountMap = countOccurrences(names);

        // Print the occurrences
        printOccurrences(nameCountMap);
    }
}

