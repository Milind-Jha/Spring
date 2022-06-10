<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import= "java.util.List" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<Integer> l = (List<Integer>) request.getAttribute("nos");
	%>
	
	<h1>Help page </h1>
	<%
		for( Integer i : l){
			
			out.println("<h1>"+i+"</h1>");
		}
	
	%>

</body>
</html>