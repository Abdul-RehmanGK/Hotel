package Hotel.Management.System;
import javax.swing.*;
import javax.swing.border.Border;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class searchroom extends JFrame implements ActionListener{
	JCheckBox c1;
	Choice ch1;
	JTable t1;
	JButton b1,b2;
	searchroom(){
		super("Hotel Management System");
		JLabel label1=new JLabel("Search for Room");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		label1.setBounds(380,5,400,30);
		add(label1);
		
		c1=new JCheckBox("Only Display Avaialble");
		c1.setFont(new Font("Tahoma",Font.BOLD,15));
		c1.setForeground(Color.WHITE);
		c1.setBackground(new Color(3,45,48));
		c1.setBounds(550, 60, 450, 20);
		add(c1);
		
		ch1=new Choice();
		ch1.add("Double Bed");
		ch1.add("Single Bed");
		ch1.setBounds(220,55,200,50);
		add(ch1);
		
		t1=new JTable();
		t1.setBackground(new Color(26,104,110));
		t1.setForeground(Color.WHITE);
		t1.setBounds(30,130,830, 380);
		add(t1);
		
		try {
			conn c=new conn();
			String q="select * from room";
			ResultSet resultSet=c.statement.executeQuery(q);
			t1.setModel(DbUtils.resultSetToTableModel(resultSet));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		b1=new JButton("Search");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.addActionListener(this);
		b1.setBounds(150, 520, 150, 30);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.addActionListener(this);
		b2.setBounds(550, 520, 150, 30);
		add(b2);
		
		JLabel label2=new JLabel("Room Bed Type:");
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setForeground(Color.WHITE);
		label2.setBounds(50,40,200,50);
		add(label2);
		
		JLabel label3=new JLabel("Room Number");
		label3.setFont(new Font("Tahoma",Font.BOLD,15));
		label3.setForeground(Color.WHITE);
		label3.setBounds(40,100,200,30);
		add(label3);
		
		JLabel label4=new JLabel("Availability");
		label4.setFont(new Font("Tahoma",Font.BOLD,15));
		label4.setForeground(Color.WHITE);
		label4.setBounds(250,100,200,30);
		add(label4);
		
		JLabel label5=new JLabel("Clean Status");
		label5.setFont(new Font("Tahoma",Font.BOLD,15));
		label5.setForeground(Color.WHITE);
		label5.setBounds(410,100,200,30);
		add(label5);
		
		JLabel label6=new JLabel("Price");
		label6.setFont(new Font("Tahoma",Font.BOLD,15));
		label6.setForeground(Color.WHITE);
		label6.setBounds(570,100,200,30);
		add(label6);
		
		JLabel label7=new JLabel("Bed Type");
		label7.setFont(new Font("Tahoma",Font.BOLD,15));
		label7.setForeground(Color.WHITE);
		label7.setBounds(730,100,200,30);
		add(label7);
		
		getContentPane().setBackground(new Color(3,45,48));
		getContentPane().
		setLayout(null);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setUndecorated(true);
		setSize(900,600);
		setLocation(450,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new searchroom();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				String Q="select * from room where bedtype='"+ch1.getSelectedItem()+"'";
				String Q1="select * from room where availability= 'Available'  And bedtype='"+ch1.getSelectedItem()+"'";
				try {
					conn c =new conn();
				ResultSet resultSet=c.statement.executeQuery(Q);
				t1.setModel(DbUtils.resultSetToTableModel(resultSet));
				if(c1.isSelected()) {
					ResultSet resultset1=c.statement.executeQuery(Q1);
					t1.setModel(DbUtils.resultSetToTableModel(resultset1));
				}
				}catch(Exception E) {
					E.printStackTrace();
				}
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		if(e.getSource()==b2) {
			setVisible(false);
		}
		
	}

}
