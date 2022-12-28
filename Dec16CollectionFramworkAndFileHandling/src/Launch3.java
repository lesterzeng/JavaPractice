// Lambda example.
// Incomplete - check video


import java.util.Scanner;





	


class Demo3 implements Runnable {
	public void run() {
		System.out.println("Addition actvity started");
		
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		
		System.out.println("Addition activity completed");
	}
}





public class Launch3 {

	public static void main(String[] args) {
		Runnable r1 = ()-> 
			System.out.println("Banking activity started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter account number");
			int an = scan.nextInt();
			System.out.println("Enter password");
			int pw = scan.nextInt();
			System.out.println("Collect your money");
			System.out.println("Banking Activity completed");
		
		Runnable r2 = () -> {
		try {
			System.out.println("Printing activity started");
			for (int i=0; i<5; i++) {
				System.out.println("ABC");
				Thread.sleep(3000);
			}
			System.out.println("Printing activity completed");
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		Runnable r3 = new Demo3();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
