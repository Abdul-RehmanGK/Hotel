package Hotel.Management.System;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dashboard extends JFrame implements ActionListener{ 	
	JButton add,rec;
	Dashboard(){
	super ("Hotel Management System");
		
	rec = new JButton("RECEPTION");
	rec.setBounds(425, 510, 140, 30);
	rec.setForeground(Color.WHITE);
	rec.setFont(new Font("Tahoma",Font.BOLD,15));
	rec.setBackground(new Color(255,98,0));
	rec.addActionListener(this);
	add(rec);
	
	add = new JButton("ADMIN");
	add.setBounds(880, 510, 140, 30);
	add.setForeground(Color.WHITE);
	add.setFont(new Font("Tahoma",Font.BOLD,15));
	add.setBackground(new Color(255,98,0));
	add.addActionListener(this);
	add(add);
	
	ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
	Image i4=i11.getImage().getScaledInstance(200, 195,Image.SCALE_DEFAULT);
	ImageIcon imageIcon11 =new ImageIcon(i4);
	JLabel label1 =new JLabel(imageIcon11);
	label1.setBounds(850, 300, 195, 200);
	add(label1);

	ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
	Image i5=i22.getImage().getScaledInstance(200, 195,Image.SCALE_DEFAULT);
	ImageIcon imageIcon22 =new ImageIcon(i5);
	JLabel label2 =new JLabel(imageIcon22);
	label2.setBounds(400, 300, 195, 200);
	add(label2);
	
	ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
	Image i3=imageIcon.getImage().getScaledInstance(1950, 1090,Image.SCALE_DEFAULT);
	ImageIcon imageIcon111=new ImageIcon(i3);
	JLabel label =new JLabel(imageIcon111);
	label.setBounds(0, 0, 1950, 1090);
	add(label);
	
	setLayout(null);
	setLocation(70,40);
	setSize(1450,750);
	setVisible(true);
	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==rec) {
				setVisible(false);
				new Reception();
				
			}else {
				setVisible(false);
				new Login2();
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Dashboard();

	}

}
