import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter B :");
		b=sc.nextInt();
		System.out.print("Enter C :");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A Is Greater Number");
			}
			else
			{
				System.out.println("C Is Greater Number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B Is Greater Number");
			}
			else
			{
				System.out.println("C IS Greater Number");
			}
		}
	}

}
