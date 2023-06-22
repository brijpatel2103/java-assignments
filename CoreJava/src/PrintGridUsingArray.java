
public class PrintGridUsingArray {
	public static void main(String[] args) {
		
		
		int a[][]=new int [10][10];
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.printf("%2d",a[i][j]);
			}
			System.out.println();
		}
		}	

}
