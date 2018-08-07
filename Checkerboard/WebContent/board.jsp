<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checkerboard</title>
</head>
<body>
	<div class="container">
	<% int width=0; int height=0;
	if(request.getParameter("width") != null){
	width = Integer.parseInt(request.getParameter("width"));	
	}
	if(request.getParameter("height") != null){
	height = Integer.parseInt(request.getParameter("height"));
	} %>
	<table style='border-collapse: collapse'>
	<% for(int i = 0; i < height / 2; i++) { %>
		<tr class='one' style='height: 50px'>
		<% for(int j = 0; j < width / 2; j++) { %>
		<td style='width: 50px; background-color: blue'></td>
		<td style='width: 50px; background-color: black'></td>
		<% } %>
		</tr>
		<tr class='two' style='height: 50px'>
		<% for(int z = 0; z < width / 2; z++) { %>
		<td style='width: 50px; background-color: black'></td>
		<td style='width: 50px; background-color: blue'></td>
		<% } %>
		</tr>
	<% } %>
	</table>
	
    </div>
</body>
</html>