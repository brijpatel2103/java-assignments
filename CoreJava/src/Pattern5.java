public class Pattern5 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=6;i++)
		{
			for(k=1;k<7-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}

}
