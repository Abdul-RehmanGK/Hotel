package Hotel.Management.System;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	JTextField textfield1;
	JPasswordField passwordfield2;
	JButton b1,b2,b3;
	Login(){
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
		
		textfield1= new JTextField();
		textfield1.setBounds(150,20,150,30);
		textfield1.setForeground(Color.WHITE);
		textfield1.setFont(new Font("Tahoma",Font.PLAIN,15));
		textfield1.setBackground(new Color(26,104,110));
		add(textfield1);
		
		passwordfield2= new JPasswordField();
		passwordfield2.setBounds(150,70,150,30);
		passwordfield2.setForeground(Color.WHITE);
		passwordfield2.setBackground(new Color(26,104,110));
		add(passwordfield2);
		
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
		
		b3=new JButton("SIGN UP");
		b3.setBounds(38,190,270,30);
		b3.setFont(new Font("serif",Font.BOLD,15));
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.addActionListener(this);
		add(b3);
		
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
				conn c=new conn();
				String user=textfield1.getText();
				String pass=passwordfield2.getText();
				String q="Select * from login where username='"+user+"' and password='"+pass+"'";
				ResultSet result= c.statement.executeQuery(q);
				if(result.next()) {
					setVisible(false);
					new Dashboard();
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
				}
			}catch(Exception E) {
				E.printStackTrace();
			}
		}else
			if(e.getSource()==b3){
			try{
				new Signup();	
				setVisible(false);
			}catch(Exception E) {
				E.printStackTrace();
			}
		}else
			if(e.getSource()==b2) {
			setVisible(false);
		}
	}

	
	public static void main(String[] args) {
		new Login();
	}

}
