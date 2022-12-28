// Example of a deadlock


class Warrior extends Thread{
	
// This is in the constant pool. Everyone shares the same String-variable. 
	String resource1 = ("knife");
	String resource2 = ("gun");
	String resource3 = ("bomb");
	
// Method 1 - To solve deadlock, create strings as objects, where duplicates is permitted, as below.
// To create them so as to not be in the constant pool in heap stack. 	
//	String resource1 = new String("knife");
//	String resource2 = new String("gun");
//	String resource3 = new String("bomb");
	
	public void run () {
		if(getName().equals("RAMU")) {
			ramuAccResources();
		} else {
			rajuAccResources();
		}
	}
	
	void ramuAccResources() {
		try {
			synchronized(resource1) {
			System.out.println("Ramu has accquired " + resource1);
			Thread.sleep(4000);
			synchronized(resource2) {
				System.out.println("Ramu has accquired " + resource2);
				Thread.sleep(4000);
				synchronized(resource3) {
					System.out.println("Ramu has accquired " + resource3);
					Thread.sleep(4000);
				}
			}
		}
			} catch (Exception e) {
				e.printStackTrace();
		}
}

	void rajuAccResources() {
		try {
			synchronized(resource3) {
			System.out.println("Raju has accquired " + resource3);
			Thread.sleep(4000);
			synchronized(resource2) {
				System.out.println("Raju has accquired " + resource2);
				Thread.sleep(4000);
				synchronized(resource1) {
					System.out.println("Raju has accquired " + resource1);
					Thread.sleep(4000);
				}
			}
		}
			} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
}


public class LaunchWarrior {

	public static void main(String[] args) {
			Warrior w1 = new Warrior();
			Warrior w2 = new Warrior();
			
			w1.setName("RAMU");
			w2.setName("RAJU");
			
			w1.start();
			w2.start();
	}

}
