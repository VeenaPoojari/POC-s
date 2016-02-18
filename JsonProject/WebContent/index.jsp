<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(
		function(){
			alert("lll");
			$.ajax({
				type : "GET",
				url : "getStates",
				datatype : "json",
				success : function(data){
					alert("states: "+data.States);
					alert(data.States.length);
					if (data.States.length) {
						$.each(data.States, function(i, data) {
							var msg_data = "<div  id='msg"+data.msg_id+"'>"
									+ data.message + "</div>";
							$(msg_data).appendTo("#content");

						});
					} else {
						$("#content").html("No Results");
					}
				}
			});
		});
	
</script>
</head>
<body>
<h1>State List</h1>
<div id='content'></div>
</body>
</html>