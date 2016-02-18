<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>index.jsp</title>
  </head>
  
  <body>
 <table>
  <form action="login.action">
 <!--  RollNo  := <input type="text" name="student.id"> -->
 <tr><td>
  UserName:</td><td> <input type="text" name="student.uname"></td></tr>
 <tr><td>
  Password:</td><td> <input type="password" name="student.pass"></td></tr>
  <tr><td colspan="2">
  <input type="submit" value="Submit"></td></tr>
  </form>
  </table>
  <br>
  </body>
</html>
