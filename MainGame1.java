import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame1 extends JPanel {
	JButton board[][] = new JButton[3][3];
	private Player currentPlayer;
	private Player p1, p2;

	public MainGame1() {
		setLayout(new GridLayout(3, 3));
		initializebuttons();
		p1 = new Player();
		p2 = new Player();
		currentPlayer=new Player();
		p1.getInput(1);
		p2.getInput(2);
	}

	public void initializebuttons() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = new JButton("");
				board[i][j].addActionListener(new buttonListener());
				add(board[i][j]);
			}

		}
		currentPlayer = p1;
	}

	public void resetButtons() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j].setText("");
		currentPlayer=p1;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	private class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			JButton buttonClicked = (JButton)e.getSource(); //get the particular button that was clicked
            
			buttonClicked.setText(currentPlayer.getMark());
			
            if(isWinner() == true)
            {
                JOptionPane.showConfirmDialog(null, "Game Over. "+currentPlayer.getName()+" Wins!!");    
                resetButtons();
            }
            if (isBoardFull() && !isWinner()) {
            	JOptionPane.showConfirmDialog(null,"Game is a Draw!");
            }
          changePlayer();      
         }
		
	}
	public boolean isBoardFull() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				if (board[i][j].getText() == "")
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

	private boolean checkRowCol(JButton c1, JButton c2, JButton c3) {
		return ((c1.getText() !="") && (c1.getText() == c2.getText()) && (c2.getText() == c3.getText()));
	}
	public void changePlayer(){
		if(currentPlayer==p1)
			currentPlayer=p2;
		else
			currentPlayer=p1;
	}
}
