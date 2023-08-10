import java.security.PublicKey;

public class StaticMethod {
	static int a=10;
	static int b;
	static 
	{
		System.out.println("Static Block Initialized 1");
	}
	{
		System.out.println("Block 1");
	}
	static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	static 
	{
		System.out.println("Static Block initialized");
		b=a*4;
		
	}
	public static void main(String[] args) {
		meth(15);
		StaticMethod s1=new StaticMethod();
	}
	public StaticMethod() {
		System.out.println("Default Constructor");
	}
	{
		System.out.println("Block 2");
	}

}
