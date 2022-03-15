package com.simplilearn.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Custombodycase extends SimpleTagSupport {
	
	@Override
	public void doTag() throws JspException, IOException {
		  JspWriter out=getJspContext().getOut();
		  StringWriter sw= new StringWriter();
		  getJspBody().invoke(sw);
		  
		  out.print("<b>" + sw.toString().toUpperCase()+ "<b>");
	}

}
