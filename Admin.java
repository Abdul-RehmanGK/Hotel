package Hotel.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Admin extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5;
	
	public Admin(){
		
		super ("Hotel Management System");
		
		b1=new JButton("Add Employee");
		b1.setBounds(250, 150, 250, 40);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Add Room");
		b2.setBounds(250, 280, 250, 40);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Add Driver");
		b3.setBounds(250, 400, 250, 40);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Tahoma",Font.BOLD,18));
		b3.addActionListener(this);
		add(b3);
		
		b4=new JButton("LOGOUT");
		b4.setBounds(10, 550, 130, 40);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Tahoma",Font.BOLD,15));
		b4.addActionListener(this);
		add(b4);
		
		b5=new JButton("BACK");
		b5.setBounds(200, 550, 130, 40);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Tahoma",Font.BOLD,15));
		b5.addActionListener(this);
		add(b5);
		
		ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
		Image i1=imageicon.getImage().getScaledInstance(80, 90,Image.SCALE_DEFAULT);
		ImageIcon imageicon1 =new ImageIcon(i1);
		JLabel label1 =new JLabel(imageicon1);
		label1.setBounds(50, 120, 80, 90);
		add(label1);
		
		ImageIcon imageicon2=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
		Image i2=imageicon2.getImage().getScaledInstance(80, 90,Image.SCALE_DEFAULT);
		ImageIcon imageicon3 =new ImageIcon(i2);
		JLabel label2 =new JLabel(imageicon3);
		label2.setBounds(50, 250, 80, 90);
		add(label2);
		
		ImageIcon imageicon4=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
		Image i3=imageicon4.getImage().getScaledInstance(80, 90,Image.SCALE_DEFAULT);
		ImageIcon imageicon5 =new ImageIcon(i3);
		JLabel label3 =new JLabel(imageicon5);
		label3.setBounds(50, 370, 80, 90);
		add(label3);
		
		ImageIcon imageicon6=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
		Image i4=imageicon6.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon imageicon7=new ImageIcon(i4);
		JLabel label4 =new JLabel(imageicon7);
		label4.setBounds(620, 170, 250, 250);
		add(label4);
		
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setLocation(300,100);
		setSize(950,650);
		setBackground(Color.WHITE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			setVisible(false);
			new addEmployee();
		}
		if(e.getSource()==b2) {
			setVisible(false);
			new addRoom();
		}
		if(e.getSource()==b3) {
			setVisible(false);
			new addDriver();
		}
		if(e.getSource()==b4) {
			setVisible(false);
			new Dashboard();
		}
		if(e.getSource()==b5) {
			setVisible(false);
			new Dashboard();
		}
		
	}	
	
	public static void main(String[] args) {
		new Admin();

	}


}
