package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3,4,6,87,5,3,5,2,1,0,0,101,45,87);
		
		List<Integer> i=list.stream().limit(6).collect(Collectors.toList());
		System.out.println("printing values 1 to 6 " +i);
		
		int sum=list.stream().limit(6).reduce((p, q) -> p+q).get();
		System.out.println("sum of 1 to 6th values " +sum);
		
		// skiping rest numbers which are printed
		List<Integer> skip = list.stream().skip(6).collect(Collectors.toList());
		System.out.println("after skiping 6 numbers rest number will print " +skip);
		
		int sumskip =list.stream().skip(6).reduce((p, q) -> p+q).get();
		System.out.println("sum of 6th to rest numbers values " +sumskip);
	}

}
