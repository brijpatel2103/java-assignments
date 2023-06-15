import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("Sum :"+sum);
}

}
