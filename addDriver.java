package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class addDriver extends JFrame implements ActionListener{
	JComboBox combobox1,combobox2;
	JButton b1,b2;
	JTextField textfield1,textfield2,textfield3,textfield4,textfield5;
	addDriver(){
		super("Hotel Management System");
		
		
		
		JLabel label1=new JLabel("ADD DRIVERS");
		label1.setBounds(280, 20, 350, 20);
		label1.setFont(new Font("Tahoma",Font.BOLD,22));
		label1.setForeground(Color.WHITE);
		add(label1);
	
		textfield1=new JTextField();
		textfield1.setBackground(new Color(26,104,110));
		textfield1.setForeground(Color.WHITE);
		textfield1.setFont(new Font("serif",Font.PLAIN,18));
		textfield1.setBounds(280, 65, 210, 30);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBackground(new Color(26,104,110));
		textfield2.setForeground(Color.WHITE);
		textfield2.setFont(new Font("serif",Font.PLAIN,18));
		textfield2.setBounds(280, 115, 210, 30);
		add(textfield2);
		
		combobox1=new JComboBox(new String[] {"Male","Female"});
		combobox1.setBackground(new Color(26,104,110));
		combobox1.setForeground(Color.WHITE);
		combobox1.setFont(new Font("serif",Font.PLAIN,18));
		combobox1.setBounds(280, 165, 210, 30);
		add(combobox1);
		
		textfield3=new JTextField();
		textfield3.setBackground(new Color(26,104,110));
		textfield3.setForeground(Color.WHITE);
		textfield3.setFont(new Font("serif",Font.PLAIN,18));
		textfield3.setBounds(280, 215, 210, 30);
		add(textfield3);
		
		textfield4=new JTextField();
		textfield4.setBackground(new Color(26,104,110));
		textfield4.setForeground(Color.WHITE);
		textfield4.setFont(new Font("serif",Font.PLAIN,18));
		textfield4.setBounds(280, 265, 210, 30);
		add(textfield4);
		
		combobox2=new JComboBox(new String[] {"Yes","No"});
		combobox2.setBackground(new Color(26,104,110));
		combobox2.setForeground(Color.WHITE);
		combobox2.setFont(new Font("serif",Font.PLAIN,18));
		combobox2.setBounds(280, 315, 210, 30);
		add(combobox2);
		
		textfield5=new JTextField();
		textfield5.setBackground(new Color(26,104,110));
		textfield5.setForeground(Color.WHITE);
		textfield5.setFont(new Font("serif",Font.PLAIN,18));
		textfield5.setBounds(280, 365, 210, 30);
		add(textfield5);
		
		JLabel label2=new JLabel("NAME");
		label2.setBounds(80, 35, 100, 100);
		label2.setForeground(Color.white);
		label2.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label2);
		
		JLabel label3=new JLabel("AGE");
		label3.setBounds(80, 85, 100, 100);
		label3.setForeground(Color.white);
		label3.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label3);
		
		JLabel label4=new JLabel("GENDER");
		label4.setBounds(80, 135, 100, 100);
		label4.setForeground(Color.white);
		label4.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label4);
		
		JLabel label5=new JLabel("CAR COMPANY");
		label5.setBounds(80, 185, 200, 100);
		label5.setForeground(Color.white);
		label5.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label5);
		
		JLabel label6=new JLabel("CAR NAME");
		label6.setBounds(80, 235, 100, 100);
		label6.setForeground(Color.white);
		label6.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label6);
		
		JLabel label7=new JLabel("AVAILABLE");
		label7.setBounds(80, 285, 100, 100);
		label7.setForeground(Color.white);
		label7.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label7);
		
		JLabel label8=new JLabel("LOCATION");
		label8.setBounds(80, 335, 100, 100);
		label8.setForeground(Color.white);
		label8.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label8);
		
		b1=new JButton("ADD");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(80, 450, 150, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(300, 450, 150, 40);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon imageicon1=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
		Image i1 =imageicon1.getImage().getScaledInstance(380, 380, Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
 		JLabel label9 =new JLabel(imageicon2);
 		label9.setBounds(600, 60, 380, 380);
 		add(label9);
		
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(1050,600);
		setLocation(270,90);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String name=textfield1.getText();
			String age=textfield2.getText();
			String gender=(String) combobox1.getSelectedItem();
			String carcompany=textfield3.getText();
			String carname=textfield4.getText();
			String available=(String) combobox2.getSelectedItem();
			String location=textfield5.getText();
			
			try {
				conn c=new conn();
				String q="insert into driver values('"+name+"','"+age+"','"+gender+"','"+carcompany+"','"+carname+"','"+available+"','"+location+"')";
				c.statement.executeUpdate(q);
				
				JOptionPane.showMessageDialog(null, "Driver add successfully");
				setVisible(false);
				new Admin();
			}catch(Exception E) {
				E.printStackTrace();
			}
		}else {
			setVisible(false);
			new Admin();
		}
		
	}
	
	public static void main(String[] args) {
		new addDriver();
	}

}
