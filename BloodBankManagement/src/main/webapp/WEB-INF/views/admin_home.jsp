<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles/admin_home-style.css">
<script
	src="${pageContext.request.contextPath}/resources/scripts/admin_home.js"></script>
</head>
<body>
	<header>
		<h1>Hello Admin</h1>
	</header>
			<table border="1"
				class="table table-bordered table-striped table-hover">
				<tr>
					<th>Donar Id</th>
					<th>Donar FirstName</th>
				    <th>Donar LastName</th>
				    <th>Donar BloodGroup</th>
					<th>Donar City</th>
				</tr>
			</table>
			<table border="1"
				class="table table-bordered table-striped table-hover">
				<tr>
					<th>Patient Id</th>
					<th>Patient Name</th>
				    <th>Patient BloodGroup</th>
				    <th>Patient City</th>
				    <th>Doctor Name</th>
				    <th>Hospital Name</th>
				    <th>Hospital Address</th>
				    <th>Contact Name</th>
				    <th>Contact Email</th>
				    <th>Patient Message</th>
				    
					
				</tr>
			</table>
</body>
</html>