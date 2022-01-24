package Mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_Demo {

	public static void main(String[] args) {

		//TreeMap and LinkedHashMap have predictable order, while HashMap does not.
		Map<String, String> hm = new HashMap<>();
		Map<String, String> lhm = new LinkedHashMap<>();
		Map<String, String> tm = new TreeMap<>();
		

		Map<String,String> map = cerateMapAndPrint();
		traverseMap(map);
		
	
		// Traversing through the map
		traverseMap();
		
		// LinkedHashMap : Maintain the order of insertion in map.
		linkedhashmapdemo();
		
		
		// TreeMap : Maintains sorted order of keys in map.
		treemapdemo();
		
		// count words in string array
		getCountOfWordsInArray();
		
	}
	
	// Map store in form of key and value
	// map contains unique keys.
	//It stores the data in (Key, Value) pairs. 
	//To access a value one must know its key.
	public static Map<String, String> cerateMapAndPrint() {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("name","Birender");
		hm.put("company", "Datantar");
		hm.put("city", "Pune");
		
		System.out.println(hm);  // {city=Pune, name=Birender, company=Datantar}   //Here its o not maintain the order of insertion
		
		return hm;
	}
		
	public static void traverseMap(Map<String, String> map) {
		for(Map.Entry<String, String> me: map.entrySet()) {
			System.out.println(me.getKey() + " - " + me.getValue());
		}
	}
	
	// Traversing through the map
	public static void traverseMap() {
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("name","Birender");
		hm.put("company", "Datantar");
		hm.put("city", "Pune");
		
		for(Map.Entry<String, String> me: hm.entrySet()) {
			System.out.print(me.getKey());
			System.out.print(" - "+me.getValue());
			System.out.println();
		}
	}
	
	// LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it
	// HashMap provided the advantage of quick insertion, search and deletion but 
	// it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order
	
	public static void linkedhashmapdemo() {
		Map<String, String> lhm = new LinkedHashMap<>();
		lhm.put("name", "Birender");
		lhm.put("company", "Datantar");
		lhm.put("city", "Pune");
		
		System.out.println(lhm);  // {name=Birender, company=Datantar, city=Pune}  Maintains the order of insertion 
	}
	
	
	// TreeMap: stores data using key,value pairs, but in sorted order of keys.
	//  The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. 
	public static void treemapdemo() {

		Map<String, String> tm = new TreeMap<>();
		tm.put("name", "Birender");
		tm.put("company", "Datantar");
		tm.put("city", "Pune");
		
		System.out.println(tm);   // {city=Pune, company=Datantar, name=Birender}   Maintains sorted order of keys 
		System.out.println(tm.size());
		System.out.println(tm.values());
		System.out.println(tm.keySet());
		System.out.println(tm.get("name"));
	}

	//method to getCount of words in string array 
	public static void getCountOfWordsInArray() {
		
		String [] strArr = {"Biren", "Biren", "Sandy"};
		
		HashMap<String, Integer> hmap = new HashMap<>();
		for(String strName: strArr) {
			if(hmap.containsKey(strName)) {
				hmap.put(strName, hmap.get(strName)+1);
			}else {
				hmap.put(strName, 1);
			}
		}
		
		//traverse the hashmap
		for(Map.Entry<String, Integer> mEntry: hmap.entrySet()) {
			System.out.print(mEntry.getKey());
			System.out.println("--"+mEntry.getValue());
		}
	
	}
	
}


/*

Different methods of Map:

put(Object, Object) ----->	This method is used to associate the specified value with the specified key in this map.

putAll(Map)	-----> This method is used to copy all of the mappings from the specified map to this map.

remove(Object)	-----> This method is used to remove the mapping for a key from this map if it is present in the map.

clear() - used to clear and remove all of the elements or mappings from a specified Map collection.

containsKey(Object)  - used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
containsValue(Object) - Same as above


equals(Object) --->	This method is used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.

get(Object) ---->	This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.

size()	-----> This method is used to return the number of key/value pairs available in the map.

entrySet()	---> This method is used to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them.

keySet()  ----->	This method is used to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.

values()	-----> This method is used to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.



*/
