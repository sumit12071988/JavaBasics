package JavaBasics.HashMapAndHashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapVsHashtable {

	public static void main(String[] args) {
//		HashMap<String, String> userMap1 = new HashMap<String, String>();
		// HashMap is a Collection which stores data in KEY-VALUE pair.
		// HashMap is having a parent interface "Map", thus we can also write with Top casting by using Parent Interface Reference i.e.
		
		Map<String,String> userMap = new HashMap<String, String>();
//		// We'll prefer to use with Map interface so that later we can use it use the same userMap for some other HashMap as well just like 
//		//	WebDriver driver = new ChromeDriver(); 
//		//	WebDriver driver = new FirefoxDriver();
//		
//		// To ADD/PUT data inside HashMap	| hashMap.put("KEY","Value");
//		userMap.put("id", "1");
//		userMap.put("name", "Tom");
//		userMap.put("city", "Bangalore");
//		userMap.put(null, "pune");
//		userMap.put(null, "Hyderabed");		// Only One Null Key Allowed, Latest Value which is mapped to null key will override other values.
//		userMap.put("company", null);		// Keys can have multiple null values
//		userMap.put("country", null);		// Keys can have multiple null values
//		
//		// To GET | hashMap.get("KEY");
//		System.out.println(userMap.get("id"));	// O/p: 1
//		System.out.println(userMap.get(0)); 	// O/p will be null since there is no Key "0" for which any value is set
//			// HashMap is orderless. Thus Values are not store based on index, but based on KEY
//			// Since values are not stored based on index, then we cannot use for loop for traversing inside the HashMap
//		
//		// To get count of contents inside HashMap	|	hashMap.size();
//		System.out.println(userMap.size()); 	// This will give you the no. of KEY-VALUE pairs
//		
//		// TRAVERSING INSIDE THE HASHMAP
//		
//		for (Map.Entry m: userMap.entrySet()) {
//			System.out.println(m.getKey() + "  "+ m.getValue());	// Selects data from last to first
//		}
		
		// HASHMAPS ARE EXTENSIVELY USED IN API's
			
			
		// HASH TABLE
		
		Hashtable<String,Integer> productTable = new Hashtable<String, Integer>();		
		//	Hashtable maintains all data in KEY-VALUE format just like HashMap
		
		// ADDING CONTENT IN HASHTABLE
		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows HP Laptop", 1000);
		productTable.put("Apple iPhone X", 1500);
		//productTable.put("Apple iPhone XS",null);	// o/p: Null pointer exception
		//productTable.put(null,2000);				// o/p: Null pointer exception
		
		
		// GETTING CONTENT FROM HASTABLE
//		System.out.println(productTable);		//	O/p: {Apple iPhone X=1500, Apple MacBook=2000, Windows HP Laptop=1000}
//		System.out.println(productTable.get("Apple MacBook"));	//	O/p: 2000
		
		
		// TRAVERSING INSIDE THE HASHTABLE
		for (Map.Entry m: productTable.entrySet()) {
		System.out.println(m.getKey() + "  "+ m.getValue());
			/* O/p:
			 * Apple iPhone X 1500 
			 * Apple MacBook 2000 
			 * Windows HP Laptop 1000
			 * 
			 */
		}
		
		
		// DIFFERENCE B/W HASHMAP and HASHTABLE?
		// Both stores data in KEY-VALUE pair in same way.
		//	1. HashMap is NON-SYNCHRONIZED -- Hashtable is SYNCHRONIZED
		//		It cannot be shared b/w many threads without proper synchronization.
		//		Not thread safe i.e. if I've created a HashMap with multiple Key-Value pairs and then I notice multiple threads are running for parallel execution. 
		//			If Multiple threads are trying to READ/GET the data from HashMap, there won't be a problem. But, if one thread is UPDATING the value of a Key and 
		//			at the SAME	time (before update is completed), another thread tries to READ/GET the data from the Key, then it might get old value instead of updated 
		//			value.
		//		On the other hand, HashTable performs operations in a SINGLE THREAD operations. When one thread is performing any activity on HashTable, other thread will be
		//		made to wait until the previous thread's activity is completed.
		//		
		//		After jdk 1.8, we've CONCURRENT HASHMAP, with which we can make a HashMap a SYNCHONIZED Hashmap.
		//		In CONCURRENT HASHMAP, only a section of HasMap will be with CONCURRENT HASHMAP.
		//		
		//	2. HASHMAP ALLOWS NULL KEYS, HASHTABLE DOESN'T
		//		HashMap allows one NULL KEY in which multiple NULL values can be stored. 
		//			Stored in Overridden fashion i.e. latest value which is mapped to "null" KEY will override previous Value which is mapped to the "null" key.
		//		HashTable neither allows KEY or VALUE to have null.
		
		// That is the reason HASHMAP is the preferred over HASHTABLE since it allows null as KEY as well as VALUE. Onlly we need to take care of the SYNCHRONIZATION problem
		
	}

}
