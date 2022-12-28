import java.util.Scanner;



public class Launch {

	public static void main(String[] args) {
		try {
		System.out.println("Banking Activity Started");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int an = scan.nextInt();
		System.out.println("Enter password");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity completed");
		
		System.out.println("Printing Activity Started");
		
		for(int i=0; i<5; i++) {
			System.out.println("ABC");
			Thread.sleep(3000);
			}
		System.out.println("Printing activity completed");
		
		System.out.println("Addition Activity Started");
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Addition activity completed");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
