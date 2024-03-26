package Hotel.Management.System;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Reception extends JFrame implements ActionListener{

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	Reception() {
		super ("Hotel Management System");
		
		b1=new JButton("NEW CUSTOMER FORM");
		b1.setBackground(Color.BLACK);
		b1.setLayout(null);
		b1.setFont(new Font("Tahoma",Font.BOLD,16));
		b1.setBounds(20, 10, 280,35);
		b1.addActionListener(this);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b2=new JButton("ROOMS");
		b2.setBackground(Color.BLACK);
		b2.setLayout(null);
		b2.setFont(new Font("Tahoma",Font.BOLD,16));
		b2.setBounds(20, 60, 280,35);
		b2.addActionListener(this);
		b2.setForeground(Color.WHITE);
		add(b2);
		
		b3=new JButton("DEPARTMENT");
		b3.setBackground(Color.BLACK);
		b3.setLayout(null);
		b3.setFont(new Font("Tahoma",Font.BOLD,16));
		b3.setBounds(20, 110, 280,35);
		b3.addActionListener(this);
		b3.setForeground(Color.WHITE);
		add(b3);		
		
		b4=new JButton("ALL EMPLOYEE INFO");
		b4.setBackground(Color.BLACK);
		b4.setLayout(null);
		b4.setFont(new Font("Tahoma",Font.BOLD,16));
		b4.setBounds(20, 160, 280,35);
		b4.addActionListener(this);
		b4.setForeground(Color.WHITE);
		add(b4);
		
		b5=new JButton("CUSTOMER INFO");
		b5.setBackground(Color.BLACK);
		b5.setLayout(null);
		b5.setFont(new Font("Tahoma",Font.BOLD,16));
		b5.setBounds(20, 210, 280,35);
		b5.addActionListener(this);
		b5.setForeground(Color.WHITE);
		add(b5);
		
		b6=new JButton("MANAGER INFO");
		b6.setBackground(Color.BLACK);
		b6.setLayout(null);
		b6.setFont(new Font("Tahoma",Font.BOLD,16));
		b6.setBounds(20, 260, 280,35);
		b6.addActionListener(this);
		b6.setForeground(Color.WHITE);
		add(b6);
		
		b7=new JButton("CHECK OUT");
		b7.setBackground(Color.BLACK);
		b7.setLayout(null);
		b7.setFont(new Font("Tahoma",Font.BOLD,16));
		b7.setBounds(20, 310, 280,35);
		b7.addActionListener(this);
		b7.setForeground(Color.WHITE);
		add(b7);
		
		b8=new JButton("UPDATE CHECKIN DETAILS");
		b8.setBackground(Color.BLACK);
		b8.setLayout(null);
		b8.setFont(new Font("Tahoma",Font.BOLD,16));
		b8.setBounds(20, 360, 280,35);
		b8.addActionListener(this);
		b8.setForeground(Color.WHITE);
		add(b8);
		
		
		b9=new JButton("UPDATE ROOM STATUS");
		b9.setBackground(Color.BLACK);
		b9.setLayout(null);
		b9.setFont(new Font("Tahoma",Font.BOLD,16));
		b9.setBounds(20, 410, 280,35);
		b9.addActionListener(this);
		b9.setForeground(Color.WHITE);
		add(b9);
		
		b10=new JButton("PICKUP SERVICE");
		b10.setBackground(Color.BLACK);
		b10.setLayout(null);
		b10.setFont(new Font("Tahoma",Font.BOLD,16));
		b10.setBounds(20, 460, 280,35);
		b10.addActionListener(this);
		b10.setForeground(Color.WHITE);
		add(b10);
		
		b11=new JButton("SEARCH ROOM");
		b11.setBackground(Color.BLACK);
		b11.setLayout(null);
		b11.setFont(new Font("Tahoma",Font.BOLD,16));
		b11.setBounds(20, 510, 280,35);
		b11.addActionListener(this);
		b11.setForeground(Color.WHITE);
		add(b11);
		
		b12=new JButton("LOGOUT");
		b12.setBackground(Color.BLACK);
		b12.setLayout(null); 
		b12.setFont(new Font("Tahoma",Font.BOLD,16));
		b12.setBounds(1250, 790, 150, 35);
		b12.setForeground(Color.WHITE);
		b12.addActionListener(this);
		add(b12);
		
		b13=new JButton("BACK");
		b13.setBackground(Color.BLACK);
		b13.setLayout(null);
		b13.setFont(new Font("Tahoma",Font.BOLD,16));
		b13.setBounds(1430, 790, 150, 35);
		b13.setForeground(Color.WHITE);
		b13.addActionListener(this);
		add(b13);
		
		ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
		Image i6=i5.getImage().getScaledInstance(280,190, Image.SCALE_DEFAULT);
		ImageIcon imageicon55 =new ImageIcon(i6);
		JLabel label2=new JLabel(imageicon55);
		label2.setBounds(25, 600, 280, 190);
		add(label2);
		
		ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("cccc2.gif"));
		Image i3= i2.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		ImageIcon imageicon33=new ImageIcon(i3);
		JLabel label3=new JLabel(imageicon33);
		label3.setBounds(790, 280, 300, 300);
		add(label3);
		
		JPanel panel =new JPanel();
		panel.setLayout(null);
		panel.setBounds(331, 2, 1265, 830);
		panel.setBackground(new Color(3,45,48));
		add(panel);
		
		JPanel panel1 =new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(3, 2, 325, 830);
		panel1.setBackground(new Color(3,45,48));
		add(panel1);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setSize(1605,870);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Reception();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new newcusform();
		}
		if(e.getSource()==b2) {
				new ROOMS();
		}
		if(e.getSource()==b3) {
			new Department();
		}
		if(e.getSource()==b4) {
			new allempinfo();
		}
		if(e.getSource()==b5) {
			new cusinfo();
		}
		if(e.getSource()==b6) {
			new managerinfo();
		}
		if(e.getSource()==b7) {
			new checkout();
		}
		if(e.getSource()==b8) {
			new updcheckin();
		}
		if(e.getSource()==b9) {
			new updroomstatus();
		}
		if(e.getSource()==b10) {
			new pickup();
		}
		if(e.getSource()==b11) {
			new searchroom();
		}
		if(e.getSource()==b12) {
			try {
				setVisible(false);
				new Login();
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		if(e.getSource()==b13) {
			try {
				setVisible(false);
				new Dashboard();
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		
	}

}
