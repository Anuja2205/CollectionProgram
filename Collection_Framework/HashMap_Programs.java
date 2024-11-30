package Collection_Framework;

import java.sql.SQLOutput;
import java.util.*;

public class HashMap_Programs {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

//  1.Write a Java program to associate the specified value with the specified key in a HashMap.//

        map.put("1", "Anuja");
        map.put("2", "Pragati");
        map.put("3","Shreyas");
        map.put("4", "Anurag");

        System.out.println(map);

//  2. Write a Java program to count the number of key-value (size) mappings in a map. //

        System.out.println("2.Size of Map " +  map.size());

//  3. Write a Java program to copy all mappings from the specified map to another map. //

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("5", "Abcd");
        map1.put("6", "Xyz");
        map1.put("7", "Pqr");

        System.out.println("3.Before Copy " +map1);

        map1.putAll(map);

        System.out.println("After copy " + map1);

//  4. Write a Java program to remove all mappings from a map. //

        map.clear();
        System.out.println("4.After removing mappings " + map);

//  5. Write a Java program to check whether a map contains key-value mappings (empty) or not. //

        System.out.println("5." + map.isEmpty());

//  6. Write a Java program to get a shallow copy of a HashMap instance. //

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("12", "12121");
        map2.put("16", "fddfdf");
        map2.put("14", "6767");

        System.out.println("6.Before cloning " + map2);

        map2.clone();
        System.out.println("After cloning "+ map2);

//  7. Write a Java program to test if a map contains a mapping for the specified key. //

        System.out.println("7.key " + map1.containsKey("6"));

//  8. Write a Java program to test if a map contains a mapping for the specified value. //

        System.out.println("8.Value " + map2.containsValue("6767"));

//  9. Write a Java program to create a set view of the mappings contained in a map. //

        System.out.println("9.Set view of mappings "  + map1.entrySet());

//  10. Write a Java program to get the value of a specified key in a map. //

        System.out.println("10.Specified key value " + map1.get("5"));

//  11. Write a Java program to get a set view of the keys contained in this map. //

        System.out.println("11.Set view of the keys " + map1.keySet());

//  12. Write a Java program to get a collection view of the values contained in this map.//

        Collection<String> values = map1.values();
        System.out.println("12.Collection of values:" );

        for (String value : values){
            System.out.println(value);
        }

    }


}
