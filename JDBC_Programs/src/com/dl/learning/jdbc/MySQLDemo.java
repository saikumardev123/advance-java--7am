package com.dl.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 1:  Load the driver and register with Driver Manager.
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		
		//com.mysql.cj.jdbc.Driver
		 
		Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root","ipl2021@dubai");
		
		System.out.println(connection);
		
		System.out.println(connection.isClosed());
		
		connection.close();
		
		System.out.println(connection.isClosed());
		
	}

}
