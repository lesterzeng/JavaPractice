// The difference in "Demo extends Thread" and "Demo(written as Exmp) implements Runnable"

import java.util.Scanner;

class Demo extends Thread{
	public void run() {
		if(getName().equals("BANK")) {
			banking();
		} else if(getName().equals("PRINT")) {
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

public class Launch {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.setName("BANK");
		d2.setName("PRINT");
		d3.setName("ADD");
		
		d1.start();
		d2.start();
		d3.start();
	}

}
