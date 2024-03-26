package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class checkout extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel room,chkin;
	Choice c1;
	checkout(){
		super("Hotel Management System");
		
		JLabel label1 =new JLabel("Check-Out");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		label1.setBounds(200, 20, 200, 50);
		add(label1);
		
		JLabel label2=new JLabel("Customer ID:");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(50, 100, 200, 100);
		add(label2);
		
		JLabel label3=new JLabel("Room Number:");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setBounds(50, 150, 200, 150);
		add(label3);
		
		JLabel label4=new JLabel("Check-In Time:");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(50, 200, 200, 200);
		add(label4);
		
		JLabel label5=new JLabel("Check-Out Time:");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(50, 250, 200, 250);
		add(label5);
		
		c1=new Choice();
		c1.setFont(new Font("serif",Font.BOLD,18));
		c1.setBounds(330,130,200,30);
		c1.setBackground(new Color(26,104,110));
		c1.setForeground(Color.WHITE);
		add(c1);
		
		try {
			conn c=new conn();
			String q="select * from newcusform";
			ResultSet result=c.statement.executeQuery(q);
			while(result.next()) {
				c1.add(result.getString("number"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Date date=new Date();
		
		JLabel date1=new JLabel(""+date);
		date1.setForeground(Color.WHITE);
		date1.setBackground(new Color(3,45,48));
		date1.setFont(new Font("Tahoma",Font.BOLD,18));
		date1.setBounds(330, 250, 250, 250);
		add(date1);
		
		room=new JLabel();
		room.setFont(new Font("serif",Font.BOLD,20));
		room.setBounds(330,200,200,30);
		room.setForeground(Color.WHITE);
		add(room);
		
		chkin=new JLabel();
		chkin.setFont(new Font("serif",Font.BOLD,20));
		chkin.setBounds(330,290,200,30);
		chkin.setForeground(Color.WHITE);
		add(chkin);
		
		b1=new JButton("BACK");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(300, 480, 150, 40);
		b1.addActionListener(this);
		add(b1);
		
		b3=new JButton("Check Out");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Tahoma",Font.BOLD,18));
		b3.setBounds(500, 480, 150, 40);
		b3.addActionListener(this);
		add(b3);
		
		b2=new JButton("Check");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(100, 480, 150, 40);
		b2.addActionListener(this);
		add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				conn c=new conn();
				String q="Select * from newcusform where number='"+c1.getSelectedItem()+"'";
				try {
					ResultSet resultSet =c.statement.executeQuery(q);
					while(resultSet.next()) {
						room.setText(resultSet.getString("allocatedroomnumber"));
						chkin.setText(resultSet.getString("checkin"));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		}
		);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setSize(900,600);
		setLocation(450,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new checkout();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
				setVisible(false);
		}
		if(e.getSource()==b3) {
			String id=c1.getSelectedItem();
			String roomnum=room.getText();
			conn c =new conn();
			String q="Select * from newcusform";
			try {
				ResultSet resultSet =c.statement.executeQuery(q);
				c.statement.executeUpdate("delete from newcusform where number='"+id+"'");
				c.statement.executeUpdate("update room set availability='Available' where roomnumber='"+roomnum+"'");
				JOptionPane.showMessageDialog(null, "Customer Checked-Out Successfully");
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		
	}

}
