package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class updcheckin extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	Choice c1;
	JTextField textfield1,textfield2,textfield3,textfield4,textfield5;
	updcheckin(){
		super("Hotel Management System");
		JLabel label1=new JLabel("Check-In Details");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		label1.setBounds(250, 30, 200, 30);
		add(label1);
		
		JLabel label2=new JLabel("ID:");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(40, 100, 200, 50);
		add(label2);
		
		JLabel label3=new JLabel("Room Number:");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setBounds(40, 150, 200, 50);
		add(label3);
		
		JLabel label4=new JLabel("Name:");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(40, 200, 200, 50);
		add(label4);
		
		JLabel label5=new JLabel("Checked-In:");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(40, 250, 200, 50);
		add(label5);
		
		JLabel label6=new JLabel("Amount Paid:");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setBounds(40, 300, 200, 50);
		add(label6);
		
		JLabel label7=new JLabel("Pending Amount:");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Tahoma",Font.BOLD,18));
		label7.setBounds(40, 350, 200, 50);
		add(label7);
		
		b1=new JButton("Check");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,16));
		b1.addActionListener(this);
		b1.setBounds(50, 450, 100, 30);
		add(b1);

		b2=new JButton("Update");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,16));
		b2.addActionListener(this);
		b2.setBounds(180, 450, 100, 30);
		add(b2);
		
		b3=new JButton("Back");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Tahoma",Font.BOLD,16));
		b3.addActionListener(this);
		b3.setBounds(310, 450, 100, 30);
		add(b3);
		
		textfield2=new JTextField();
		textfield2.setForeground(Color.WHITE);
		textfield2.setFont(new Font("serif",Font.PLAIN,18));
		textfield2.setBounds(290,310,200,30);
		textfield2.setBackground(new Color(26,104,110));
		add(textfield2);
		
		textfield1=new JTextField();
		textfield1.setForeground(Color.WHITE);
		textfield1.setFont(new Font("serif",Font.PLAIN,18));
		textfield1.setBounds(290,360,200,30);
		textfield1.setBackground(new Color(26,104,110));
		add(textfield1);
		
		textfield3=new JTextField();
		textfield3.setForeground(Color.WHITE);
		textfield3.setFont(new Font("serif",Font.PLAIN,18));
		textfield3.setBounds(290,260,200,30);
		textfield3.setBackground(new Color(26,104,110));
		add(textfield3);
		
		textfield4=new JTextField();
		textfield4.setForeground(Color.WHITE);
		textfield4.setFont(new Font("serif",Font.PLAIN,18));
		textfield4.setBounds(290,210,200,30);
		textfield4.setBackground(new Color(26,104,110));
		add(textfield4);
		
		textfield5=new JTextField();
		textfield5.setForeground(Color.WHITE);
		textfield5.setFont(new Font("serif",Font.PLAIN,18));
		textfield5.setBounds(290,160,200,30);
		textfield5.setBackground(new Color(26,104,110));
		add(textfield5);
		
		c1=new Choice();
		c1.setForeground(Color.WHITE);
		c1.setFont(new Font("serif",Font.PLAIN,18));
		c1.setBackground(new Color(26,104,110));
		c1.setBounds(290,110,200,30);
		c1.setBackground(new Color(26,104,110));
		add(c1);
		
		try {
			conn c=new conn();
			String q="Select * from newcusform";
			ResultSet result=c.statement.executeQuery(q);
			while(result.next()) {
				c1.add(result.getString("number"));
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String id=c1.getSelectedItem();
				String q="select * from newcusform";
				try {
					conn c=new conn();
					ResultSet resultSet=c.statement.executeQuery(q);
					while(resultSet.next()) {
						textfield5.setText(resultSet.getString("allocatedroomnumber"));
						textfield2.setText(resultSet.getString("deposit"));
						textfield3.setText(resultSet.getString("checkin"));
						textfield4.setText(resultSet.getString("name"));
					}
					ResultSet resultSet1=c.statement.executeQuery("select * from newcusform where allocatedroomnumber='"+textfield1.getText()+"'");
				}catch(Exception E) {
					E.printStackTrace();
				}	
				
			}
			
		});
		
		ImageIcon imageicon=new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
		Image i1=imageicon.getImage().getScaledInstance(300, 350,Image.SCALE_DEFAULT);
		ImageIcon imageicon1=new ImageIcon(i1);
		JLabel label8=new JLabel(imageicon1);
		label8.setBounds(550,60,300,350);
		add(label8);
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setSize(900,600);
		setLocation(450,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new updcheckin();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			try {
				String id=c1.getSelectedItem();
				String room=textfield5.getText();
				String name=textfield4.getText();
				String checkin=textfield3.getText();
				String deposit=textfield2.getText();
				String pendingamount=textfield1.getText();
				conn c=new conn();
					String q1="update newcusform set allocatedroomnumber='"+room+"', name='"+name+"', checkin='"+checkin+"', deposit='"+deposit+"',pendingamount='"+pendingamount+"'";
					c.statement.executeUpdate(q1);
				JOptionPane.showMessageDialog(null,"Customer Data Updated Successfully");
			}catch(Exception E) {
				E.printStackTrace();
			}
		}if(e.getSource()==b3) {
			setVisible(false);
		}
		
	}

}
