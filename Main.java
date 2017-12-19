import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new MainGame1());
        window.setBounds(300,200,300,300);
        window.setVisible(true);
	}
}
//		Scanner scan = new Scanner(System.in);
//		Player p1=new Player();
//		Player p2=new Player();
//		p1.getInput(1);
//		p2.getInput(2);
//		System.out.println("Enter the name of First Player and Mark : ");
//		p1.getInput(scan);
//		System.out.println("Enter the name of Second Player and Mark : ");
//		p2.getInput(scan);
//	    
//		MainGame game = new MainGame(p1, p2);
//		game.initializeBoard(p1);
//		do {
//			System.out.println("Current board layout is:");
//			game.printBoard();
//			int row, col;
//			do {
//				System.out.println("Player " + game.getCurrentPlayer().getName()
//						+ ", enter an empty row and column to place your mark!");
//				row = scan.nextInt() - 1;
//				col = scan.nextInt() - 1;
//			} while (!game.placeMark(row, col));
//			game.changePlayer();
//		} while (!game.isWinner() && !game.isBoardFull());
//		
//		if (game.isBoardFull() && !game.isWinner()) {
//			System.out.println("The game was a tie!");
//		} else {
//			System.out.println("Current board layout:");
//			game.printBoard();
//			game.changePlayer();
//			System.out.println(game.getCurrentPlayer().getName().toUpperCase() + " Wins!");
//
//		}
//		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static class tttFrame extends JFrame{
//		JButton b1;
//		JLabel l1;
//		public tttFrame(){
//			setTitle("Tic Tac Toe");
//			setSize(400,400);
//			setLocationRelativeTo(null);
//		    setDefaultCloseOperation(EXIT_ON_CLOSE);
//		    setVisible(true);
//		    
//		    setLayout(new BorderLayout());
//		    JLabel background=new JLabel(new ImageIcon("C:\\Users\\dell\\Desktop\\Workspace\\TicTacToe"));
//		    add(background);
//		    background.setLayout(new FlowLayout());
//		    l1=new JLabel("Here is a button");
//		    b1=new JButton("I am a button");
//		    background.add(l1);
//		    background.add(b1);
////		    setLayout(new BorderLayout());
////		    setContentPane(new JLabel(new ImageIcon("C:\\Users\\dell\\Desktop\\Workspace\\TicTacToe")));
////		    setLayout(new FlowLayout());
////		    l1=new JLabel("Here is a button");
////		    b1=new JButton("I am a button");
////		    add(l1);
////		    add(b1);
//		    // Just for refresh :) Not optional!
//		    setSize(399,399);
//		    setSize(400,400);
//		}
//	}
//}

