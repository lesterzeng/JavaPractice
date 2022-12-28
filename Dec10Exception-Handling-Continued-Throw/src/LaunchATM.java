import java.util.Scanner;

class InvalidUsername extends Exception{
	public String getMessage () {
		return "Username doesn't exist.";
	}
}

class InvalidPassword extends Exception {
	public String getMessage() {
		return "Wrong password.";
	}
}

class ExceededAttempts extends Exception {
	public String getMessage() {
		return "Attempts Exceeded. Please contact Bank.";
	}
}

class ATM {
	int userName = 1111;
	int password = 2222;
	int tries = 1;
	boolean activateAttempts = false;
	
	void acceptInput() {
	
			System.out.println("Please enter username.");
			Scanner scan = new Scanner(System.in);
			userName = scan.nextInt();
			
			System.out.println("Please enter password.");
			password = scan.nextInt();
		
	}
	void verify() throws InvalidUsername, InvalidPassword, ExceededAttempts {
		
		
	
		if (userName != 1111) {
			InvalidUsername ivu = new InvalidUsername();
			System.out.println(ivu.getMessage()+" - Message displayed on ATM");
			throw ivu;
		} else if (password != 2222) {
			InvalidPassword ip = new InvalidPassword();
			
			activateAttempts = true;
			while(activateAttempts = true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(ip.getMessage()+ " - Message displayed on ATM. Attempt: " + tries);
			password = scan.nextInt();
			tries ++;
			if (tries == 3) {
				ExceededAttempts ea = new ExceededAttempts();
				System.out.println(ea.getMessage()+ " = Message displayed on ATM");
				throw ea;
				} else if (password == 2222)
					break;
			}
			throw ip;
		} else {
			System.out.println("Please proceed");
		
		}
	}
}



class Bank{
	void initiate () {
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.verify();
		} catch (InvalidUsername ivu) {
			System.out.println(ivu.getMessage()+" - Message displayed in bank system");
		} catch (InvalidPassword ip) {
			System.out.println(ip.getMessage()+ " - Message displayed in bank system");
		} catch (ExceededAttempts ea) {
			System.out.println(ea.getMessage()+ " - Message displayed in bank system");
		}
	}
}


public class LaunchATM {

	public static void main(String[] args) {
			Bank bank = new Bank();
			bank.initiate();
	}

}


// Things to improve.
// Send an error of multiple attempts to bank - not neccessary though. Bank only wants to know when it's exceeded.
// Attempts still exceeded after correct input! 
