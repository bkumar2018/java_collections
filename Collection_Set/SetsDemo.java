package Collection_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set is an unordered collection of objects in which duplicate values cannot be stored.
public class SetsDemo {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
//		Set<String> linkHashSet = new LinkedHashSet<String>();   // 
//		Set<String> treeSet = new TreeSet<String>();
		
		
		hashSet.add("India");
		hashSet.add("USA");
		hashSet.add("UK");
		hashSet.add("India");
		hashSet.add("India");
		
		System.out.println(hashSet);   // [USA, UK, India]   Duplicates not get added
		
		//Traverse using for each loop and compare
		for(String str: hashSet) {
			if(str.equalsIgnoreCase("india")) {
				System.out.println("My Country India !!!");
			}
		}
		
		//Check it contains 
		System.out.println("Contains: India : "+hashSet.contains("India"));
		
		//Traverse using Iterator 
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

		//set1 = [1,3,2,4,5,9,0]
		//set2 = [1,3,7,5,6,0,9]	
		
		
		//Union = [0,1,2,3,4,5,6,7,9]
		//Intersection = [1,3,5,9,0]
		//Difference = [2,4,6,7]
		
		setUnion();
		setIntersection();
		setDifference();
	
		
		//LinkedHashSet demo
		linkedHashSet();
		
		//TreeSet demo
		treeSet();
	}
	
	//adds all the elements in one set with the other. //Union = [0,1,2,3,4,5,6,7,9]
	public static void setUnion() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of two sets ");
		System.out.println(union);
		
	}
	
	// To get all common element from given two sets.  //Intersection = [1,3,5,9,0]
	public static void setIntersection() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection of two sets ");
		System.out.println(intersection);
		
	}
	

	// To get difference element from given two sets. //Difference = [2,4,6,7]
	public static void setDifference() {
		

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[]{1,3,2,4,5,9,0}));
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,5,6,0,9}));
		
		//For union
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference of two sets ");
		System.out.println(difference);
		
	}
	
	//LinkedHashSet: It is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
	//When the iteration order is needed to be maintained this class is used. 
	//When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. 
	public static void linkedHashSet() {

		Set<String> lh = new LinkedHashSet<>();
		lh.add("India");
		lh.add("USA");
		lh.add("Australia");
		
		lh.add("India");
		System.out.println(lh);   //[India, USA, Australia]    print o/p in order in which element inserted.
		
		lh.remove("Australia");
		System.out.println(lh);   //[India, USA]
		
		lh.add("UK");
		
		//Traverse using iterator
		Iterator<String> itr = lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	//TreeSet : it stores elements in sorted format. 
	//TreeSet uses tree data structure for storage. Objects are stored in sorted, ascending order.
	public static void treeSet() {
		
		Set<String> ts = new TreeSet<>();
		ts.add("Zebra");
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Onion");
		ts.add("Papaya");
		
		System.out.println(ts);
		ts.remove("Onion");
		System.out.println(ts);
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
