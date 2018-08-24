<%@ page isErrorPage="true" %>    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>School</title>
</head>
<body>
	<h1>Edit Instructor</h1>
<form:form action="/update/${instructor.id}" method="post" modelAttribute="instructor">
    <input type="hidden" name="_method" value="put">
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
        <form:label path="Subject">Subject:</form:label>
        <form:errors path="Subject"/>
        <form:input path="Subject"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>