package com.te.daoProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnection {
	protected static Connection initialize() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/login?user=root&password=root");
		return con;
	}

}
