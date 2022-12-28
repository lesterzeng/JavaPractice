import java.util.*;

class TicTacToe{
	public static void displayBoard(char board[][]) {
		for(char y[]:board) {
			for(char c:y) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void insertPosition(char board[][], int position, char user) {
		char ch = user;

		if(ch=='X'){
			LaunchTicTacToe.allPpos.add(position);
		}
		else{
			LaunchTicTacToe.allCpos.add(position);
		}

		switch(position) {
		case 1:board[0][0] = ch;
		break;
		case 2:board[0][2] = ch;
		break;
		case 3:board[0][4] = ch;
		break;
		case 4:board[2][0] = ch;
		break;
		case 5:board[2][2] = ch;
		break;
		case 6:board[2][4] = ch;
		break;
		case 7:board[4][0] = ch;
		break;
		case 8:board[4][2] = ch;
		break;
		case 9:board[4][4] = ch;
		break;
		default:System.out.println("Invalid position. Please re-enter the position between(1-9)");
		}
	}

	static void checkWinner(){
		List rule1 = Arrays.asList(1,2,3);// top row
		List rule2 = Arrays.asList(4,5,6);
		List rule3 = Arrays.asList(7,8,9);
		List rule4 = Arrays.asList(1,4,7);
		List rule5 = Arrays.asList(2,5,8);
		List rule6 = Arrays.asList(3,6,9);
		List rule7 = Arrays.asList(1,5,9);
		List rule8 = Arrays.asList(3,5,7);

		if(LaunchTicTacToe.allPpos.containsAll(rule1) ||LaunchTicTacToe.allPpos.containsAll(rule2) ||
			LaunchTicTacToe.allPpos.containsAll(rule3) || LaunchTicTacToe.allPpos.containsAll(rule4) ||
			LaunchTicTacToe.allPpos.containsAll(rule5) || LaunchTicTacToe.allPpos.containsAll(rule6) ||
			LaunchTicTacToe.allPpos.containsAll(rule7) || LaunchTicTacToe.allPpos.containsAll(rule8)){
			System.out.println("User is the winner");
			System.exit(0);
		}
			else if(LaunchTicTacToe.allCpos.containsAll(rule1) ||LaunchTicTacToe.allCpos.containsAll(rule2) ||
			LaunchTicTacToe.allCpos.containsAll(rule3) || LaunchTicTacToe.allCpos.containsAll(rule4) ||
			LaunchTicTacToe.allCpos.containsAll(rule5) || LaunchTicTacToe.allCpos.containsAll(rule6) ||
			LaunchTicTacToe.allCpos.containsAll(rule7) || LaunchTicTacToe.allCpos.containsAll(rule8)){
			System.out.println("CPU is the winner");
				System.exit(0);
		} 
		else if((LaunchTicTacToe.allPpos.size() +LaunchTicTacToe.allCpos.size())==9){
			System.out.println("Game is a draw");
			System.exit(0);
		}
	}

}
public class LaunchTicTacToeAkhilVersion {
	static ArrayList allPpos = new ArrayList();
	static ArrayList allCpos = new ArrayList();

	public static void main(String[] args) {
		int ppos, cpupos;
		

		char board[][] = {{' ', '|', ' ', '|', ' '},
						  {'-', '+', '-', '+', '-'},
						  {' ', '|', ' ', '|', ' '},
						  {'-', '+', '-', '+', '-'},
						  {' ', '|', ' ', '|', ' '}
						  };
		
		TicTacToe.displayBoard(board);
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Player, kindly enter the position(1-9)");
			ppos = scan.nextInt();

			while(allPpos.contains(ppos) || allCpos.contains(ppos)){
				System.out.println("Position already taken!! Re-enter:");
				ppos = scan.nextInt();
			}

			TicTacToe.insertPosition(board, ppos, 'X');
			TicTacToe.displayBoard(board);
			TicTacToe.checkWinner();
			
			
			System.out.println("CPU, kindly enter the position(1-9)");
			Random rand = new Random();
			cpupos = rand.nextInt(1, 10);
			System.out.println(cpupos);
			while(allPpos.contains(cpupos) || allCpos.contains(cpupos)){
				System.out.println("Position already taken!! Re-enter:");
				cpupos = rand.nextInt(1, 10);
			}
			TicTacToe.insertPosition(board, cpupos, 'O');
			TicTacToe.displayBoard(board);
			TicTacToe.checkWinner();
		}
	}
}