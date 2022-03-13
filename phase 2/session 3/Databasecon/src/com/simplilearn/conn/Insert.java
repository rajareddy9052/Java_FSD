package com.simplilearn.conn;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {
	public static void main(String[] args)  {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/simplilearn";
		String username="root";
		String password="rajagopal";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null) 
			{
				String sql="insert into student(id,fname,lname,Email) values"+ "(3,'sudheshna','shetti','sai@gmail.com')";
				java.sql.Statement stmt= con.createStatement();
				stmt.execute(sql);
				System.out.println("data insearted");
				
				//System.out.println("connection established");
			}
				
			else
				System.out.println("connection not established");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	/**public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/simplilearn";
		String username="root";
		String password="rajagopal";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established");
			else
				System.out.println("connection not established");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}**/

}
