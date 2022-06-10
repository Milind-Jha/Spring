<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Sign Up Now, It's free</h1>

	<%
	if (request.getAttribute("status") != null) {
		String res = request.getAttribute("status").toString();
		out.println("<h2>" + res + "</h2>");
	}
	%>

	<form action="processforsignup" method="post">

		<label for="name"> Name:</label><br> <input type="text" id="name"
			name="name"><br> <label for="Email">Email id:</label><br>
		<input type="email" id="eMail" name="email"><br> <label
			for="Password">Password :</label><br> <input type="password"
			id="pass" name="password"><br> <input type="submit"
			value="Submit">
	</form>
</body>
</html>