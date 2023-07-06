import java.util.Scanner;

public class ThrowDemo {
	public static void demo()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter X : ");
			x=sc.nextInt();
			if(x>0)
			{
				System.out.println("Square of "+x+" Is "+(x*x));
			}
			else
			{
				throw new ArithmeticException();
				
			}
		}catch(ArithmeticException e)
		{
			System.out.println("Please Enter Positive Values Only.");
			demo();
			
			
			
		}
	
	}
	public static void main(String[] args) {
		demo();
		
	}

}
