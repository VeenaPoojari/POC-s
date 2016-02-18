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

<table cellspacing="10">
<th>Roll no.</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<s:iterator value="studentList">

<tr>
<td><s:property value="rollno"/></td>
<td><s:property value="studName"/> <s:property value="lname"/></td>
<td><s:property value="uname"/></td>
<td><s:property value="pass"/></td>
<td><a href="EditStud.action?rollno=<s:property value="rollno"/>">Edit</a></td>
<td><a href="DeleteStud.action?rollno=<s:property value="rollno"/>" onclick="return del()">Delete</a></td>
</tr>
</s:iterator>
</table>
</div>
</body>
</html>