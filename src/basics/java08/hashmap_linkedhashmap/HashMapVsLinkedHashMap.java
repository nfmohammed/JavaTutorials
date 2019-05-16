package basics.java08.hashmap_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        
        // HashMap does not preserve the order in which items were added
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("steve", "jones");
        stringMap.put("mark", "colley");
        stringMap.put("raja", "kanmani");
        stringMap.put("mark", "scmanzskey");
        stringMap.put("perry", "osland");
        stringMap.put("linda", "dwane");

        
        // LinkedHashMap preserves the order in which items were added
        Map<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("steve", "jones");
        linkedMap.put("mark", "colley");
        linkedMap.put("raja", "kanmani");
        linkedMap.put("mike", "scmanzskey");
        linkedMap.put("perry", "osland");
        linkedMap.put("linda", "dwane");

        System.out.println(stringMap);
        System.out.println("---------------");
        System.out.println(linkedMap);
    }
}