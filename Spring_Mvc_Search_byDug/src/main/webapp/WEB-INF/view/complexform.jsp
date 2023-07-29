<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">



<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">
	<h1>Hello, world!</h1>



	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">

							<form:errors path="studentEntity.*" />
						</div>
						<form action="handleform" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name</label>
								<input name="name" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your name with anyone else.</div>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" name="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share
									your email with anyone else.</div>
							</div>


							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">D.O.B</label>
								<input type="text" name="dob" class="form-control"
									id="exampleInputEmail1" placeholder="dd/mm/yyyy"
									aria-describedby="emailHelp">
							</div>


							<div class="form-group">
								<lable for="exampleFormControlSelect1">Select Course</lable>
								<select name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Django</option>
									<option>Spring framewok</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check from-check-inline">

									<input class="form-check-input" type="radio" name="gender"
										id="flexRadioDefault1" value="male"> <label
										class="form-check-label" for="flexRadioDefault1"> Male
									</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="flexRadioDefault2" value="female"> <label
										class="form-check-label" for="flexRadioDefault2">
										Female </label>
								</div>

								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="flexRadioDefault2" value="other"> <label
										class="form-check-label" for="flexRadioDefault2">
										other </label>
								</div>
							</div>

							<div class="form-group">
								<lable for="">Select Type</lable>
								<select class="form-control" name="type">
									<option>Old Student</option>
									<option>New Student</option>
								</select>
							</div>
							<div class="card">
								<div class="card-body">
									<p>your address</p>

									<div class="form-group">
										<input type="text" name="address.street" class="form-control"
											placeholder="Enter street" />
									</div>


									<div class="form-group">
										<input type="text" name="address.city" class="form-control"
											placeholder="Enter city" />
									</div>

								</div>
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Check me out</label>
							</div>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
