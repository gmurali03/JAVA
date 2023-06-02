import java.awt.*;
class AWTEx extends Frame
{
	
	Label userLabel,pwdLabel;
	TextField userName,pwd;
	Button bLogin;
	
	Panel panel;
	
	AWTEx()
	{
		userLabel = new Label("User Name",Label.CENTER);
		userLabel.setBounds(50,100,100,30);
		
		userName=new TextField(20);
		userName.setBounds(150,100,100,50);
		
		pwdLabel = new Label("Password",Label.CENTER);
		pwdLabel.setBounds(50,100,100,30);
		
		pwd=new TextField(20);
		pwd.setBounds(150,150,100,30);
		pwd.setEchoChar('#');
		
		Button bLogin=new Button("Login");
		bLogin.setBounds(100,400,100,50);
		
		add(userLabel);
		add(userName);
		add(pwdLabel);
		add(pwd);
		add(bLogin);
		setSize(400,400);
		setVisible(true);
		setTitle("AWT example");  
		setLayout(null);
	}
	public static void main(String args[])
	{
		new AWTEx();
	}
}
