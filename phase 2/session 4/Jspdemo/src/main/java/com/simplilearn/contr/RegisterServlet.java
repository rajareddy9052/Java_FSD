package com.simplilearn.contr;

import java.io.IOException;
import java.io.PrintWriter;

import com.simplilearn.jspdemo.Userjsp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Userjsp user=(Userjsp) request.getAttribute("user");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<h3> Your Details :<br>"+ user +"</h3>");
	}

}
