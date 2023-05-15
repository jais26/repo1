package Classes;

public class MultiDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][] a = {{{4,34,4,454,5},{5,2,6,5},{45,4,56,6,2,3}}};
		
		for( int i=0 ; i < a.length; i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				for(int k=0; k<a[i][j].length;k++)
				{
					System.out.print(a[i] [j]  [k]+ ",");
				}
			}
		}
	}
}
		
	


