package array_list_autoboxing_unboxing.array.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args)
    {
  
        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
        
        System.out.println("Keys: " + hash_map.keySet());
        System.out.println("Values: " + hash_map.values());
        
        Set<Entry<Integer, String>> newSet = hash_map.entrySet();
        
        // Using entrySet() to get the set view
        System.out.println("The set is: " + newSet);
        
       for(Entry<Integer, String> s : newSet) {
    	   System.out.println(s);
    	   System.out.println("Key: " + s.getKey());
    	   System.out.println("Value: " + s.getValue());
       }
    }
}
	

