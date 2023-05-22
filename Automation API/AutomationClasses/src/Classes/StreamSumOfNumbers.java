package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(32,434,454,5,565);
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println("sum of numbers is " +sum.get());
		
		List<Integer> list2 = Arrays.asList(44,43,324,234,432);
		Optional<Integer> sub = list2.stream().reduce((a,b)->a-b);
		System.out.println("substraction of numbers " +sub.get());
		
		List<Integer> list3 = Arrays.asList(234,554,565,6);
		Optional<Integer> multiple = list3.stream().reduce((a,b)->a*b);
		System.out.println("Multiplication of numbers " +multiple.get());
		
		List<Integer> list4 = Arrays.asList(2434,535,4554,6);
		Optional<Integer> divid = list4.stream().reduce((a,b)->a/b);
		System.out.println("Division of numbers " +divid.get());
		
		List<Integer> list5 = Arrays.asList(4234,432,5,55,6);
		Optional<Integer> mod =list5.stream().reduce((a,b)-> a%b);
		System.out.println("Modulus of numbers " +mod.get());
		
//		List<Integer> list6 = Arrays.asList(24,34,32);
//		Optional<Integer> factorial = list6.stream().reduce((a,b)-> a*b);
	}

}
