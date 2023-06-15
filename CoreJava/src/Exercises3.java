import java.util.Scanner;

public class Exercises3 {
	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter quantity");
		x=sc.nextInt();
		if((x*100)>1000)
		{
			System.out.println("you got a discount of" +(.1*x*100)+"and your total cost is" +(x*100-(.1*x*100)));
		}
		else
		{
			System.out.println("no discount");
		}
	}

}
