<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" cellspacing="10">
<% 
	int i=1; 

	int j=1;
%>
<% while(i<=5){ %>
<tr>
	<% while(j<=4){ %>
		<td>Hello i=  <%= i %> , j= <%= j %></td>
	<% j++; 
	}
	j=1;%>
	i=<%= i %>
</tr>
<% i++; 
}%>
</table>

</body>
</html>