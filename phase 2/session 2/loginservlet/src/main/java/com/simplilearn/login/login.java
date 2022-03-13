package com.simplilearn.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("uname");
		String password = request.getParameter("Pass");
		if (user.equals("raja") && password.equals("r1j1")) {
			out.print("welcome " + user);
			out.print("<br><a href='Logout'>logout</a>");
			/**try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/eproduct";
				String username = "root";
				String Password = "rajagopal";
				Connection con = DriverManager.getConnection(url, username, Password);
				Statement stmt = con.createStatement();
				// String sql="select * from eproduct";
				ResultSet rs = stmt.executeQuery("SELECT * from eproduct");
				rs.close();
				stmt.close();
				con.close();

			} catch (Exception e) {
				// TODO: handle exception
			}**/

		} else {
			response.setContentType("text/html");
			//response.sendRedirect("index.html");
			out.print("<center> <span style='color:red'> Invalid Credentials!!</span></center>"); 
			//out.print("<h1>invalid </h1><br><br>");
			out.print("<a href='index.html'>login</a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
