<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Student Records</h1>

<form action="updateData.action">
<table cellspacing="10">
<s:iterator value="studentList">
<tr>
<td>Roll no.:</td>
<td><input type="text" readonly name="rollno" value="<s:property value="rollno"/>" > </td></tr>
<tr><td>First Name:</td>
<td><input type="text" name="studName" value="<s:property value="studName" />"></td></tr>
<tr><td>Last Name:</td>
<td><input type="text" name="lname" value="<s:property value="lname" />"></td></tr>
<tr><td>Username:</td>
<td><input type="text" name="uname" value="<s:property value="uname" />"></td></tr>
<tr><td>Password:</td>
<td><input type="text" name="pass" value="<s:property value="pass" />"></td></tr>
</s:iterator>
<tr><td><input type="submit" value="Update"></td></tr>
</form>
</table>
</div>
</body>
</html>