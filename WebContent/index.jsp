<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ControllerServlet" method="post" >
User Name: <input type="text" name="uname"><br>
Password: <input type="password" name="password"><br>
<input type="submit" value="login"><br>
New here? <input type="submit" formaction="signup-form.jsp" value="signup">
</form>

</body>
</html>