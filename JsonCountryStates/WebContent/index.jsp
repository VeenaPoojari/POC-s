<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert and Display Record 9lessons.info</title>
<script type="text/javascript" src='js/jquery.min.js'></script>
<script type='text/javascript'>
	$(document).ready(
			function() {
				$.ajax({
					type : "GET",
					url : "getStates",
					dataType : "json",
					success : function(data) {
						if (data.Messages.length) {
							$.each(data.Messages, function(i, data) {
								var msg_data = "<div  id='msg"+data.stateId+"'>"
										+ data.stateName + "</div>";
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
	<div id='content'></div>
</body>
</html>
