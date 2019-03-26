<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Sign Up</title>
</head>
<body>
	<h1>Sign Up for Ninja Training</h1>
	<form:form action="/ninjas/new/create" method="post" modelAttribute="ninja">
	
	<form:select path="dojo">
		<c:forEach items="${allDoj}" var="d">
			<form:option value="${d.id}" label="${d.name}" />
		</c:forEach>
	</form:select>
    <p>
        <form:label path="firstName">First Name:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name:</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age:</form:label>
        <form:errors path="age"/>     
        <form:input type="number" path="age"/>
    </p>    
    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>