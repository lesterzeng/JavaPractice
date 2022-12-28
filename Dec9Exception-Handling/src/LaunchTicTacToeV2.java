
public class LaunchTicTacToeV2 {

	public static void main(String[] args) {
		char[][] board = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
			
		for(char[] row: board) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
