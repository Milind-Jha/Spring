<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import= "java.util.List" %>  
<%@ page isELIgnored ="false" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		String time = (String) request.getAttribute("time");
		List<Integer> l = (List<Integer>) request.getAttribute("nos");
	%>
	
	<h1>Web site opened on : <%= time %></h1>
	<h1> ${time} </h1>
	
	<%
		for( Integer i : l){
			
			out.println("<h1>"+i+"</h1>");
		}
	
	%>
	
	
	
	<h1> Exact time : ${exactTime} </h1>

</body>
</html>