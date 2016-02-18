<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table cellspacing="10">
			<form action="mail">
				<tr>
					<td>From:</td>
					<td><input type="text" name="from" required/></td>
				</tr>
				<tr>
					<td>To:</td>
					<td><input type="text" name="to" required/></td>
				</tr>
				<tr>
					<td>Subject:</td>
					<td><input type="text" name="subject" required></td>
				</tr>
				<tr>
					<td>Text:</td>
					<td><textarea rows="10" cols="70" name="msg" required></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="send" /></td>
				</tr>
			</form>
		</table>
	</div>
</body>
</html>