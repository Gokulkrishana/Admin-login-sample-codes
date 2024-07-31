package com.rg.adminConnector;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorDb {
	static String url = "jdbc:mysql://localhost:3306/adminblock";
	static String uname = "root";
	static String pwd = "";
	static Connection con = null;
	public static Connection requestCon() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,pwd);
		return con;
			
	}
	
}
