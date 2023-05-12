package Mapdemo;

import java.util.*;

public class TestMap {

    //A Map is useful if you have to search, update or delete elements on the basis of a key.
    //A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.

    //A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
    /*
    Class	Description
    HashMap -	HashMap is the implementation of Map, but it doesn't maintain any order.
    LinkedHashMap -	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
    TreeMap -	TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
     */
    public static void main(String  args[]){
        createMap();

    }

    public static Map<String, String> createMap(){

        //HashMap is the implementation of Map, but it doesn't maintain any order.
        System.out.println("*** HashMap doesn't maintain any order not even insertion order, random order");
        Map<String, String> hmap = new HashMap<>();
        hmap.put("Name", "Birender");
        hmap.put("Age", "41");
        hmap.put("City", "Pune");

        //Traverse a map
        for(Map.Entry<String,String> me: hmap.entrySet()){
            System.out.println(me.getKey()+ "--"+ me.getValue());
        }


        //LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
        System.out.println("*** LinkedHashMap maintains insertion order");
        Map<String, String> lhmap = new LinkedHashMap<>();
        lhmap.put("Name", "Birender");
        lhmap.put("Age", "41");
        lhmap.put("City", "Pune");

        //Traverse a map
        for(Map.Entry<String,String> me: lhmap.entrySet()){
            System.out.println(me.getKey()+ "--"+ me.getValue());
        }

        System.out.println("*** TreeMap is the implementation of Map and SortedMap. It maintains ascending order.");
        Map<String, String> tmap = new TreeMap<>();
        tmap.put("Name", "Birender");
        tmap.put("Age", "41");
        tmap.put("City", "Pune");

        //Traverse a map
        for(Map.Entry<String,String> me: tmap.entrySet()){
            System.out.println(me.getKey()+ "--"+ me.getValue());
        }


        return null;
    }
}
