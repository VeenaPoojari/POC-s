<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="fn">
		<table cellspacing="10">
			<tr>
				<td>first name : </td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>last name : </td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>email : </td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>password : </td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>