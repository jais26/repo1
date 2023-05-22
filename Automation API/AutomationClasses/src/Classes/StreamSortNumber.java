package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,6,87,5,3,5,2,1,0,0,10,45,87);
		
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("list are in accending order " +sortedList);
		
		List<Integer> sortedlist2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("list of decending order " +sortedlist2);
		 
	}

}
