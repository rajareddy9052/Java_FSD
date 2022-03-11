package com.flightbooking.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flightbooking.database.ConnectionUtil;

/**
 * Servlet implementation class RegistrationOfUser
 */
@WebServlet("/UserRegistration")
public class RegistrationOfUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phno = request.getParameter("phoneNo");
		String adno = request.getParameter("aadhaarNo");
		HashMap<String, String> user = new HashMap<>();
		user.put("email", email);
		user.put("password", password);
		user.put("name", name);
		user.put("phoneNo", phno);
		user.put("AadhaarNo", adno);
		try {
			ConnectionUtil dao = new ConnectionUtil();
			boolean result = dao.insertFlight(user);
			HttpSession session = request.getSession();
			if (result) {
				session.setAttribute("message", "User Added Successfully");
			} else {
				session.setAttribute("message", "Invalid Details");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("UserPage.jsp");
	}

}