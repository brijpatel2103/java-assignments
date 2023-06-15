import java.util.Scanner;

public class Exercises1 {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		if(a%5==0 && a%11==0)
		{
			System.out.println("This Number Is Divisible by 5&11");
		}
		else
		{
			System.out.println("This Number Is Not Divisible by 5&&11");
		}
	}

}
