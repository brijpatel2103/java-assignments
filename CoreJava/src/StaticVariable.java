import java.util.Scanner;

public class StaticVariable {
	static int a;
	void SetValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		
	}
	void putValue()
	{
		System.out.println("A : "+a);
		
	}
	public static void main(String[] args) {
		StaticVariable s1= new StaticVariable();
		StaticVariable s2= new StaticVariable();
		StaticVariable s3= new StaticVariable();
		
		s1.SetValue();
		s2.SetValue();
		s3.SetValue();
		
		s1.putValue();
		s2.putValue();
		s3.putValue();
	}
}
