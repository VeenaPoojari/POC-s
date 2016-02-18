<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<div align="center">
		<%
			String msg = (String) request.getAttribute("msg");
			if (msg != null) {
		%>
		<%=msg%>
		<%
			}
		%>
		<h1 style="font-family: sans-serif;">Login</h1>
		<table cellspacing="10" cellpadding="10">
			<form action="login" method="post">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" required></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Login">
				</tr>
		</table>
		</form>
	</div>
</body>
</html>