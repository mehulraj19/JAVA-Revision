package collectionsJava.HashMapJava;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
//        Important points about HashMap:
//        1. Un-ordered
//        2. Allows 1 null key object, all keys need to be unique
//        3. Allows many null values, values may or may not be unique
//        4. Takes constant time --- O(1) for Retrieval and Insertion of data
//        5. It's not thread safe. If multiple threads access the Hashmap, inconsistencies are possible.


        HashMap<String, Integer> map = new HashMap<>();

        // Inserting Data in hashmap
        map.put("mehul", 100);
        map.put("rahul", 99);
        map.put("mohan", 101);

        // map size
        System.out.println("hashMap size is : " + map.size());
        System.out.println("Initial map: " + map);

        // Updating value of hashmap
        map.put("mehul", 102);
        System.out.println("1st change in map : " + map);

        // Removing element of hashmap
        map.remove("mohan");
        System.out.println("end change in map : " + map);

        // Reading all Elements Hashmap
        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println("Key : " + e.getKey() + ", Value : " + e.getValue());
        }

        // cloning hashmap
        HashMap<String, Integer> mapClone = (HashMap<String, Integer>) map.clone();
        System.out.println(mapClone);
        mapClone.clear();

        // checking if element exists in hashmap
        System.out.println("does mehul elements in map? " + map.containsKey("mehul"));
        System.out.println("does 101 value is map? " + map.containsValue(101));

        // All key set
        System.out.println("All keys in map are : " + map.keySet());
        System.out.println("All values in map are : " + map.values());

        // checking if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // getting value of particular key from map
        System.out.println("mehul value is : " + map.get("mehul"));

        // map --- entryset
        System.out.println("all elements are : " + map.entrySet());

        // compute method
        map.compute("mehul", (key, value) -> (value < 100) ? value + 100 : value);
        System.out.println("new value of map[mehul]: " + map.get("mehul"));

        // compute if absent
        map.computeIfAbsent("monu", key -> 10*20+10);
        System.out.println("new map: " + map);

        // compute if Present
        map.computeIfPresent("monu", (key, val) -> val + 10);
        System.out.println("map is : " + map);

        // clearing hashmap
        map.clear();
        System.out.println(map);
    }
}
