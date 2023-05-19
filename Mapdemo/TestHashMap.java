package ForTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {

	//A Map is useful if you have to search, update or delete elements on the basis of a key.
	//A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
	//A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
	
	/*
	 *Class	Description
	HashMap - 	HashMap is the implementation of Map, but it doesn't maintain any order.
	LinkedHashMap	-	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
	TreeMap	-	TreeMap is the implementation of Map and SortedMap. It maintains ascending order. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		createMap();
		

	}
	
	
	public static Map<String, String> createMap(){
		
		//HashMap is the implementation of Map, but it doesn't maintain any order.
		System.out.println("HashMap is the implementation of Map, but it doesn't maintain any order");
		Map<String, String> hmap = new HashMap<>();
		hmap.put("Book", "The Time Machine");
		hmap.put("Movie", "Top Gun");
		
		for(Map.Entry<String, String> em: hmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		
		//LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
//		Map<String, String> lhmap = new LinkedHashMap<>();
//		lhmap.put("Book", "Theory of Relativity");
//		lhmap.put("Movie", "Maverik");
		Map<String, String> lhmap = new LinkedHashMap<>(hmap);
				
		for(Map.Entry<String, String> em: lhmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		//TreeMap is the implementation of Map and SortedMap. It maintains ascending order. 
//		Map<String, String> tmap = new TreeMap<>();
//		tmap.put("Book", "Diary of Young Girl: ANNE FRANK");
//		tmap.put("Movie", "ANNE FRANK");
//		tmap.put("Id", "1945");
		Map<String, String> tmap = new TreeMap<>(hmap);
		for(Map.Entry<String, String> em: tmap.entrySet()) {
			System.out.println(em.getKey() + " - " + em.getValue());
		}
		
		return null;
		
	}

}
