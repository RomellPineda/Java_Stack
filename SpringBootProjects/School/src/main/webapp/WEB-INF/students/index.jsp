<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School</title>
<link rel="stylesheet" type="text/css" href="css/boot.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Welcome to Fighter Weapon School</h1>
	</div>
	<div class="container">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Lucky Number</th>
					<th scope="col">Instructor</th>
					<th scope="col">Course</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><c:out value="${student.firstName}" /></td>
						<td><c:out value="${student.lastName}" /></td>
						<td><c:out value="${student.luckyNumber}" /></td>
						<td><c:out value="${student.instructor.firstName}${student.instructor.lastName}" /></td>
						<td><a href="course/${student.instructor.id}"><c:out value="${student.instructor.subject}" /></a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<div class="col-sm-10 col-md-6 col-lg-6">
			<a href="/students/new"><button
					class="btn btn-primary btn-lg btn-block">Register</button></a>
		</div>
		<div class="col-sm-10 col-md-6 col-lg-6">
			<a href="/students/new"><button class="btn btn-danger btn-lg btn-block">Fire</button></a>
		</div>


	</div>
</body>
</html>