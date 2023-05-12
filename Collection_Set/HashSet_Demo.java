package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	//Java HashSet class is used to create a collection that uses a hash table for storage. 
	//It inherits the AbstractSet class and implements Set interface

	
//	The important points about Java HashSet class are:
//
//		HashSet stores the elements by using a mechanism called hashing.
//		HashSet contains UNIQUE elements only.
//		HashSet allows null value.
//		HashSet class is non synchronized.
//		HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their HASHCODE.
//		HashSet is the best approach for SEARCH operations.
//		The initial default capacity of HashSet is 16, and the load factor is 0.75
		
		
	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
	
		//Add elements to Hash Set
		hset.add("Apple");
		hset.add("Banana");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("PineApple");
		
		//return false if already element is present
		//HashSet doesn't allow duplicate elements its ignore its and return false
		System.out.println(hset.add("Apple"));		
		if(hset.add("Apple")) {
			System.out.println("Added Apple!!");	
		}else {
			System.out.println(" Apple is allready added !!");
		}
		
		//Search for element in Hashset
		if(hset.contains("Apple")) {
			System.out.println("Apple is present!!!");
		}
		
		//Get the total elements present in HashSet
		System.out.println("size of hash set: "+ hset.size());
	
	
		//Iterate through all the elements
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			
			String fruits = itr.next();
			if(fruits.equals("Orange")) {
				System.out.println("Orange is present");
				//break;
			}else {
				System.out.println(fruits);
			}
			
		}
		
		//Taking out element from hash set
		hset.remove("Orange");
		
		HashSet<String> set1=new HashSet<String>();  
        set1.add("Ajay");  
        set1.add("Gaurav");  
        
        //Add this new hashset to previous original hashset
        hset.addAll(set1);  
        System.out.println("Updated List: "+hset);  
        
        
        //Removing all the new elements from HashSet  
        hset.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+hset);  
	
	
        //Removing elements on the basis of specified condition  
        hset.removeIf(str->str.contains("Ajay"));    
        System.out.println("After invoking removeIf() method: "+hset);
     
        //Removing all the elements available in the set  
        hset.clear();  
        System.out.println("After invoking clear() method: "+hset);  
        
        
        //HashSet from another Collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Bijay");
        list.add("Cjay");
        list.add("Djay");
        list.add(0, "1st element");
        
        hset.addAll(list);
        System.out.println("After invoking addAll() method from another Collection : "+hset);  
        
        HashSet<String> newhashset1 = new HashSet<>(list);
        System.out.println("After invoking new HashSet from another Collection : "+newhashset1);  
        
        
        //Add class Obect in HashSet
        HashSet<Book> hsetBook = new HashSet<>();
        
        Book bk1 = new Book(1, "Charlie And Chocalate Factory", "Roald Dahl", "Quentin Blake", 5);
        Book bk2 = new Book(2, "Great Glass Elevator","Roald Dahl", "Quentin Blake", 3);
        Book bk3 = new Book(3, "Fantastic Mr Fox", "Roald Dahl", "Quentin Blake", 5);
        Book bk4 = new Book(4, "Diary of a Wimpy Kid Dog Days", "Jeff Kinney", "puffinbooks.com", 1);
        
        hsetBook.add(bk1);
        hsetBook.add(bk2);
        hsetBook.add(bk3);
        hsetBook.add(bk4);
        
        System.out.println("List of books: ");
        Iterator<Book> itrBook = hsetBook.iterator();
        while(itrBook.hasNext()) {
        	Book b = itrBook.next();
        	System.out.println(b.bookName + " - By " + b.bookAuthName);
        }
      //Traversing HashSet  
//        for(Book b:hsetBook){  
//        System.out.println("# "+b.bookName+" - By "+b.bookAuthName+" "+b.bookPublisherName+" "+b.bookQty);  
//        }  
        
	}

}



 class Book {
	int bookId ;
	String bookName ;
	String bookAuthName;
	String bookPublisherName;
	int bookQty;
	
	
	Book(int id, String name, String author, String publisher, int quantity){
	
		this.bookId = id;
		this.bookName = name;
		this.bookAuthName = author;
		this.bookPublisherName = publisher;
		this.bookQty = quantity;
	}
	
}



