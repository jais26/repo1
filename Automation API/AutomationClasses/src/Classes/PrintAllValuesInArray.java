package Classes;

public class PrintAllValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] a= {{3,5,6,4,8},{(int) 62.51},{5,34,7,8}};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]+"");
			}
			System.out.println();
		}
		
	}

}
