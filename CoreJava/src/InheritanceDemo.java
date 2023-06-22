class A
{
	void showA()
	{
		System.out.println("I Am Class A");
	}
}
	class B extends A
	{
		void showB()
		{
			System.out.println("I Am Class B");
		}
	}
	class C extends A
	{
		void showC()
		{
			System.out.println(" I Am Class C");
		}
	}

public class InheritanceDemo {
	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();	
		b1.showA();
		c1.showC();
		b1.showB();
	}

}
