<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored ="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome ${user.getName()}</h1>
	<h2>Username : ${user.getEmail()}</h2>
	<h2>You have ${nos} mails in your inbox</h2>

</body>
</html>