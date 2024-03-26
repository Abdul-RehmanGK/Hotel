package Hotel.Management.System;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn{
    Connection connection;
    Statement statement;
    
    public conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotelms","root","");
            statement =  connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
    }
    }
}