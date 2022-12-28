// Example of "controlling" multithread to prevent threads from running concurrently.
// Same for BusCounter/Customer/LaunchAppTicket. Though code is more complicated because of passing around objects etc.


class Bathroom implements Runnable {
	synchronized public void run() {
		String thread1 = Thread.currentThread().getName();

		try {
			System.out.println(thread1 + " has entered the bathroom");
			Thread.sleep(4000);
			System.out.println(thread1 + " is using the bathroom");
			Thread.sleep(4000);
			System.out.println(thread1 + " has existed the bathroom");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}






public class LaunchBathroom {
	public static void main(String[] args) {
		Bathroom b = new Bathroom();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);		
		
		t1.setName("BOY");
		t2.setName("GIRL");
		
		t1.start();
		t2.start();
	}
}
