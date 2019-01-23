<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabinet</title>
<jsp:include page="css/bootstrapCss.jsp"></jsp:include>
<link rel="stylesheet" href="css/header.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container-fluid">
		<div class="row">
			<h1>Bucket of Product</h1>
			<div id="productCards"></div>
		</div>
	</div>
	<jsp:include page="js/bootstrapJS.jsp"></jsp:include>
	<script src="js/header.js"></script>
	<script src="js/bucket.js"></script>
</body>
</html>