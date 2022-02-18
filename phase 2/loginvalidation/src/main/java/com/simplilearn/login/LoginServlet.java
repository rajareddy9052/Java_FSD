package com.simplilearn.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        if(name.equals("raja")&& password.equals("r1j1")){  
	        out.print("<center>  Welcome <center> "+name+" login successfull");  
	        HttpSession session=request.getSession();  
	        session.setAttribute("name",name);  
	        }  
	        else{  
	              
	            request.getRequestDispatcher("login.html").include(request, response);
	            out.print("<center> <span style='color:red'> Invalid Credentials!!</span></center>");  
	        }  
	        out.close();  
	}

}
