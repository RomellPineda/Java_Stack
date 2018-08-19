<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<h2>New Student</h2>
		<form:form action="/new" method="post" modelAttribute="student">
			<p>
				<form:label path="firstName">First Name:</form:label>
				<form:errors path="firstName" />
				<form:input path="firstName" />
			</p>
			<p>
				<form:label path="lastName">Last Name:</form:label>
				<form:errors path="lastName" />
				<form:input path="lastName" />
			</p>
			<p>
				<form:label path="luckyNumber">Lucky Number:</form:label>
				<form:errors path="luckyNumber" />
				<form:input path="luckyNumber" />
			</p>
			<form:label path="instructor">Instructor:</form:label>
			<form:select path="instructor">
				<c:forEach items="${instructors}" var="instructor">
					<option value="${instructor.id}"><c:out
							value="${instructor.firstName}${instructor.lastName}" /></option>
				</c:forEach>
			</form:select>

			<input type="submit" value="Submit" />
		</form:form>
	</div>

</body>
</html>