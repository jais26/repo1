package Classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,6,87,5,3,5,2,1,0,0,101,45,87);
		
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second highest " +secH);
		
		int secHh = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second highest " +secHh);
		
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second lowest number " +secL);
 	}

}
