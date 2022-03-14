<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to HTML</h1>
	<%= "<h1> welcome to jsp </h1>" %>
	<%
		int x=10;
	%>
	
	<input type="text" value="<%=x%>"><br>
	<%
		for(int i=0;i<5;i++){
			out.print("i = "+i+"<br>");
		}
	%>
	<form action="">
	enter name: <input type="text" name="fnm">
	<input type="submit" name="click" value="click me">
	</form>
	<%
		if(request.getParameter("click")!=null){
			out.print("hello "+request.getParameter("fnm"));
		}
	%>
	<%@include file="footer.html"  %>
	the current date is <%= new Date() %>
</body>
</html>