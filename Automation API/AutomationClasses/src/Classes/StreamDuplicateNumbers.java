package Classes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,6,87,5,3,5,2,1,0,0,10,45,87);
//		Set<Integer> duplicate = list.stream()
//				                       .filter(e->Collections
//					                         .frequency(list,e)>1)
//				                                 .collect(Collectors.toSet());		
//		System.out.println(duplicate);
		
		Set<Integer> dupnum = new HashSet<Integer>();
		Set<Integer> dup = list.stream()
				                  .filter(e ->!dupnum.add(e))
				                      .collect(Collectors.toSet());
		System.out.println(dup);
		
	}
	

}
