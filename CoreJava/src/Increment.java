import java.util.Scanner;

public class Increment {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a=sc.nextInt();
		++a;
		System.out.println(a);
	}

}
