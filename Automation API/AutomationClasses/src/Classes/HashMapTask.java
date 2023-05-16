package Classes;

import java.util.HashMap;

public class HashMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Jyootii";
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		
		for(int i=0; i<a.length();i++)
		{
			if(count.containsKey(a.charAt(i)))
			{
				int counts = count.get(a.charAt(i));
				count.put(a.charAt(i),++counts);
			}
			else
			{
				count.put(a.charAt(i), 1);
			}
		}
		
		System.out.println(count);
	}

}
