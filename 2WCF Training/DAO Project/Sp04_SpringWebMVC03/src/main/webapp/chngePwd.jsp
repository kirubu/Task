<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./chngePwd" method="post">
		Current Password: <input type="password" name="cpwd"><br>
		New Password: <input type="password" name="npwd"><br>
		Re-type New Password: <input type="password" name="npwd1"><br>
		<input type="submit" value="Change Password">
	</form>
</body>
</html>