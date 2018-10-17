//Reference:
//Below URL shows how elements are stored in hashtable
//http://stackoverflow.com/questions/9364134/what-hashing-function-does-java-use-to-implement-hashtable-class
/*
 * HashTables are incredibly fast in searching elements.
 * HashTables are used to store key - value pair.
 * HashTables takes Key and calcuate HashFunction like MD5 or SHA1 algorithm.
 * The output of hashfunction returns address in memory where this key-value pair to be stored.
 */

package basics.aag.hashtable;

import java.util.Hashtable;

public class MyHashTable {
	public static void main(String[] args) {
		Hashtable<String,Integer> hashTable = new Hashtable<String,Integer>();
		hashTable.put("One", 1); //Key = One and Value = 1
		hashTable.put("Two", 2);
		hashTable.put("Three", 3);
		hashTable.put("Four", 4);
		hashTable.put("five", 5);
		System.out.println("Below prints out the key - value pair");
		printHashTable(hashTable);//Hashtable does not get printed sequentially
		
		System.out.println();
		System.out.println("Below will overwrite the key \"five\" with value 50");
		hashTable.put("five", 50);
		printHashTable(hashTable);//Hashtable does not get printed sequentially

		
	}
	
	private static void printHashTable(Hashtable<String, Integer> ht) {
		for(String key:ht.keySet()) {
			System.out.print("Key:"+key+" - Value:"+ht.get(key));
			System.out.println();
		}
	}
	
}
