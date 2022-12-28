import java.util.Scanner;

public class LaunchDemo1 {

	public static void main(String[] args) {
		System.out.println("Connection Established");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the denominator");
		int b = scan1.nextInt();
		int c = a/b;
		System.out.println(a + " divide by " + b + " is equals to " + c);
		
		System.out.println("Connection Terminated");
	}
	

}
