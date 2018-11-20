package basics.aaf.hashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

//Reference: https://www.geeksforgeeks.org/java-util-hashmap-in-java/
class HashMapDemo {
    public static void main(String[] args) {

        //HashMap is implemented with Arrays of Nodes. 
        //Each Node has {int hash, K key, V value, Node next}
        //Empty hashmap has a capacity of 16 and load factor of 0.75
        //Load Factor 0.75 means that hashmap capacity is doubled when hashmap is filled 75%
        Map<String, Integer> people = new HashMap<>();

        //A node object is created with {hascode=65965, key="Amy", value=19, nextNode=null}
        //This node object address is stored inside people array at index = 13
        people.put("Amy", 19);

        //Behind the scenes:
        //int amyHashCode = "Amy".hashCode(); //output = 65965
        //int n = 16; //initial array size is 16
        //int amyIndex = amyHashCode & (n-1); //output = 13

        
        //A node object is created with {hashcode=71338276, key="James", value=20, nextNode=null}
        //This node object address is stoed inside people array at index = 4
        people.put("James", 20);
        int jamesHashCode = "James".hashCode();
        int jamesIndex = jamesHashCode & 15; //output = 4

        //James is overwritten because HashKey and KeyValue both are equal.
        people.put("James", 40);
        
        //Node created with {hashcode=71576858, key="Jimmy", value=25, nextNode=null}
        //This node object address is stored inside people array at index 11
        people.put("Jimmy", 25);

        //Node created with {hashcode=102053051, key="Kimmy", value=65, nextNode=null}
        //This node address is also expected to be stored at index 11
        //So, Jimmy's nextNode is updated to store reference to Kimmy Node.
        people.put("Kimmy", 65);
        // System.out.println("Jimmy".hashCode() & 15);  
        // System.out.println("kimmy".hashCode() & 15);  

        //method1: iterating using entryset
        for(Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
        System.out.println();
        
        //method2: iterating using iterator
        Iterator<Map.Entry<String, Integer>> iterator = people.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + "-" + entry.getValue() + ", ");
        }
        System.out.println();

        //method3: iterating using lambdas
        people.forEach((k,v) -> System.out.print(k+ "-" + v + ", "));
        System.out.println();

        //method4: iterating over stream
        people.entrySet().stream()
            .forEach( entry -> System.out.print(entry.getKey()+"-"+entry.getValue()+", "));
   
    }
}