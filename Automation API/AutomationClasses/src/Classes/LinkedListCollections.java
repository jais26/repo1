package Classes;

import java.util.LinkedList;

public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jyoti");
		ll.add("roopa");
		ll.add("piyush");
		ll.add("Mashkur");
		ll.add("Shubham");
		ll.add("Gaurav");
		
		System.out.println("Linkedlist : " +ll);
		ll.add(1,"shilpi");
		System.out.println("After adding shilpi at 1st index : " +ll);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("siddik");
		ll2.add("nitu");
		ll2.add("ankit");
		
		// Add collection2 ll2 to the end of collection1 ll
		ll.addAll(ll2);
		System.out.println("After adding collection2 to collection 1 : " +ll);
		
		//remove methods
		ll.remove("shilpi");
		System.out.println("after removing shilpi from collection1 : " +ll);
		
		// removing based on index value
		ll.remove(2);
		System.out.println("After removing based on index number: " +ll);
		
		//remove all to remove all from collection
		ll.removeAll(ll2);
		System.out.println("removing collection2 from 1 : " +ll);
		
		// get element of positon 1st
        System.out.println("first position is : " +ll.get(1));
        
        // replacing any element (replace roopa by prerna
        ll.set(1, "prerna");
        System.out.println("replacing roopa by prerna element " +ll);
        
        // containes method  to check if jyoti exist in the collection or not
        System.out.println("if jyoti exist it will print true else false ---" +ll.contains("Jyoti"));
        
        // clear the collection
        ll.clear();
        System.out.println("after removing all the elemnts from collection " +ll);
		
	}

}
