package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame{
	
	Splash(){
		super("Hotel Management System");
		ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icon/Potter Hotl And Restaurant.gif"));
		JLabel label = new JLabel(imageIcon);
		label.setBounds(0,0,858,800);
		add(label);
		
		setLayout(null);
		setLocation(350,10);
		setSize(858,800);
		setVisible(true);
		try {
			Thread.sleep(5000);
			setVisible(false);
			new Login();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Splash();

	}

}
 