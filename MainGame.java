
public class MainGame {

	private char[][] board;
	private Player currentPlayer;
	private Player p1,p2;
	public MainGame(Player player1, Player player2) {
		board=new char[3][3];
		p1=player1;
		p2=player2;
	}
	public void initializeBoard() {
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				board[i][j] = '-';
		currentPlayer=p1;
	}
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	public void printBoard() {
		System.out.println("_ _ _ _ _ _ _ _");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("_ _ _ _ _ _ _ _");
		}
	}
	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-')
					return false;
			}
		return true;
	}

	public boolean isWinner() {
		return (checkRows() || checkColumns() || checkDiagonals());
	}

	private boolean checkRows() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkColumns() {
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonals() {
		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	}

	private boolean checkRowCol(char c1, char c2, char c3) {
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	}
	public void changePlayer(){
		if(currentPlayer==p1)
			currentPlayer=p2;
		else
			currentPlayer=p1;
	}
	public boolean placeMark(int row, int column){
		if((row>=0&&row<3)||(column>=0&&column<3))
		{
			if(board[row][column]=='-')
			{
				board[row][column]=currentPlayer.getMark().charAt(0);
				return true;
			}
		}
		return false;
	}

}
