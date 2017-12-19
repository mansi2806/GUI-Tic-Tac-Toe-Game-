package ticTacToe1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.BorderLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class TicTacToe1 {

	private JFrame frame;
	private String startGame="X";
	private int xCount=0,oCount=0;
	//private JLabel lblXcount;
	//private JLabel lblOcount;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	private JTextField txtCountX;
	private JTextField txtCount0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe1 window = new TicTacToe1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe1() {
		initialize();
		//gameScore();
	}
///**********METHODS*************///
	
	private void gameScore(){
		txtCountX.setText(String.valueOf(xCount));
		txtCount0.setText(String.valueOf(oCount));
	}
	private void choosePlayer(){
		if(startGame.equals("X"))
			startGame="0";
		else
			startGame="X";
	}
	private void winningGame(){
		String b[][]=new String[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j]=new String();
		b[0][0]=b1.getText();
		b[0][1]=b2.getText();
		b[0][2]=b3.getText();
		b[1][0]=b4.getText();
		b[1][1]=b5.getText();
		b[1][2]=b6.getText();
		b[2][0]=b7.getText();
		b[2][1]=b8.getText();
		b[2][2]=b9.getText();
		String x="Player "+startGame+" wins!!";
		if(checkColumns(b)||checkDiagonals(b)||checkRows(b)==true){
			JOptionPane.showMessageDialog(frame, x, "TicTacToe", JOptionPane.INFORMATION_MESSAGE);
			b1.setText(null);
			b2.setText(null);
			b3.setText(null);
			b4.setText(null);
			b5.setText(null);
			b6.setText(null);
			b7.setText(null);
			b8.setText(null);
			b9.setText(null);
			choosePlayer();
			gameScore();
		}
		
	}
	private boolean checkRows(String b[][])
	{
		for(int i=0;i<3;i++)
			if(checkRowsColumns(b[i][0], b[i][1], b[i][2])==true)
					return true;
		return false;
	}
	private boolean checkColumns(String b[][])
	{
		for(int i=0;i<3;i++)
			if(checkRowsColumns(b[0][i], b[1][i], b[2][i])==true)
					return true;
		return false;
	}
	private boolean checkDiagonals(String b[][]){
		return checkRowsColumns(b[0][0], b[1][1], b[2][2])||checkRowsColumns(b[0][2], b[1][1], b[2][0]);
	}
	private boolean checkRowsColumns(String c1,String c2,String c3)
	{
		if((c1=="X")&&(c1==c2)&&(c1==c3)){
			xCount++;
			return true;
		}
		else if((c1=="0")&&(c1==c2)&&(c1==c3)){
			oCount++;
			return true;
		}
		else
			return false;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 756, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//b1.setEnabled(false);
				b1.setText(startGame);
				if(startGame.equals("X"))
					b1.setForeground(Color.RED);
				else
					b1.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_1.add(b1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//b2.setEnabled(false);
				b2.setText(startGame);
				if(startGame.equals("X"))
					b2.setForeground(Color.RED);
				else
					b2.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_2.add(b2, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b3.setText(startGame);
				if(startGame.equals("X"))
					b3.setForeground(Color.RED);
				else
					b3.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_4.add(b3, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerX = new JLabel("Player X:");
		lblPlayerX.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblPlayerX, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setText("0");
		panel_3.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		b4 = new JButton(" ");
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b4.setText(startGame);
				if(startGame.equals("X"))
					b4.setForeground(Color.RED);
				else
					b4.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_6.add(b4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b5.setText(startGame);
				if(startGame.equals("X"))
					b5.setForeground(Color.RED);
				else
					b5.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_7.add(b5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b6.setText(startGame);
				if(startGame.equals("X"))
					b6.setForeground(Color.RED);
				else
					b6.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_8.add(b6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayerO = new JLabel("Player 0:");
		lblPlayerO.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblPlayerO, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		txtCount0 = new JTextField();
		txtCount0.setHorizontalAlignment(SwingConstants.CENTER);
		txtCount0.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtCount0.setText("0");
		panel_10.add(txtCount0, BorderLayout.CENTER);
		txtCount0.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b7.setText(startGame);
				if(startGame.equals("X"))
					b7.setForeground(Color.RED);
				else
					b7.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_11.add(b7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b8.setText(startGame);
				if(startGame.equals("X"))
					b8.setForeground(Color.RED);
				else
					b8.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_12.add(b8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b9.setText(startGame);
				if(startGame.equals("X"))
					b9.setForeground(Color.RED);
				else
					b9.setForeground(Color.BLUE);
				winningGame();
				choosePlayer();
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 70));
		panel_13.add(b9, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1.setText(null);
				b2.setText(null);
				b3.setText(null);
				b4.setText(null);
				b5.setText(null);
				b6.setText(null);
				b7.setText(null);
				b8.setText(null);
				b9.setText(null);
				choosePlayer();
				
			}
		});
		btnReset.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		panel_14.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit?","TicTacToe",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					System.exit(0);
				}
				
				
			}
		});
		btnExit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

}
