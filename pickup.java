package Hotel.Management.System;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class pickup extends JFrame implements ActionListener{
	Choice c;
	JButton b1,b2;
	pickup(){
		super("Hotel Management System");
		
		JTable table1=new JTable();
		table1.setBackground(new Color(26,104,110));
		table1.setForeground(Color.WHITE);
		table1.setFont(new Font("serif",Font.PLAIN,18));
		table1.setBounds(30,130, 820, 470);
		add(table1);
		
		try {
			conn c =new conn();
			String q="select * from driver";
			ResultSet resultSet=c.statement.executeQuery(q);
			table1.setModel(DbUtils.resultSetToTableModel(resultSet));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		b1=new JButton("Display");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.addActionListener(this);
		b1.setBounds(130, 610, 200, 40);
		add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String q="select * from driver where carname='"+c.getSelectedItem()+"'";
				try {
					conn c =new conn();
					ResultSet resultSet=c.statement.executeQuery(q);
					table1.setModel(DbUtils.resultSetToTableModel(resultSet));
				}catch(Exception E) {
					E.printStackTrace();
				}
			}
		}
		);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.addActionListener(this);
		b2.setBounds(530, 610, 200, 40);
		add(b2);
		
		c=new Choice();
		c.setBounds(250, 50, 200, 30);
		c.setFont(new Font("serif",Font.PLAIN,18));
		c.setForeground(Color.WHITE);
		c.setBackground(new Color(26,104,110));
		add(c);
		
		try {
			conn C =new conn();
			ResultSet resultSet=C.statement.executeQuery("select * from driver");
			while(resultSet.next()) {
				c.add(resultSet.getString("carname"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel label1=new JLabel("Pick Up Service");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		label1.setBounds(350,5, 200, 30);
		add(label1);
		
		JLabel label2=new JLabel("Type of Car:");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(100,50, 200, 30);
		add(label2);
		
		JLabel label3=new JLabel("Name");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setBounds(50,100, 200, 30);
		add(label3);
		
		JLabel label4=new JLabel("Age");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(200,100, 200, 30);
		add(label4);
		
		JLabel label5=new JLabel("Gender");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(300,100, 200, 30);
		add(label5);
		
		JLabel label6=new JLabel("Company");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setBounds(400,100, 200, 30);
		add(label6);
		
		JLabel label7=new JLabel("Car Name");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Tahoma",Font.BOLD,18));
		label7.setBounds(520,100, 200, 30);
		add(label7);
		
		JLabel label8=new JLabel("Available");
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("Tahoma",Font.BOLD,18));
		label8.setBounds(630,100, 200, 30);
		add(label8);
		
		JLabel label9=new JLabel("Location");
		label9.setForeground(Color.WHITE);
		label9.setFont(new Font("Tahoma",Font.BOLD,18));
		label9.setBounds(750,100, 200, 30);
		add(label9);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setSize(900,700);
		setLocation(450,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new pickup();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			setVisible(false);
		}
	}

}
