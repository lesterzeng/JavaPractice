import java.util.InputMismatchException;
import java.util.Scanner;

public class LaunchDemo2 {

	public static void main(String[] args) {
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
		
			// must be positive value
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int size = scan2.nextInt();
			int arr[] = new int[size];
			
			// mismatch of input
			System.out.println("Enter the element to be inserted");
			int elem = scan.nextInt();
			
			// out of bound of in array
			System.out.println("Enter the position at which element should be inserted");
			int position = scan.nextInt();
			
			arr[position] = elem;
	
		
			} catch (ArithmeticException e) {
				System.out.println("Please enter non-zero denominator");
			} catch (NegativeArraySizeException e) {
				System.out.println("Please enter positive number");
			} catch (InputMismatchException e) {
				System.out.println("Your element has to be integer type");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Value is beyond array limits");
			} catch (Exception e) {
				System.out.println("Something went wrong");
			}
			
			System.out.println("Connection Terminated");
			System.out.println("");
			
//			try {
//				int[] x = {4, 5, 8};
//				Scanner scan2 = new Scanner(System.in);
//				System.out.println("Enter the index of array");
//				int y = scan2.nextInt();
//				System.out.println(x[y]);
//			} catch(ArrayIndexOutOfBoundsException e1) {
//				System.out.println("Index out of bounds. Restart program and try again.");
//			}
//			
			System.out.println("");

		System.out.println("Connection Terminated");
		
	}
	

}
