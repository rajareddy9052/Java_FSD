package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Genericservlet
 */
@WebServlet("/Genericservlet")
public class Genericservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name=request.getParameter("uname");
		String passw=request.getParameter("pass");
		if(passw.equals("raja123")) {
			out.print("login successfull<br><br>");
			out.print("welcome "+name);
		}else {
			out.print("invalid");
		}
		
		
	}

}
