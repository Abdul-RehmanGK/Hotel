package Hotel.Management.System;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ROOMS extends JFrame implements ActionListener{
	JButton b1;
	
	public ROOMS(){
		super("Hotel Management System");
		
		
		b1=new JButton("BACK");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(250, 500, 150, 40);
		b1.addActionListener(this);
		add(b1);
		
		ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
		Image i1=imageicon.getImage().getScaledInstance(250, 300, Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
		JLabel label1=new JLabel(imageicon2);
		label1.setBounds(600, 150, 250, 300);
		add(label1);
		
		JLabel label2=new JLabel("Room No");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,15));
		label2.setBounds(35,1, 200, 65);
		add(label2);
		
		JLabel label3=new JLabel("Availability");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,15));
		label3.setBounds(130,1, 200, 65);
		add(label3);
		
		JLabel label4=new JLabel("Clean Status");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,15));
		label4.setBounds(230,1, 200, 65);
		add(label4);
		
		JLabel label5=new JLabel("Price");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,15));
		label5.setBounds(350,1, 200, 65);
		add(label5);
		
		JLabel label6=new JLabel("Bed Type");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma",Font.BOLD,15));
		label6.setBounds(430,1, 200, 65);
		add(label6);
		
		JTable table1=new JTable();
		table1.setBounds(30, 50, 500, 400);
		table1.setBackground(new Color(26,104,110));
		table1.setForeground(Color.WHITE);
		add(table1);
		
		try {
			conn c =new conn();
			String roominfo="select * from room";
			ResultSet resultSet=c.statement.executeQuery(roominfo);
			table1.setModel(DbUtils.resultSetToTableModel(resultSet));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setLocation(450,150);
		setSize(900,600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new ROOMS();

	}

}
