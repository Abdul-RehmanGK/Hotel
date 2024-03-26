package Hotel.Management.System;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
public class managerinfo extends JFrame implements ActionListener{
	JTable table1;
	JButton b1;
	managerinfo(){
		super("Hotel Management System");
		table1=new JTable();
		table1.setBounds(20, 40, 1100, 450);
		table1.setForeground(Color.WHITE);
		table1.setBackground(new Color(26,104,110));
		add(table1);

		try {
			conn c=new conn();
			String q="select * from employee where job='Manager'";
			ResultSet resultSet=c.statement.executeQuery(q);
			table1.setModel(DbUtils.resultSetToTableModel(resultSet));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		JLabel label1=new JLabel("Name");
		label1.setFont(new Font("Tahoma",Font.BOLD,18));
		label1.setBounds(20, 10, 200, 30);
		label1.setForeground(Color.WHITE);
		add(label1);

		JLabel label2=new JLabel("Age");
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(150, 10, 200, 30);
		label2.setForeground(Color.WHITE);
		add(label2);

		JLabel label3=new JLabel("Gender");
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setBounds(280, 10, 200, 30);
		label3.setForeground(Color.WHITE);
		add(label3);

		JLabel label4=new JLabel("Job");
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(410, 10, 200, 30);
		label4.setForeground(Color.WHITE);
		add(label4);

		JLabel label5=new JLabel("Salary");
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(540, 10, 200, 30);
		label5.setForeground(Color.WHITE);
		add(label5);

		JLabel label6=new JLabel("Phone");
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setBounds(670, 10, 200, 30);
		label6.setForeground(Color.WHITE);
		add(label6);

		JLabel label7=new JLabel("ID-Card");
		label7.setFont(new Font("Tahoma",Font.BOLD,18));
		label7.setBounds(800, 10, 200, 30);
		label7.setForeground(Color.WHITE);
		add(label7);

		JLabel label8=new JLabel("GMAIL");
		label8.setFont(new Font("Tahoma",Font.BOLD,18));
		label8.setBounds(950, 10, 200, 30);
		label8.setForeground(Color.WHITE);
		add(label8);

		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setSize(1150,600);
		setLocation(400,150);
		setVisible(true);

		b1=new JButton("BACK");
		b1.setBounds(500, 500, 150, 40);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(this);
		add(b1);
	}
	public static void main(String[] args) {
		new managerinfo();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				setVisible(false);
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		
	}

}
