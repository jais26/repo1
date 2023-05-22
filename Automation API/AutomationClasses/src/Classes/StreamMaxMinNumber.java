package Classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,6,87,5,3,5,2,1,-1,10,45,-87);
		
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maximum value " +max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minimum value " +min);
	}

}
