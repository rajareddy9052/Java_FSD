package com.simplilearn.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException{
		//request.getRequestDispatcher("link.html").include(request, response); 
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		
		RequestDispatcher rd= null;
		
		if(username.endsWith("raja") && password.endsWith("rajag")) {
			//rd=request.getRequestDispatcher("SuccessServlet");
			PrintWriter out=response.getWriter();
			out.print("login successfull "+username);
			request.getRequestDispatcher("link.html");
			//rd.forward(request, response);	
		}else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			out.println("<center> <span style='color:red'> Invalid Credentials!!</span></center>");
		}
	}

}
