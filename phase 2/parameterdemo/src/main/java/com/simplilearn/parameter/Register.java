package com.simplilearn.parameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	private ServletConfig config =null;
	private ServletContext context=null;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		this.context=config.getServletContext();
	}
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		PrintWriter out=resp.getWriter();
    		out.print("welcome to parameter demo");
    		String para1=config.getInitParameter("integer");
    		out.println("config parameter value is "+para1);
    		String para2=context.getInitParameter("username");
    		out.println("context parameter is "+para2);
    }
    @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		doGet(req, resp);
    	}

}
