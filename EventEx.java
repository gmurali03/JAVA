import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class EventEx implements ActionListener
{
	JFrame frame;
	JButton button;
	EventEx()
	{
		frame=new JFrame("Event Example");
		button=new JButton("Click");

		button.setBounds(150,150,100,50);
		frame.add(button);

	frame.setVisible(true);
	frame.setSize(400,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){  
	JOptionPane.showMessageDialog(frame, "WELCOME");}  
	public static void main(String arg[])
	{
	new EventEx();
	}
}
