<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link rel="stylesheet" href="<c:url value="/resouce/style.css"/>">
	<script type="text/javascript" src="<c:url value="/resource/js/script.js" />"></script>
</head>
<body style="background-color: #f0f0f0">
	<div class="text-center">
		<h1>Home page</h1>

		<a href="register" class="btn btn-sm btn-danger">register</a> <a
			href="google" class="btn btn-sm btn-danger">Go to google</a> <a
			href=" yahoo" class="btn btn-sm btn-danger">Go to yahoo</a>

		<div class="container p-5">
			<div class="row">
				<div class="col-md-8 offset-md-2">
					<div class="card">

						<div class="card-body">
							<h1>My Search Engine</h1>
							<form action="search" method="post">
								<div class="md-3">

									<input type="text" name="keybord" class="form-control"
										placeholder="Enter keybord">
									<button class="btn btn-sm btn-primary mt-3">Search
										Google</button>

								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="text-center">
		<img alt="" src="<c:url value="/resource/img/bha.jpg" />" width="200px" height="500px">
		</div>
	</div>
</body>
</html>