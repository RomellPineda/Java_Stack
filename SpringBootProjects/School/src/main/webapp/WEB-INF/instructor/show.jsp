<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School</title>
<link rel="stylesheet" type="text/css" href="css/boot.css">
<script type="text/javascript" src="js/app.js"></script>

</head>
<body>
<div class="jumbotron text-center">
		<h1><c:out value="${instructor.subject}"/></h1>
	</div>
<h2>Instructor</h2>
<p>First Name:<c:out value="${instructor.firstName}"/></p>
<p>Last Name:<c:out value="${instructor.lastName}"/></p>
<p>Updated on: <c:out value="${instructor.updatedAt}"/></p>
<a href="/course/${instructor.id}/edit">Edit Course</a>
<form action="/course/${instructor.id}/delete" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>