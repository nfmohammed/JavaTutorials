package tutorials.aah.hashset_hashmap;
import java.util.HashMap;
import java.util.HashSet;

//Reference video:https://www.youtube.com/watch?v=jwtx6GVPdyw
//This tutorials explains the difference between HashSet and HashMap
public class HashSetAndHashMap {
	
	//HashSet - Set of Element which contains NO duplicates
	//HashMap - contains Key-Value pair
	public static void main(String[] args){
		System.out.println("Below is HashSet example --------");
		HashSet<Integer> phoneNumber = new HashSet<Integer>();
		phoneNumber.add(12345);
		phoneNumber.add(22222);
		phoneNumber.add(77777);
		phoneNumber.add(55555);
		phoneNumber.add(55555);
		System.out.println("In below example, the duplicate value is removed");
		System.out.println(phoneNumber+"\n");
				
		System.out.println("Now lets remove an object from HashSet");
		phoneNumber.remove(77777);
		System.out.println(phoneNumber+"\n");
		
		System.out.println("Now lets remove an object which is not present");
		phoneNumber.remove(34213);
		System.out.println(phoneNumber+"\n");






		System.out.println("Below is the HashMap Example ----------\n");
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		people.put("Adam", 	2071119900);
		people.put("Brain",	2071199901);
		people.put("Carlos",2079811211);
		System.out.println(people+"\n");
		
		System.out.println("Now lets assign different value to Key \"Adam\"");
		people.put("Adam", 773123000);
		System.out.println(people+"\n");
		
		System.out.println("Now lets remove Carlos from HashMap");
		people.remove("Carlos");
		System.out.println(people+"\n");
		
		System.out.println("Below is example of combination of HashMap and HashSet --------");
		System.out.println("So, lets create some friends of people");
		
		
		HashMap <String, HashSet<String> > person = new HashMap<String, HashSet<String>>();
		
		HashSet<String> aliceFriends = new HashSet<String>();
		aliceFriends.add("Rebecca");
		aliceFriends.add("cibaca");
		aliceFriends.add("montana");
		person.put("Alice", aliceFriends);
		
		HashSet<String> jamesFriends  = new HashSet<String>();
		jamesFriends.add("Bond");
		jamesFriends.add("Royal");
		person.put("James", jamesFriends);
		
		System.out.println(person);
		
		
	}


	public static class HashMapVSHashTable {

    public static void main(String[] args) {
      // TODO Auto-generated method stub
      //Need to comeup with comparison between hashmap vs hashtable
    }

  }
}
