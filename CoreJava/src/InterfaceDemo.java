interface ifs1
{
	static void meth1() {
		System.out.println("Meth1 defined in ifs1");
		
	}
	 
	
}
interface ifs2 extends ifs1

{
	void meth2();
	
}
class abs3 implements ifs2
{
	public void meth2()
	{
		System.out.println("Meth2 In Abs2");
	}
}
public class InterfaceDemo implements ifs1, ifs2
{

	
	public void meth2() {
		System.out.println("Meth2");
		
	}


	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		ifs1.meth1();
		i.meth2();
		
	}

	
	

}
