// The difference in "Demo extends Thread" and "Demo(written as Exmp) implements Runnable"
// Example of using .join() to have better control. Analogy of friend always come late.
import java.util.Scanner;

class Exmp implements Runnable{
	public void run() {

		if(Thread.currentThread().getName().equals("BANK")) {
			banking();
		} else if(Thread.currentThread().getName().equals("PRINT")) {
			printing();
		} else {
			addition();
		}
	}
	
	void banking() {
System.out.println("Banking Activity Started");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int an = scan.nextInt();
		System.out.println("Enter password");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity completed");
	}
	
	void printing() {
		try {
			System.out.println("Printing Activity Started");
					
					for(int i=0; i<5; i++) {
						System.out.println("ABC");
						Thread.sleep(3000);
						}
					System.out.println("Printing activity completed");
					} catch(Exception e) {
						e.printStackTrace();
					}
				
	}
	
	void addition() {
System.out.println("Addition Activity Started");
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Addition activity completed");
	}
}

public class Launch2 {

	public static void main(String[] args)throws Exception{
		Exmp e = new Exmp();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);
		
		t1.setName("BANK");
		t2.setName("PRINT");
		t3.setName("ADDITION");
		
		//Threads are dead before sending over to Thread Scheduler
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		//Threads are only alive after  sending over to Thread Scheduler ^^
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
	}

}
