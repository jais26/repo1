package Classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumberStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(354,535,656,565,666,66,7,22,232,234,233);
		List<Integer> num = number.stream()
				            .map(e->String.valueOf(e))  // it will convert all numbers to string
                              .filter(e->e.startsWith("6"))
                                .map(Integer ::valueOf) // it will give starting numbers 6
                                  .collect(Collectors.toList());
		
		System.out.println(num );
	}

}
