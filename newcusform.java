package Hotel.Management.System;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.Date;

public class newcusform extends JFrame implements ActionListener{
	JButton b1,b2;
	JComboBox combobox1;
	Choice c1;
	TextField textfield1;
	TextField textfield2;
	TextField textfield3,textfield4;
	JRadioButton male,female;
	JLabel date;
	newcusform(){
		super("Hotel Management System");
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(250, 500, 150, 50);
		b2.addActionListener(this);
		add(b2);
		
		b1=new JButton("ADD");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(50, 500, 150, 50);
		b1.addActionListener(this);
		add(b1);
		
		ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
		Image i1=imageicon.getImage().getScaledInstance(200, 250, Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
		JLabel label1=new JLabel(imageicon2);
		label1.setBounds(650, 150, 200, 250);
		add(label1);
		
		JLabel label2=new JLabel("New Customer Form");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,22));
		label2.setBounds(200,5,300,20);
		add(label2);
		
		JLabel label3=new JLabel("ID:");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setBounds(50, 40, 200, 40);
		add(label3);
		
		JLabel label4=new JLabel("Number:");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(50, 80, 200, 70);
		add(label4);
		
		JLabel label5=new JLabel("Name:");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(50, 120, 200, 100);
		add(label5);
		
		JLabel label6=new JLabel("Gender:");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setBounds(50, 160, 200, 130);
		add(label6);
		
		JLabel label7=new JLabel("Country:");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Tahoma",Font.BOLD,18));
		label7.setBounds(50, 200, 200, 160);
		add(label7);
		
		JLabel label8=new JLabel("Allocated Room Number:");
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("Tahoma",Font.BOLD,18));
		label8.setBounds(50, 240, 300, 190);
		add(label8);
		
		JLabel label9=new JLabel("Checked-In:");
		label9.setForeground(Color.WHITE);
		label9.setFont(new Font("Tahoma",Font.BOLD,18));
		label9.setBounds(50, 280, 200, 220);
		add(label9);
		
		JLabel label10=new JLabel("Deposit:");
		label10.setForeground(Color.WHITE);
		label10.setFont(new Font("Tahoma",Font.BOLD,18));
		label10.setBounds(50, 320, 200, 250);
		add(label10);
		
		combobox1=new JComboBox(new String[] {"Passport","Identity Card","Voter ID","Driving License"});
		combobox1.setFont(new Font("Tahoma",Font.BOLD,18));
		combobox1.setBounds(350, 45, 200, 30);
		combobox1.setBackground(new Color(26,104,110));
		combobox1.setForeground(Color.WHITE);
		add(combobox1);
		
		textfield1=new TextField();
		textfield1.setBounds(350, 100, 200, 30);
		textfield1.setForeground(Color.WHITE);
		textfield1.setBackground(new Color(26,104,110));
		textfield1.setFont(new Font("serif",Font.BOLD,18));
	    add(textfield1);
	    
	    textfield2=new TextField();
	    textfield2.setBackground(new Color(26,104,110));
	    textfield2.setBounds(350, 155, 200, 30);
		textfield2.setForeground(Color.WHITE);
		textfield2.setFont(new Font("serif",Font.BOLD,18));
	    add(textfield2);
	    
	    male=new JRadioButton("Male");
	    male.setBounds(350, 200, 100, 45);
	    male.setForeground(Color.WHITE);
	    male.setBackground(new Color(3,45,48));
	    male.setFont(new Font("Tahoma",Font.BOLD,18));
	    add(male);
	    
	    female=new JRadioButton("Female");
	    female.setBounds(460, 200, 100, 45);
	    female.setBackground(new Color(3,45,48));
	    female.setForeground(Color.WHITE);
	    female.setFont(new Font("Tahoma",Font.BOLD,18));
	    add(female);
	    
	    textfield3=new TextField();
		textfield3.setBounds(350, 260, 200, 30);
		textfield3.setForeground(Color.WHITE);
		textfield3.setBackground(new Color(26,104,110));
		textfield3.setFont(new Font("serif",Font.BOLD,18));
	    add(textfield3);
	    
	    c1=new Choice();
	    c1.setBounds(350, 315, 200, 30);
	    c1.setForeground(Color.WHITE);
	    c1.setBackground(new Color(26,104,110));
	    c1.setFont(new Font("serif",Font.BOLD,18));
	    add(c1);
	    
	    try {
	    	conn c=new conn();
	    	String q="Select * from room";
	    	ResultSet resultset=c.statement.executeQuery(q);
	    	while(resultset.next()) {
	    		c1.add(resultset.getString("roomnumber"));
	    	}
	    }catch(Exception E) {
	    	E.printStackTrace();
	    }
	    
	    Date date1=new Date();
	    
	    date=new JLabel(" "+date1);
	    date.setBounds(345,375,200,30);
	    date.setForeground(Color.WHITE);
	    date.setFont(new Font("serif",Font.BOLD,18));
	    add(date);
	    
	    textfield4=new TextField();
		textfield4.setBounds(350, 425, 200, 30);
		textfield4.setForeground(Color.WHITE);
		textfield4.setBackground(new Color(26,104,110));
		textfield4.setFont(new Font("serif",Font.BOLD,18));
	    add(textfield4);
	    
		getContentPane().setBackground(new Color(3,45,48));
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setLayout(null);
		setLocation(450,150);
		setSize(900,600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String id=(String) combobox1.getSelectedItem();
			String number=textfield1.getText();
			String name=textfield2.getText();
			String radiobtn=null;
			if(male.isSelected()) {
				radiobtn="Male";
			}else {
				radiobtn="Female";
			}
			String gender=radiobtn;
			String country=textfield3.getText();
			String allocatedroomnumber=c1.getSelectedItem();
			String checkin=date.getText();
			String deposit=textfield4.getText();
			try {
				conn c=new conn();
				String q="insert into newcusform values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+allocatedroomnumber+"','"+checkin+"','"+deposit+"')";
				String q1="update room set availability='Occupied'where roomnumber="+allocatedroomnumber;
				c.statement.executeUpdate(q);
				c.statement.executeUpdate(q1);
				JOptionPane.showMessageDialog(null, "Customer Added Successfully");
			}catch(Exception E) {
				E.printStackTrace();
			}
			setVisible(false);
		}
		if(e.getSource()==b2) {
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new newcusform();

	}

}
