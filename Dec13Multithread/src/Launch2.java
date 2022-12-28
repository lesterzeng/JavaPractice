import java.util.Scanner;

class Demo1 implements Runnable{
	public void run()	{
System.out.println("Banking Activity Started");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account number");
		int an = scan.nextInt();
		System.out.println("Enter password");
		int pw = scan.nextInt();
		System.out.println("Collect your money");
		
		System.out.println("Banking activity completed");
	}
}

class Demo2 implements Runnable{
	public void run() {
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
}

class Demo3 implements Runnable{
	public void run() {
System.out.println("Addition Activity Started");
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Addition activity completed");
	}
}

public class Launch2 {

	public static void main(String[] args) {
			Demo1 d1 = new Demo1();
			Demo2 d2 = new Demo2();
			Demo3 d3 = new Demo3();
			
			Thread t1 = new Thread(d1);
			Thread t2 = new Thread(d2);
			Thread t3 = new Thread(d3);
			
			t1.start();
			t2.start();
			t3.start();
	}

}
