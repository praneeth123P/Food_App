package com.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc 
{
	 static String Driver = "com.mysql.cj.jdbc.Driver";
     static String url = "jdbc:mysql://localhost:3306/Restuarant";
	 static String UserName = "root";
	 static String Password = "Root@123";
	public static Connection getCon() throws SQLException, ClassNotFoundException {
		
			Class.forName(Driver);
			Connection Con = DriverManager.getConnection(url,UserName,Password);
				return Con;
	}
	
}
