public class DiamondStar {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=6-1;i>=1;i--)
		{
			for(j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
