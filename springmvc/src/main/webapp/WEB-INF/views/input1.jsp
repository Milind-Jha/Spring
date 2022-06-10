<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="process" method="post">
  <label for="fname">First name:</label><br>
  <input type="text" id="fname" name="firstname"><br>
  <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="lastname"><br>
  <label for="Email">Email id:</label><br>
  <input type="email" id="eMail" name="eMailId"><br>
  <label for="Password">Password :</label><br>
  <input type="password" id="pass" name="pass"><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>