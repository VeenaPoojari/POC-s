<!DOCTYPE html>
<html>
<head>
<title>Enable Disable Submit Button Using jQuery</title>
<link href="submit_disable.css" rel="stylesheet">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="submit_disable.js" type="text/javascript"></script>
</head>
<body>
<div class="container">
<div class="main">
<h2>Enable Disable Submit Button Using jQuery</h2>
<form action="" method="get">
<label>Name :</label>
<input id="name" name="name" placeholder="Ex: Albert" type="text" value="">
<label>Email :</label>
<input id="email" name="email" placeholder="Ex: albert@gmail.com" type="text" value="">
<label>Message :</label>
<textarea id="message" placeholder="Ex: Hi! Wassup"></textarea>
<input id="submit" type="submit" value="Submit">
</form>
</div>
<p><b>Note:</b> By default we have Disabled Submit Button,<br>
Please fill complete form with approprite values to enable it.</p>
</div>
</body>
</html>