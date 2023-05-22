package Classes;

import java.util.Arrays;
import java.util.List;

public class StreamAverageOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2,423,434,45,-45,5,6,-7);
		double avg = list.stream().mapToDouble(e->e).average().getAsDouble();
		System.out.println("Avarage of numbers " +avg);

		
	}

}
