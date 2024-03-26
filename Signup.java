package Hotel.Management.System;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
public class Signup extends JFrame implements ActionListener{
	
	JButton b1,b2;
	JTextField textfield1;
	JPasswordField passwordfield1;
	
	public Signup(){
		
		super("Hotel Management System");
		
		
		b1 =new JButton("ADD");
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.addActionListener(this);
		b1.setBounds(20,250,180,40);
		add(b1);
		
		b2 =new JButton("BACK");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(230,250,180,40);
		b2.addActionListener(this);
		add(b2);
		
		textfield1=new JTextField();
		textfield1.setBounds(150,100,250,30);
		textfield1.setBackground(new Color(26,104,110));
		textfield1.setForeground(Color.WHITE);
		textfield1.setFont(new Font("serif",Font.PLAIN,18));
		textfield1.addActionListener(this);
		add(textfield1);
		
		passwordfield1= new JPasswordField();
		passwordfield1.setBounds(150,180,250,30);
		passwordfield1.setBackground(new Color(26,104,110));
		passwordfield1.setForeground(Color.WHITE);
		passwordfield1.setFont(new Font("serif",Font.PLAIN,18));
		add(passwordfield1);
		
		JLabel label1=new JLabel("Signup Section");
		label1.setBounds(255, 1, 300, 50);
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		add(label1);
		
		JLabel label2=new JLabel("Username");
		label2.setBounds(30,100,250,30);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		add(label2);
		
		JLabel label3=new JLabel("Password");
		label3.setBounds(30,180,250,30);
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		add(label3);
		
		ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
		Image i5=i4.getImage().getScaledInstance(250, 220,Image.SCALE_DEFAULT);
		ImageIcon imageicon5=new ImageIcon(i5);
		JLabel label4=new JLabel(imageicon5);
		label4.setBounds(420, 60, 250, 220);
		label4.setVisible(true);
		label4.isDoubleBuffered();
		add(label4);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(700,400);
		setLocation(450,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String user=textfield1.getText();
			String pass=passwordfield1.getText();
			try {
				conn c =new conn();
				String q="insert into login values('"+user+"','"+pass+"')";
				c.statement.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "You are Successfully Signed Up");
				setVisible(false);
				new Login();
			}
			
				catch(Exception E){
					E.printStackTrace();
				}
			}
		else {
			setVisible(false);
			new Login();
		}
		
	}
	
	
	public static void main(String[] args) {
		new Signup();

	}

	

}
