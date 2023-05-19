package Collection_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        
        System.out.println("ArrayList:");
        /*
         * Array List 
         *  Contains duplicate elements
         *  maintains insertion order
         *  non synchronized
         *  allows random access, as array works on an index basis
         *  
         */
        List<String> furits = new ArrayList<String>();
        furits.add("Apple");
        furits.add("Mango");
        furits.add("Banana");

        System.out.println(furits);

        
        //Traversing list through Iterator
        Iterator itr = furits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        furits.set(0, "Aannanas");
        System.out.println("-----");
        //Using for-each loop
        for(String fruit: furits){
            System.out.println(fruit);
        }
        furits.add("Grapes");
        furits.add("Apple");
        //Sort arraylist 
        Collections.sort(furits);
        System.out.println("---After sorting --");
        //Using for-each loop
        for(String fruit: furits){
            System.out.println(fruit);
        }

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(21);
        nums.add(23);
        nums.add(1);
        nums.add(4);

        Collections.sort(nums);
        System.out.println("---Sorting an Integers --");
        //Using for-each loop
        for(Integer num: nums){
            System.out.println(num);
        }

    }
    
}
