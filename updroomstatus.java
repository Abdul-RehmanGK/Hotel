package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updroomstatus extends JFrame implements ActionListener{
	JTextField textfield1,textfield2,textfield3;
	JButton b1,b2,b3;
	Choice c1;
	JComboBox combobox1;
	updroomstatus(){
		super("Hotel Management System");
		
		JLabel label1=new JLabel("Update Room Status");
		label1.setFont(new Font("Tahoma",Font.BOLD,20));
		label1.setBounds(250, 10, 300, 30);
		label1.setForeground(Color.WHITE);
		add(label1);
		
		JLabel label2=new JLabel("ID:");
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setBounds(50, 100, 300, 30);
		label2.setForeground(Color.WHITE);
		add(label2);
		
		c1=new Choice();
		c1.setBounds(250,100,200,30);
		c1.setForeground(Color.WHITE);
		c1.setBackground(new Color(26,104,110));
		c1.setFont(new Font("Tahoma",Font.PLAIN,18));
		add(c1);
		
		try {
			conn c=new conn();
			String q="select * from newcusform";
			ResultSet resultset=c.statement.executeQuery(q);
			while(resultset.next()) {
				c1.add(resultset.getString("number"));
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
		
		JLabel label4=new JLabel("Room Number:");
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setBounds(50, 180, 300, 30);
		label4.setForeground(Color.WHITE);
		add(label4);
		
		textfield1=new JTextField();
		textfield1.setBounds(250,180,200,30);
		textfield1.setFont(new Font("Tahoma",Font.PLAIN,18));
		textfield1.setForeground(Color.WHITE);
		textfield1.setBackground(new Color(26,104,110));
		add(textfield1);
		
		JLabel label5=new JLabel("Availability:");
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setBounds(50, 260, 300, 30);
		label5.setForeground(Color.WHITE);
		add(label5);
		
		textfield2=new JTextField();
		textfield2.setBounds(250,260,200,30);
		textfield2.setFont(new Font("Tahoma",Font.PLAIN,18));
		textfield2.setForeground(Color.WHITE);
		textfield2.setBackground(new Color(26,104,110));
		add(textfield2);
		
		JLabel label6=new JLabel("Clean Status:");
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setBounds(50, 340, 300, 30);
		label6.setForeground(Color.WHITE);
		add(label6);
		
		textfield3=new JTextField();
		textfield3.setBounds(250,340,200,30);
		textfield3.setFont(new Font("Tahoma",Font.PLAIN,18));
		textfield3.setForeground(Color.WHITE);
		textfield3.setBackground(new Color(26,104,110));
		add(textfield3);
		
		
		ImageIcon imageicon1=new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
		Image i1=imageicon1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
		JLabel label3=new JLabel(imageicon2);
		label3.setBounds(550, 80, 300, 400);
		add(label3);
		
		b1=new JButton("Update");
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(200, 430, 100, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Check");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(100, 480, 100, 40);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Back");
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setFont(new Font("Tahoma",Font.BOLD,18));
		b3.setBounds(300, 480, 100, 40);
		b3.addActionListener(this);
		add(b3);
		
		getContentPane().setBackground(new Color(3,45,48));
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
		setLayout(null);
		setSize(900,600);
		setLocation(450,150);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
				try {
					String id=c1.getSelectedItem();
					String room=textfield1.getText();
					String cleanstatus=textfield3.getText();
					String availability=textfield2.getText();
					conn c=new conn();
						String q1="update room set roomnumber='"+room+"', cleaningstatus='"+cleanstatus+"', availability='"+availability+"'";
						c.statement.executeUpdate(q1);
				JOptionPane.showMessageDialog(null, "Room Updated Successfully");
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		if(e.getSource()==b2) {
			String id=c1.getSelectedItem();
			conn c=new conn();
			String q="select * from newcusform where number='"+id+"'";
			try {
				ResultSet resultSet =c.statement.executeQuery(q);
				while(resultSet.next()) {
					textfield1.setText(resultSet.getString("allocatedroomnumber"));
					textfield2.setText(resultSet.getString("name"));
					textfield3.setText(resultSet.getString("checkin"));
				}
				ResultSet resultSet1=c.statement.executeQuery("select * from room where roomnumber='"+textfield1.getText()+"'");
				while(resultSet1.next()) {
					textfield2.setText(resultSet1.getString("availability"));
					textfield3.setText(resultSet1.getString("cleaningstatus"));
				}
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		if(e.getSource()==b3) {
			setVisible(false);
		}
	}
	public static void main(String[] args) {
		new updroomstatus();

	}

}
