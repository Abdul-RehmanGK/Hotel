package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login2 extends JFrame implements ActionListener{
	JTextField textField1;
	JPasswordField passwordField2;
	JButton b1,b2,b3;
	Login2(){
		super("Hotel Management System");
		JLabel label1= new JLabel("USERNAME");
		label1.setBounds(40,20,100,30);
		label1.setFont(new Font("Tahoma",Font.BOLD,16));
		label1.setForeground(Color.WHITE);
		add(label1);
		
		JLabel label2= new JLabel("PASSWORD");
		label2.setBounds(40,70,100,30);
		label2.setFont(new Font("Tahoma",Font.BOLD,16));
		label2.setForeground(Color.WHITE);
		add(label2);
		
		textField1= new JTextField();
		textField1.setBounds(150,20,150,30);
		textField1.setForeground(Color.WHITE);
		textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
		textField1.setBackground(new Color(26,104,110));
		add(textField1);
		
		passwordField2= new JPasswordField();
		passwordField2.setBounds(150,70,150,30);
		passwordField2.setForeground(Color.WHITE);
		passwordField2.setBackground(new Color(26,104,110));
		add(passwordField2);
		
		ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
		Image i1=imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
		JLabel label =new JLabel(imageIcon);
		label.setBounds(318,-30,280,300);
		add(label);
		
		b1= new JButton("LOGIN");
		b1.setBounds(40, 140, 120, 30);
		b1.setFont(new Font("serif",Font.BOLD,15));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(this);
		add(b1);
		
		b2= new JButton("CANCEL");
		b2.setBounds(188, 140, 120, 30);
		b2.setFont(new Font("serif",Font.BOLD,15));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.addActionListener(this);
		add(b2);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setLocation(500,300);
		setSize(600,300);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				conn2 c2=new conn2();
				String user2=textField1.getText();
				String pass2=passwordField2.getText();
				String q2="Select * from login2 where username1='"+user2+"' and password1='"+pass2+"'";
				ResultSet result= c2.statement2.executeQuery(q2);
				if(result.next()) {
					setVisible(false);
					new Admin();
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
				}
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		if(e.getSource()==b2) {
			setVisible(false);
			new Dashboard();
		}
		
	}
	public static void main(String[] args) {
		new Login2();
	}
	

}
