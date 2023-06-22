class Rectangle
{
	double length,width;
	Rectangle()
	{
		System.out.println("Default Rectangle");
		length=6;
		width=8;
		
	}
	Rectangle(double l, double w)
	{
		System.out.println("Parameterized Constructor");
		length=l;
		width=w;
		
	}
	Rectangle(Rectangle r)
	{
		System.out.println("Copy Constructor Called");
		length=r.length;
		width=r.width;
	}
	void volume()
	{
		System.out.println("Volume : "+(2*(length*width)));
		
	}
	
}
public class RectangularConstructor {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.volume();
		Rectangle r2=new Rectangle(5,8);
		r2.volume();
		Rectangle r3=new Rectangle(r1);
		r3.volume();
		
	}
}
