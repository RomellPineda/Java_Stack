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
		<h2>Be advised this is test for bootstrap css operational status</h2>
		<form action="/send" method="post">
			<div class="form-group">
				Your Name: <input class="form-control" type="text" name="name"
					value="">
			</div>
			<div class="form-group">
				Dojo Location: <select class="form-control" name="location"
					placeholder="select">
					<option selected disabled>Please select</option>
					<option value="Chicago">Chicago</option>
					<option value="Dallas">Dallas</option>
					<option value="Los Angeles">Los Angeles</option>
					<option value="Seattle">Seattle</option>
				</select>
			</div>
			<div class="form-group">
				Favorite Language: <select class="form-control" name="language">
					<option selected disabled>Please select</option>
					<option value="Javascript">Javascript</option>
					<option value="Python">Python</option>
					<option value="Java">Java</option>
					<option value="Ruby">Ruby</option>
					<option value="PHP">PHP</option>
				</select>
			</div>
			<div class="form-group">
				<p>Comment (optional)</p>
				<textarea class="form-control" name="comment" value=""></textarea>
			</div>
			<input class="btn btn-info btn-lg btn-block" type="submIt" value="Submit"
				style="float: right">
		</form>
	</div>
</body>
</html>