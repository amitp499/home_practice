<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
${message}
<form action="Authenticate.do" method="post">

<table>
<tr>
<td>UserId : </td>
<td><input type="text" name="txtuserId"> </td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="txtuserPass"> </td>
</tr>
<tr><td><input type="submit" value="Login"> </td>
</tr>
</table>

</form>

</body>
</html>