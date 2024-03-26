package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addEmployee extends JFrame implements ActionListener{
	JButton b1,b2;
	JRadioButton radiobutton1,radiobutton2;
	JComboBox combobox;
	JTextField textfield1,textfield2,textfield3,textfield4,textfield5,textfield6;
	public addEmployee() {
		super("Hotel Management System");
		
		JLabel label1=new JLabel("NAME");
		label1.setBounds(50, 10, 100, 100);
		label1.setForeground(Color.white);
		label1.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label1);
		
		JLabel label2=new JLabel("AGE");
		label2.setBounds(50, 60, 100, 100);
		label2.setForeground(Color.white);
		label2.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label2);
		
		JLabel label3=new JLabel("GENDER");
		label3.setBounds(50, 110, 100, 100);
		label3.setForeground(Color.white);
		label3.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label3);
		
		JLabel label4=new JLabel("JOB");
		label4.setBounds(50, 160, 100, 100);
		label4.setForeground(Color.white);
		label4.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label4);
		
		JLabel label5=new JLabel("SALARY");
		label5.setBounds(50, 210, 100, 100);
		label5.setForeground(Color.white);
		label5.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label5);
		
		JLabel label6=new JLabel("PHONE");
		label6.setBounds(50, 260, 100, 100);
		label6.setForeground(Color.white);
		label6.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label6);
		
		JLabel label7=new JLabel("ID-CARD NUMBER");
		label7.setBounds(50, 310, 250, 100);
		label7.setForeground(Color.white);
		label7.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label7);
		
		JLabel label8=new JLabel("EMAIL");
		label8.setBounds(50, 360, 100, 100);
		label8.setForeground(Color.white);
		label8.setFont(new Font("Tahoma",Font.BOLD,17));
		add(label8);
		
		JLabel label9=new JLabel("ADD EMPLOYEES DETAILS");
		label9.setBounds(600, 10, 550, 80);
		label9.setForeground(Color.white);
		label9.setFont(new Font("Tahoma",Font.BOLD,27));
		add(label9);
		
		ImageIcon imageicon1=new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
		Image i1=imageicon1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon imageicon2=new ImageIcon(i1);
		JLabel label10=new JLabel(imageicon2);
		label10.setBounds(530, 50, 500, 500);
		add(label10);
		
		
		textfield1=new JTextField();
		textfield1.setBackground(new Color(26,104,110));
		textfield1.setForeground(Color.WHITE);
		textfield1.setFont(new Font("serif",Font.PLAIN,18));
		textfield1.setBounds(280, 40, 220, 30);
		add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBackground(new Color(26,104,110));
		textfield2.setForeground(Color.WHITE);
		textfield2.setFont(new Font("serif",Font.PLAIN,18));
		textfield2.setBounds(280, 90, 220, 30);
		add(textfield2);
		
		combobox=new JComboBox(new String[] {"Front Desk","House Keeping","Manager","Kitchen Staff","Room Service","Accountant","Shef"});
		combobox.setBackground(new Color(26,104,110));
		combobox.setForeground(Color.WHITE);
		combobox.setFont(new Font("serif",Font.PLAIN,18));
		combobox.setBounds(280, 190, 220, 30);
		add(combobox);
		
		textfield3=new JTextField();
		textfield3.setBackground(new Color(26,104,110));
		textfield3.setForeground(Color.WHITE);
		textfield3.setFont(new Font("serif",Font.PLAIN,18));
		textfield3.setBounds(280, 240, 220, 30);
		add(textfield3);
		
		textfield4=new JTextField();
		textfield4.setBackground(new Color(26,104,110));
		textfield4.setForeground(Color.WHITE);
		textfield4.setFont(new Font("serif",Font.PLAIN,18));
		textfield4.setBounds(280, 290, 220, 30);
		add(textfield4);
		
		textfield5=new JTextField();
		textfield5.setBackground(new Color(26,104,110));
		textfield5.setForeground(Color.WHITE);
		textfield5.setFont(new Font("serif",Font.PLAIN,18));
		textfield5.setBounds(280, 340, 220, 30);
		add(textfield5);
		
		textfield6=new JTextField();
		textfield6.setBackground(new Color(26,104,110));
		textfield6.setForeground(Color.WHITE);
		textfield6.setFont(new Font("serif",Font.PLAIN,18));
		textfield6.setBounds(280, 390, 220, 30);
		add(textfield6);
		
		b1=new JButton("ADD");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Tahoma",Font.BOLD,18));
		b1.setBounds(80, 460,170, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Tahoma",Font.BOLD,18));
		b2.setBounds(300, 460,170, 40);
		b2.addActionListener(this);
		add(b2);
		
		
		radiobutton1=new JRadioButton("MALE");
		radiobutton1.setBounds(280, 140, 100, 40);
		radiobutton1.setForeground(Color.white);
		radiobutton1.setBackground(new Color(3,45,48));
		radiobutton1.setFont(new Font("Tahoma",Font.BOLD,18));
		add(radiobutton1);
		
		radiobutton2=new JRadioButton("FEMALE");
		radiobutton2.setBounds(400, 140, 100, 40);
		radiobutton2.setForeground(Color.white);
		radiobutton2.setBackground(new Color(3,45,48));
		radiobutton2.setFont(new Font("Tahoma",Font.BOLD,18));
		add(radiobutton2);
		
		
		getContentPane().setBackground(new Color(3,45,48));
		setLayout(null);
		setSize(1050,600);
		setLocation(270,90);
		setBackground(Color.WHITE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String name=textfield1.getText();
			String age=textfield2.getText();
			String salary=textfield3.getText();
			String phone=textfield4.getText();
			String idcardnumber=textfield5.getText();
			String email=textfield6.getText();
			String job=(String) combobox.getSelectedItem();
			String gender=null;
			if(radiobutton1.isSelected()) {
				gender="Male";
			}else if(radiobutton2.isSelected()) {
				gender="Female";
			}
			try {
				conn c=new conn();
				String q="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+idcardnumber+"','"+email+"')";
				c.statement.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "Employee Successfully Added");
				setVisible(false);
				new Admin();
			}catch(Exception E) {
				E.printStackTrace();
			}
		}else{
			setVisible(false);
			new Admin();
		}
			
	}
	
	public static void main(String[] args) {
		new addEmployee();
		
	}
}
