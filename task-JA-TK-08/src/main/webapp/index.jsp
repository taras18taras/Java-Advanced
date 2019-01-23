<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="EN">
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/login.css">
<jsp:include page="css/bootstrapCss.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="register-form">
				<input class="firstName" type="text" placeholder="first name" /> <input
					class="lastName" type="text" placeholder="last name" /> <input
					class="email" type="text" placeholder="email address" /> <input
					class="password" type="password" placeholder="password" /> <input
					class="cpassword" type="password" placeholder="confirm password" />
				<button class="register">create</button>
				<p class="message">
					Already registered? <a href="#">Sign In</a>
				</p>
			</form>
			<form class="login-form">
				<input class="email" type="text" placeholder="email address" /> <input
					class="password" type="password" placeholder="password" />
				<button class="login">login</button>
				<p class="message">
					Not registered? <a href="#">Create an account</a>
				</p>
			</form>
		</div>
		<div class="alert alert-success alert-dismissible" role="alert">
			<b>Success!</b> You are registered.
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">&times;</button>
		</div>
	</div>
	<jsp:include page="js/bootstrapJS.jsp"></jsp:include>
	<script src="js/login.js"></script>
</body>
</html>