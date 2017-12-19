import javax.swing.*;
public class Player {
	private String name;
	private String mark;
	public Player() {
		
	}
	public void getInput(int i)
	{
		name= JOptionPane.showInputDialog("Enter the Name of Player "+i);
	    mark = JOptionPane.showInputDialog("Enter the Mark of Player "+i);
	                    
//		name=s.nextLine();
//		
//		String m=s.nextLine();
//		mark=m.charAt(0);
	}
	public String getName(){
		return name;
	}
	public String getMark(){
		return mark;
	}
}
