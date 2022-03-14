<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">
	Enter name:<input type="text" name="fname"><br><br>
	Enter age:<input type="text" name="age"><br><br>
	Enter Email:<input type="text" name="email"><br><br>
	Enter password:<input type="password" name="password"><br><br>
	gender: <input type="radio" name="gender" value ="female">female
			<input type="radio" name="gender" value ="male">male<br><br>
	Hobbies: <input type="checkbox" name="hobby" value="reading">reading
			<input type="checkbox" name="hobby" value="browser">browsing
			<input type="checkbox" name="hobby" value="gaming">gaming
			<input type="checkbox" name="hobby" value="writing">writing<br><br>
	country: <select name="country">
				<option value="select">select</option>	
				<option value="INDIA">INDIA</option>
				<option value="USA">USA</option>
				<option value="UK">UK</option>
			</select><br><br>
			<input type="submit" name="register" value="register details">
			
</form>
<% if(request.getParameter("register")!=null){%>
	 <jsp:useBean id="user" class="com.simplilearn.jspdemo.Userjsp" scope="request"></jsp:useBean>
	 <jsp:setProperty property="*" name="user"/>
	 <jsp:forward page="RegisterServlet"></jsp:forward>
<% }%>
</body>
</html>