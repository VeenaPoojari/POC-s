<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>hide demo</title>
  <script src="js/jquery-1.10.2.js"></script>
</head>
<body>
 
<p>Hello</p>
<a href="#">Click to hide me too</a>
<p>Here is another paragraph</p>
 
<script>
$( "p" ).hide();
$( "a" ).click(function( event ) {
  event.preventDefault();
  $( this ).hide();
});
</script>
 
</body>
</html>