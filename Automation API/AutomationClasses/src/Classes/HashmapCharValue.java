package Classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapCharValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> ch = new HashMap<Integer, String>();
		
		ch.put(101, "jyoti");
		ch.put(103, "piyush");
		ch.put(104,"Roopa");
		
		// ch.remove(103);  // to remove any value
		System.out.println(ch);
		
		for(Map.Entry me : ch.entrySet())
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		
		
//		Set set = ch.entrySet();
//		
//		Iterator itr=set.iterator();
//		while(itr.hasNext())
//		{
//	      Map.Entry entry = (Map.Entry) itr.next();
//	      System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//		
//		System.out.println(ch);
//		System.out.println(set);
	}

}
