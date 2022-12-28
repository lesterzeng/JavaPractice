import java.util.ArrayList;
import java.util.Scanner;

public class LaunchTicTacToe {
	public static void main(String[] args) {
		
		int player = 0;
		int computer = 0;
		
		System.out.println(" | | ");
		System.out.println("-+-+-");
		System.out.println(" | | ");
		System.out.println("-+-+-");
		System.out.println(" | | ");
		System.out.println("Player's turn. Please enter position 1 - 9");
		
		Scanner scan = new Scanner(System.in);
		player = scan.nextInt();
		
		switch(player) {
		case 1:
		}
		
		ArrayList<Moves> newMoves = new ArrayList<Moves>();
		newMoves.add(new Moves(player, computer));
	}

}

class Moves {
	int player;
	int computer;
	
	public Moves(int player, int computer) {
		this.player = player;
		this.computer = computer;
	}
}