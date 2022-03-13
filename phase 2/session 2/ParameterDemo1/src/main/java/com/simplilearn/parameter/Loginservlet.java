package com.simplilearn.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServletConfig config=null;
	public ServletContext context=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		this.context=config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("welcome to parameter demo<br>");
		String para1=config.getInitParameter("lname");
		out.print("<br>config "+para1);
		String para2=context.getInitParameter("uname");
		out.print("<br>context "+para2);
	}

}
