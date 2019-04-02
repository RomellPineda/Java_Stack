<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
	<h2>Create a New Product</h2>
	<p><form:errors path="productObj.*"/></p>

	<form:form action="/products" method="post" modelAttribute="productObj">
    <p>
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="description">Description: </form:label>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="price">Price: </form:label>
        <form:input type="number" min="0.0" path="price"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>