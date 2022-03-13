package com.simplilearn.simpleJDBCconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBcnf {
	private Connection connection;
	public DBcnf(String driver,String url,String username,String password)throws ClassNotFoundException,SQLException {
		//Properties props=new Properties();
		Class.forName(driver);
		this.connection=DriverManager.getConnection(url,username,password);
		
		
	}
	public Connection getConnection() {
		return connection;
	}

	public void closeConnection()throws SQLException{
		this.connection.close();
	}
	
	

}
