public class Pattern6 {
	public static void main(String[] args) {
		int i,j;
		int num=1;
		
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
