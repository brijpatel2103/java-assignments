import java.lang.reflect.Method;

public class MethodOverloading {
	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 int argument");
	}
	void test(int a,int b)
	{
		System.out.println("test with 2 int argument");
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test();
		m.test(10);
		m.test(10,20);
	}

}
