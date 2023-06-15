import java.util.Scanner;

public class Exercises2 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		a=sc.nextInt();
		System.out.println("Enter breadth");
		b=sc.nextInt();
		if(a==b)
		{
			System.out.println("Square");
		}
		else
		{
			System.out.println("Rectangle");
		}
	}

}
