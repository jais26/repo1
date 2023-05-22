package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,-4,5,67,98,534,0,64,23,99,50,-3);
		
		List<Integer> even = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even numbers " +even);
		
		List<Integer> odd = list.stream().filter(e-> e%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers " +odd);
		
	}

}
