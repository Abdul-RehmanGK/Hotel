package Hotel.Management.System;
import javax.swing.*;
import	java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addRoom extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField textfield1,textfield2;
	JComboBox combobox1,combobox2,combobox3;
	addRoom(){
		super("Hotel Management System");
		JLabel label1=new JLabel("ADD ROOMS");
		label1.setBounds(280, 20, 350, 20);
		label1.setFont(new Font("Tahoma",Font.BOLD,22));
		label1.setForeground(Color.WHITE);
		add(label1);
		
		JLabel label2=new JLabel("Room Number");
		label2.setBounds(80, 80, 250, 20);
		label2.setFont(new Font("Tahoma",Font.BOLD,18));
		label2.setForeground(Color.WHITE);
		add(label2);
		
		textfield1=new JTextField();
		textfield1.setBounds(280, 70, 200, 30);
		textfield1.setFont(new Font("serif",Font.PLAIN,18));
		textfield1.setBackground(new Color(26,104,110));
		textfield1.setForeground(Color.WHITE);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(280, 170, 200, 30);
		textfield2.setFont(new Font("serif",Font.PLAIN,18));
		textfield2.setBackground(new Color(26,104,110));
		textfield2.setForeground(Color.WHITE);
		add(textfield2);
		
		JLabel label3=new JLabel("Availability");
		label3.setBounds(80, 130, 250, 20);
		label3.setFont(new Font("Tahoma",Font.BOLD,18));
		label3.setForeground(Color.WHITE);
		add(label3);
		
		combobox1=new JComboBox(new String[]{"Available","Occupied"});
		combobox1.setBounds(280,120,200,30);
		combobox1.setBackground(new Color(26,104,110));
		combobox1.setForeground(Color.WHITE);
		combobox1.setFont(new Font("serif",Font.PLAIN,18));
		add(combobox1);
	
		combobox2=new JComboBox(new String[]{"Cleaned ","Dirty"});
		combobox2.setBounds(280,220,200,30);
		combobox2.setBackground(new Color(26,104,110));
		combobox2.setForeground(Color.WHITE);
		combobox2.setFont(new Font("serif",Font.PLAIN,18));
		add(combobox2);
		
		combobox3=new JComboBox(new String[]{"Single Bed","Double Bed"});
		combobox3.setBounds(280,270,200,30);
		combobox3.setBackground(new Color(26,104,110));
		combobox3.setForeground(Color.WHITE);
		combobox3.setFont(new Font("serif",Font.PLAIN,18));
		add(combobox3);
		
		ImageIcon imageicon1=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
		Image i1=imageicon1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
		JLabel label7=new JLabel(imageicon2);
		label7.setVisible(true);
		label7.setBounds(600, 30, 350, 350);
		add(label7);
		
		
		JLabel label4=new JLabel("Price");
		label4.setBounds(80, 180, 250, 20);
		label4.setFont(new Font("Tahoma",Font.BOLD,18));
		label4.setForeground(Color.WHITE);
		add(label4);
		
		JLabel label5=new JLabel("Cleaning Status");
		label5.setBounds(80, 220, 250, 20);
		label5.setFont(new Font("Tahoma",Font.BOLD,18));
		label5.setForeground(Color.WHITE);
		add(label5);
		
		
		JLabel label6=new JLabel("Bed Type");
		label6.setBounds(80, 270, 250, 20);
		label6.setFont(new Font("Tahoma",Font.BOLD,18));
		label6.setForeground(Color.WHITE);
		add(label6);
		
		b1=new JButton("ADD");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,16));
		b1.setBounds(100, 330, 130, 35);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,16));
		b2.setBounds(300, 330, 130, 35);
		b2.addActionListener(this);
		add(b2);
		
		getContentPane().setBackground(new Color(3,45,48));
		setUndecorated(true);
		setLayout(null);
		setSize(1050,500);
		setLocation(270,150);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			try {
				conn c =new conn();
				String room=textfield1.getText();
				String ava=(String)combobox1.getSelectedItem();
				String status=(String)combobox2.getSelectedItem();
				String price=textfield2.getText();
				String bed_type=(String)combobox3.getSelectedItem();
				String q="insert into room values('"+room+"','"+ava+"','"+price+"','"+status+"','"+bed_type+"')";
				c.statement.executeUpdate(q);
				JOptionPane.showMessageDialog(null,"Room Successfully Added");
				setVisible(false);
				new Admin();
			}catch(Exception E){
				E.printStackTrace();
			}
		}else {
			setVisible(false);
			new Admin();
		}
		
	}
	
	public static void main(String[] args) {
		new addRoom();
	}
}
