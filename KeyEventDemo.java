import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class KeyEventDemo implements KeyListener 
{ 
	JFrame frame;
	JLabel LblPrmpt = new JLabel("Press keys as Desired Below:"); 
	JLabel LblOutPt = new JLabel("Key Typed is : "); 
	JTextField Txt = new JTextField(10); 
	public KeyEventDemo() 
	{ 
		frame = new JFrame("Key Event Example"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		LblPrmpt.setBounds(10,5,200,25);
		LblOutPt.setBounds(10,35,200,25);
		Txt.setBounds(10,80,200,100);
		
		frame.add(LblPrmpt); 
		frame.add(Txt); 
		frame.add(LblOutPt); 
		
		Txt.addKeyListener(this); 
	
		frame.setLayout(null); 
		frame.setSize(300,300); 
		frame.setVisible(true); 
				
    } 
    public void keyTyped(KeyEvent Evnt) 
    { 
		char s = Evnt.getKeyChar(); 
        LblOutPt.setText("Last key Typed : " + s); 
     } 
     public void keyPressed(KeyEvent Evnt) 
     { 
		int s = Evnt.getKeyCode(); 
		LblOutPt.setText("Last key Pressed : " + KeyEvent.getKeyText(s));  
     } 
     public void keyReleased(KeyEvent Evnt) 
     { 
		char s = Evnt.getKeyChar(); 
		LblOutPt.setText("Last key Released:" + s); 
     } 
     public static void main(String[] ar) 
     { 
		new KeyEventDemo(); 
     } 
}
 
