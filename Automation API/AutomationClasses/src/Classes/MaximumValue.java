package Classes;

import java.util.Scanner;

public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =sc.nextInt();
		
		int [] array = new int[size];
		System.out.println("Enter " +size+ " values");
		
		for(int i=0; i < array.length; i++)
			array[i] =sc.nextInt();
		int max = getMaxValue(array);
		System.out.println("Maximum value is " +max);
		
	}

	private static int getMaxValue(int[] array) {
		// TODO Auto-generated method stub
		int max= array[0];
		for(int i =0; i< array.length;i++)
			if(array[i] > max)
			{
				max = array[i];
			}
		return 0;
	
	
//	
//		  int [] arr = new int [] {25, 11, 7, 75, 56};  
//	       
//	        int max = arr[0];  
//	       
//	        for (int i = 0; i < arr.length; i++) {  
//	            
//	           if(arr[i] > max)  
//	               max = arr[i];  
//	        }  
//	        System.out.println("Largest in array: " + max);  
//	}
//}
	
	
	
	
	}

}
