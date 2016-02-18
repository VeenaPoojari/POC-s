<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File uploading</title>
</head>
<body>
	<div align="center">
		<h2>File Uploading</h2>
		<table cellspacing="20">
			<tr>
				<td>select the file:
			
			<form action="UploadServlet" method="post"
				enctype="multipart/form-data">
						<input type="file" name="file" />
						</td>
				</tr>
				<tr>
					<td><input type="submit" value="Upload"></td>
				</tr>
				<tr>
					<td><a href="viewUploadedFiles">View Files</a></td>
				</tr>
			</form>
		</table>
	</div>
</body>
</html>

<!-- <input type="file" name="file"
						accept=".txt,application/pdf" /> -->