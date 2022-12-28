//Example of throwing exceptions, and good practice - to include throw in the signature.

import java.util.InputMismatchException;
import java.util.Scanner;

class Demo1{
	void fun1() throws ArithmeticException{
		System.out.println("Connection Established");
		
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the denominator");
			int b = scan1.nextInt();
			int c = a/b;
			System.out.println(a + " divide by " + b + " is equals to " + c);
	}
}

class Demo2{
	void fun2() throws InputMismatchException{
		System.out.println("Connection Established");
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the denominator");
		int b = scan1.nextInt();
		int c = a/b;
		System.out.println(a + " divide by " + b + " is equals to " + c);
		} catch (InputMismatchException e) {
			System.out.println("Problem solved in fun2");
			throw e;
		} finally {
			System.out.println("Connection1 Terminated");
		}
	
		
	}
}

public class Launch {

	public static void main(String[] args) {

		try {
//			Demo1 d = new Demo1();
//			d.fun1();
			Demo2 d2 = new Demo2();
			d2.fun2();
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException also caught and resolved in main");
		}
		System.out.println("Connection2 Terminated");
	}

}
