package Hotel.Management.System;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class conn2 {
	Connection connection2;
	java.sql.Statement statement2;
	
	public conn2(){
		try{
			connection2=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms","root","");
		statement2 =connection2.createStatement();
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
}
