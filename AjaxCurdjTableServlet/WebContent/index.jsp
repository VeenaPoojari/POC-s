<!DOCTYPE html>
<html>
<head>
<title>CRUD operations using jTable in J2EE</title>
<!-- jTable Metro styles. -->
<link href="css/metro/pink/jtable.css" rel="stylesheet" type="text/css" />
<link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet"
	type="text/css" />
<!-- jTable script file. -->
<script src="js/jQuery-1.8.2.js" type="text/javascript"></script>
<script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
<script src="js/jquery.jtable.js" type="text/javascript"></script>
<!-- User Defined Jtable js file -->
<!-- <script src="js/userDefieneJTableJs.js" type="text/javascript"></script> -->
<script type="text/javascript">
	$(document).ready(function() {
		$('#StudentTableContainer').jtable({
			title : 'Students List',
			actions : {
				listAction : 'Controller?action=list',
				createAction : 'Controller?action=create',
				updateAction : 'Controller?action=update',
				deleteAction : 'Controller?action=delete'
			},
			fields : {
				studentId : {
					title : 'Student Id',
					width : '5%',
					key : true,
					list : true,
					edit : false,
					create : true
				},
				name : {
					title : 'Name',
					width : '20%',
					edit : true
				},
				department : {
					title : 'Department',
					width : '20%',
					edit : true
				},
				emailId : {
					title : 'Email',
					width : '20%',
					edit : true
				},
				username : {
					title : 'Username',
					width : '20%',
					edit : true
				},
				password : {
					title : 'Password',
					type  :'password',
					width : '20%',
					edit : true
				}
			},
			
			 // Specify the validation rules
	        rules: {
	           	name : "required",
	            emailId : {
	                required: true,
	                email: true
	            },
	            username : "required",
	            password : {
	                required: true,
	                minlength: 5
	            }
	        },
	        
	        // Specify the validation error messages
	        messages: {
	            name : "Please enter your name",
	            emailId : "Please enter a valid email address",
	            username : "Please enter a valid username",
	            password : {
	                required : "Please provide a password",
	                minlength : "Your password must be at least 5 characters long"
	            }
	        }
		});
		$('#StudentTableContainer').jtable('load');
	});
</script>
</head>
<body>
	<div style="text-align: center;">
		<h4>AJAX based CRUD operations using jTable in J2ee</h4>
		<div id="StudentTableContainer"></div>
	</div>
</body>
</html>