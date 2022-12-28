import java.util.Scanner;

class Customer extends Thread{
	
	int tn = 0;
	
	public void run() {
		getTicket();
	}
	
	public void getTicket() {
		System.out.println("Enter amount of tickets to purchase");
		Scanner scan = new Scanner(System.in);
		tn = scan.nextInt();
	}
}

class Counter {
	Customer c = new Customer();
	
	int tickets = 5;
	
	public void fun() {
		if(c.tn>tickets) {
			System.out.println(" Not tickets available");
		} else {
			System.out.println("Here are your tickets");
		}
	}
}




public class LaunchTicket {

	public static void main(String[] args) {
			Customer c = new Customer();
			
			c.setName("GETTICKET");
			
			c.start();
	}

}
