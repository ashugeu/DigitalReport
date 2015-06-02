<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
	</head>
	<body>
		<div class='form animated flipInX'>
		  <h2>Login To Your Account</h2>
		  <form action='loginValidate.htm' method='post'>
		    <input placeholder='Username' type='text' name='email'>
		    <input placeholder='Password' type='password' name='pass'>
		    <button class='animated infinite pulse'>Login</button>
		  </form>
		</div>
	</body>
</html>