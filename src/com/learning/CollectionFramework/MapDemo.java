package com.learning.CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String args[])
	{
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1,"apple");
		map.put(3,"mango");
		map.put(2,"orange");
		map.put(4,"grape");
		map.put(5, "red banana");
		
		System.out.println("Key 1 value:"+map.get(1));
		
		System.out.println("hashmap:"+map);  //order not guranteed
		System.out.println("hashmap keys:"+map.keySet());
		System.out.println("hashmap values:"+map.values());
		System.out.println("Hashmap key value pairs"+map.entrySet());

		LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
		map2.put(1,"apple");
		map2.put(3,"mango");
		map2.put(2,"orange");
		map2.put(4,"grape");
		map2.put(5, "red banana");
		
		System.out.println("linkedhashmap"+map2);  //follows insertion order
		
		
		TreeMap<Integer,String>map3=new TreeMap<>();
		map3.put(1,"apple");
		map3.put(3,"mango");
		map3.put(2,"orange");
		map3.put(5,"grape");
		map3.put(4, "red banana");
		System.out.println("treemap"+map3);  //follows sorted order

	}

}
