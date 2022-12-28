import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class LaunchTicTacToeV3 {
	
	
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
	
	public static void displayBoard(char board[][]) {
		
		int ppos, cpos;
		
		for(char y []:board) {
			for (char c:y) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		char board1[][] = {{' ','|',' ','|',' '},
		          {'-','+','-','+','-'},
		          {' ','|',' ','|',' '},
		          {'-','+','-','+','-'},
		          {' ','|',' ','|',' '},
		};

		TicTacToe.displayBoard(board);
		System.out.println("test************");

		while(true) {
		//Player
		Scanner scan = new Scanner(System.in);
		System.out.println("Player, kindly enter the position (1-9)");
		ppos = scan.nextInt();
		while(playerPositions.contains(ppos) || cpuPositions.contains(ppos)) {
			System.out.println("Position taken. Enter another position");
			ppos = scan.nextInt();
		}
		TicTacToe.insertPosition(board, ppos, "player");
		
		//CPU
		Random rand = new Random();
		cpos = rand.nextInt(1,10);
		while(playerPositions.contains(cpos) || cpuPositions.contains(cpos)) {
			System.out.println("Position taken. Enter another position");
			cpos = rand.nextInt(1,10);
		}
		System.out.println("Computer placed " + cpos + " position");
		TicTacToe.insertPosition(board, cpos, "cpu");
		
		TicTacToe.displayBoard(board);
		
		String result = checkWinner();
		System.out.println(result);	
	}
}	

	
	public static void insertPosition(char board[][], int position, String user) {
		
		char symbol = 'X';
		
		if (user.equals("player")) {
			symbol = 'X';
			playerPositions.add(position);
		} else if (user.equals("cpu")){
			symbol = 'O';
			cpuPositions.add(position);
		}
				
		
		
		switch(position) {
		case 1: board[0][0] = symbol;
		break;
		case 2: board[0][2] = symbol;
		break;
		case 3: board[0][4] = symbol;
		break;
		case 4: board[2][0] = symbol;
		break;
		case 5: board[2][2] = symbol;
		break;
		case 6: board[2][4] = symbol;
		break;
		case 7: board[4][0] = symbol;
		break;
		case 8: board[4][2] = symbol;
		break;
		case 9: board[4][4] = symbol;
		break;
		default: System.out.println("Invalid position. Please re-enter the position between (1-9)");
		} 
	}
	
	public static String checkWinner () {
		
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List cross1= Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(3,5,7);
		
		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);
		
		for(List l :winning) {
			if(playerPositions.containsAll(l)) {
				return "You won!";
			} else if(cpuPositions.containsAll(l)) {
				return "CPU wins";
			} else if (playerPositions.size() + cpuPositions.size() == 9) {
				return "Draw";
			}
		}
		
		return "";
	}
}

