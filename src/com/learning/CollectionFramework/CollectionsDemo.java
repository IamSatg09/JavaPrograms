package com.learning.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

    // ===== ArrayList Example =====
    System.out.println("=== ArrayList Example ===");
    List<String> arrayList = new ArrayList<>();
    
    // add elements
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");
    arrayList.add(1, "Mango");  // insert at index
    
    System.out.println("ArrayList: " + arrayList);
    
//    // get element
  System.out.println("Element at index 2: " + arrayList.get(2));
//    
//    // set element
        arrayList.set(2, "Orange");
       System.out.println("After set: " + arrayList);
//    
//    // remove element
    arrayList.remove("Banana");
    arrayList.remove(1); // remove by index
   System.out.println("After remove: " + arrayList);
//    
//    // contains, indexOf, lastIndexOf
//    System.out.println("Contains 'Apple'? " + arrayList.contains("Apple"));
    arrayList.add("Apple");
    System.out.println("IndexOf 'Apple': " + arrayList.indexOf("Apple"));
    System.out.println("LastIndexOf 'Apple': " + arrayList.lastIndexOf("Apple"));
    
//    // size, isEmpty, clear
    System.out.println("Size: " + arrayList.size());
    System.out.println("Is Empty? " + arrayList.isEmpty());
    
    // iteration
    System.out.println("Iterating with for-each:");
    for (String s : arrayList) {
        System.out.println(s);
    }
    
    arrayList.clear();
    System.out.println("After clear: " + arrayList);
    
    
    // ===== LinkedList Example =====
    System.out.println("\n=== LinkedList Example ===");
    LinkedList<String> linkedList = new LinkedList<>();
    
    // add elements
    linkedList.add("Red");
    linkedList.add("Green");
    linkedList.add("Blue");
    linkedList.addFirst("Yellow"); // special for LinkedList
    linkedList.addLast("Black");   // special for LinkedList
   
    System.out.println("LinkedList: " + linkedList);
//    
    // get element
    System.out.println("First: " + linkedList.getFirst());
    System.out.println("Last: " + linkedList.getLast());
    System.out.println("Element at index 2: " + linkedList.get(2));
    
    // set element
    linkedList.set(2, "White");
    System.out.println("After set: " + linkedList);
    
    // remove element
    System.out.println(linkedList.remove("Green"));
    linkedList.remove(1);
    linkedList.removeFirst();
    linkedList.removeLast();
    System.out.println("After remove: " + linkedList);
    
    // contains
    System.out.println("Contains 'Blue'? " + linkedList.contains("Blue"));
    
    // size, isEmpty
    System.out.println("Size: " + linkedList.size());
    System.out.println("Is Empty? " + linkedList.isEmpty());
    
    // iteration with iterator
    System.out.println("Iterating with Iterator:");
    Iterator<String> it = linkedList.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
    
    linkedList.clear();
    System.out.println("After clear: " + linkedList);
}

}
