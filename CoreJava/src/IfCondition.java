import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("A is Even number");
		}
		else
		{
			System.out.println("A is Odd number");
		}
	}

}
