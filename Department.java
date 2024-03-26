package Hotel.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.apache.commons.dbutils.DbUtils;


public class Department extends JFrame implements ActionListener{
		JButton b1;
		JTable table1;
	Department(){
		super("Hotel Management System");
		table1=new JTable();
		table1.setBounds(20, 40, 840, 450);
		table1.setForeground(Color.WHITE);
		table1.setBackground(new Color(26,104,110));
		add(table1);
		
		try {
			conn c=new conn();
			String departmentinfo="select * from department";
			ResultSet resultSet=c.statement.executeQuery(departmentinfo);
			table1.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(resultSet));
		}catch(Exception e) {
			e.printStackTrace();
		}
		JLabel label1=new JLabel("Department");
		label1.setFont(new Font("Tahoma",Font.BOLD,18));
		label1.setBounds(200, 10, 200, 30);
		label1.setForeground(Color.WHITE);
		add(label1);
		
		JLabel label2=new JLabel("Budget");
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(600, 10, 200, 30);
		label2.setForeground(Color.WHITE);
		add(label2);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setSize(900,600);
		setLocation(450,150);
		setVisible(true);
		
		b1=new JButton("BACK");
		b1.setBounds(350, 500, 150, 40);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.addActionListener(this);
		add(b1);
		
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
	
	public static void main(String[] args) {
		new Department();
	}

}
