// If you don't have a Exception handler, it will go through each class that you called the method of,
// in an attempt to look for Exception handler - not desirable.
import java.util.Scanner;

class Demo1{
	void fun1() {
		System.out.println("Connection Established");
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the denominator");
			int b = scan1.nextInt();
			int c = a/b;
			System.out.println(a + " divide by " + b + " is equals to " + c);
		
		
			System.out.println("");

		System.out.println("Connection Terminated");
	}
}

//class Demo2 {
//	void fun2() {
//		Demo1 d1 = new Demo1();
//		d1.fun1();
//	}
//}

class Demo3 {
	void fun3() {
		Demo1 d2 = new Demo1();
		d2.fun1();
	}
}

class Demo4{
	void fun4() {
	
		Demo3 d3 = new Demo3();
		d3.fun3();
		
	}
}
public class Launch {

	public static void main(String[] args) {
		try{
			Demo4 d4 = new Demo4();
			d4.fun4();
		} catch (ArithmeticException e) {
			System.out.println("Error caught and resolved in main");
			e.printStackTrace(); 
//			^^ To print errors regardless, so as to track.
		}
	}

}
