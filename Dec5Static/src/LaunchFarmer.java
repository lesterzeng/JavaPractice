import java.util.Scanner;

class Farmer {
	float principle;
	float time;
	static float rateOfInterest;
	float simpleInterest;
	
	static {
		rateOfInterest=2.5f;
	}
	
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		principle = scan.nextFloat();
		System.out.println("Enter the dutation");
		time = scan.nextFloat();
		
	}

		void compute () {
			simpleInterest = (principle*time*rateOfInterest)/100;
		}
		
		void display() {
			System.out.println("Simple interest is " + simpleInterest);
}
		
public class LaunchFarmer {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer();
		
		f1.acceptInput();
		f1.compute();
		f1.display();
		
		f2.acceptInput();
		f2.compute();
		f2.display();
		
		f3.acceptInput();
		f3.compute();
		f3.display();
		}
	}
}
