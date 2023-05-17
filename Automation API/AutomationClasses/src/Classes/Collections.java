package Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare array list
		ArrayList<String> al = new ArrayList<String>();
		al.add("J");  // index=0
		al.add("P");  // index=1
		al.add("S");  // index=2
		al.add("A");  // index=3
		al.add("G");  // index=4
		al.add("H");  // index=5
		
	   System.out.println(al);  // print all list of array al
		
	   ArrayList<String> al2 = new ArrayList<String>();
	   System.out.println("Before adding:" +al2);  // this will print same al2 blank array list
	   
	   al2.addAll(al);  // this will add all al list in al2
	   System.out.println("after adding:" +al2);
	   
	   al2.removeAll(al); //this will remove all list from al
	   System.out.println("after removing:" +al2);
	   
	   //loop through elemnets of array list
	   // for loop
	   
	   for(int i=0; i<al.size();i++)
	   {
		   System.out.println("getting all al list :" +al.get(i));
	   }
	   
	   // for ... each loop concept
	   for(String i:al)  //it will add values for each i element of al
	   {
		   System.out.println("Using for each loop : " +i);
	   }
		
	   // iterator
	   Iterator<String> it = al.iterator();
	   while(it.hasNext())   // it will iterate all the elements from al array list
	   {
		   System.out.println("iterator using :" +it.next());
	   }
	   
	   // Sort arraylist
	   System.out.println("Before sorting: " +al);
	   Collections.sort(al,Collections.reverseOrder());
	   System.out.println("after sorting :" + al);
	   
	   //Shuffle arraylist
	   Collections.shuffle(al);
	   System.out.println("after shuffle:" +al);
	   
	   //create string array
	   String cars[] = {"volvo","BMW", "Ford" };
	   
	   ArrayList<String> al21 = new ArrayList<String>(Arrays.asList(cars));
	   System.out.println("string array : " +al21);
	   
		
	}

	private static void shuffle(ArrayList<String> al) {
		// TODO Auto-generated method stub
		
	}

	private static void sort(ArrayList<String> al, Object reverseOrder) {
		// TODO Auto-generated method stub
		
	}

	private static Object reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
