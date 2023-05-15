package Classes;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {4324,43,53,5,3,3,2,435};
		int min = a[0];
		
		for(int i=0; i< a.length; i++)
		{
			if(a[i]<min)
		
			min=a[i];
		}
		System.out.println("Minimum vaue is " +min);
	}

}
