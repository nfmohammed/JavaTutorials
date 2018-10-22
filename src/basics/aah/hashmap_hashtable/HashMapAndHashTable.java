package basics.aah.hashmap_hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
Reference: https://stackoverflow.com/questions/40471/differences-between-hashmap-and-hashtable
Hashtable: 
    - is considered a legacy code.
    - There's nothing about Hashtable that can't be done using HashMap or derivations of HashMap.
	- is synchronized whereas HashMap is not.
	- Order of the map may not remain constant over time
HashMap:
	- is not synchronized which makes it better for non-threaded application 
	- Order of the map may not remain constant over time whereas LinkedHashMap maintains order.

*/
public class HashMapAndHashTable {
    public static void main(String[] args) {

        //----------hashtable ------------------------- 
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		ht.put(101," ajay"); 
		ht.put(101,"Vijay"); 
		ht.put(102,"Ravi"); 
		ht.put(103,"Rahul"); 
		System.out.println("-------------Hash table--------------"); 
		for (Map.Entry m:ht.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 

		//----------------hashmap-------------------------------- 
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		hm.put(100,"Amit"); 
		hm.put(104,"Amit"); // hash map allows duplicate values 
		hm.put(101,"Vijay"); 
		hm.put(102,"Rahul"); 
		System.out.println("-----------Hash map-----------"); 
		for (Map.Entry m:hm.entrySet()) { 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 
    }
}


		

