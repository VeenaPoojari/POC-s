<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
	function getCity(id) {
		alert(id.value);
		var request;
		if (window.XMLHttpRequest) {
			request = new XMLHttpRequest();
		}

		var URL = "state?role=" + id.value;
		request.open("GET", URL, true);
		request.send();
		request.onreadystatechange = function() {
			if (request.readyState == 4 && request.status == 200) {
				document.getElementById("StateName").innerHTML = request.responseText;
			}
		}
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<div align="center">
		Choose country: <select name="country"
			onchange="javascript:getCity(this);" id="cityList">
			<option value="">Select</option>
			<option value="1">India</option>
			<option value="2">US</option>
		</select>
	</div>
	<br>
	<div align="center">
		<div>
			Select State: <select id="StateName">
				<option value="">Select</option>
			</select>
		</div>
	</div>

</body>
</html>