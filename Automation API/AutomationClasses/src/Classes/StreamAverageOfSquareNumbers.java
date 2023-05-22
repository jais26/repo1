package Classes;

import java.util.Arrays;
import java.util.List;

public class StreamAverageOfSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,10,20,30,15);
		 // 1 , 100, 400, 900, 225   // square of numbers   (e*e)
		// 400, 900, 225     // numbers greater then 100 print   (e> 100)
		// 1525/3  = 508.3333    //average of numbers    
		
		double avg = list.stream()
				     .map(e -> e*e) //square of each elements 
				     .filter(e -> e>100)  // filtering numbers from square  greter then 100 values  filter will print values in boolean value
				     .mapToInt(e -> e) // elements greater than 100 will print in integre values
				     .average()  // it will average of numbers
				     .getAsDouble(); // it will give values in double format
		
		System.out.println("Average of square numbers " +avg);
		
		
		List<Integer> list2 = Arrays.asList(213,324,-45,89);
		double avg2 =list2.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg2);
	}

}
