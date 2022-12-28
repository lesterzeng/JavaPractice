import java.util.Scanner;

class InvalidCredentialException extends Exception{
	public String getMessage() {
		return "Sorry, you have entered the wrong credentials";
	}
}

class ATM {
	int un;
	int pw;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your user name");
		un = scan.nextInt();
		System.out.println("Enter your password");
		pw = scan.nextInt();
	}
	
	void verify(int userName, int password) throws InvalidCredentialException{
		if (userName==un && password==pw) {
			System.out.println("Collect your money");
		} else {
			InvalidCredentialException ice = new InvalidCredentialException();
			System.out.println(ice.getMessage()+ "Message displayed on ATM");
			throw ice;
		}
	}
}


class Bank{
	int userName = 1111;
	int password = 2222;
	
	void initiate(){
		ATM atm = new ATM();
		try {
		atm.acceptInput();
		atm.verify(userName, password);
		} catch(InvalidCredentialException ice) {
			System.out.println(ice.getMessage()+ " Message displayed in bank.");
			try {
			atm.acceptInput();
			atm.verify(userName, password);
			} catch (InvalidCredentialException ice1) {
				System.out.println(ice1.getMessage()+ " Message displayed in bank.");
				try {
					atm.acceptInput();
					atm.verify(userName, password);
				} catch (InvalidCredentialException ice2) {
					System.out.println(ice2.getMessage()+ " Message displayed in bank.");
					System.out.println("Your card is blocked. Please visit the bank.");
				}
			}
		}
	}
}






public class LaunchBank {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initiate();
	}

}

// To show card is block in the ATM as well. Use counter.
