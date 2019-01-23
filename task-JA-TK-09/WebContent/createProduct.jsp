<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Сreate product</title>
<jsp:include page="css/bootstrapCss.jsp"></jsp:include>
<link rel="stylesheet" href="css/header.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h1>Welcome to the cabinet ${userEmail}</h1>
	<div class="container-fluid">
		<div class="row">
			<form class="createProduct">
				<div class="form-group">
					<input type="text" class="form-control productName"
						placeholder="enter product name">
				</div>
				<div class="form-group">
					<input type="text" class="form-control productDescription"
						placeholder="enter product description">
				</div>
				<div class="form-group">
					<input type="number" class="form-control productPrice"
						placeholder="enter product price">
				</div>
				<button class="btn btn-primary createProduct">Submit</button>
			</form>
		</div>
	</div>
	<jsp:include page="js/bootstrapJS.jsp"></jsp:include>
	<script src="js/header.js"></script>
	<script src="js/serverCalls.js"></script>
</body>
</html>