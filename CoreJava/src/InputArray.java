import java.util.Scanner;

public class InputArray {
	public static void main(String[] args) {
		int a[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<a.length;i++)
		{
			System.out.print("Print The Value Of a["+i+"]");
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("The Value Of a["+i+"] is "+a[i]);
		}
			
	}
	

}
