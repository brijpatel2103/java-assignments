import java.util.Scanner;

public class Exercises4 {
	public static void main(String[] args) {
		int age;
		String sex;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println("Enter Sex : M/F");
		sex=sc.next();
		if(sex=="F")
		{
			System.out.println("She will work only in Urben Area");
		}
		if(sex=="M")
		{
			if((age>=20) && (age<40))
			{
				System.out.println("He Works In Anywhere");
			}
			else if((age>40) && (age<=60))
			{
				System.out.println("He Works In Only Urben Area");
			}
			else
			{
				System.out.println("ERROR");
			}
		}
		
	}

}
