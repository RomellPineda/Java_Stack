<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
        <title>Display Date</title>
        <link rel="stylesheet" type="text/css" href="css/boot.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
</head>
<body>
	<div class="jumbotron text-center">
        <h1>Ola Mundo!</h1>
    </div>
    <div class="container">
    	<div class="col-sm-6 col-md-6 col-lg-6">
    		<a href="/date"><button class="btn btn-primary btn-lg btn-block">Date Template</button></a>
    	</div>
    	<div class="col-sm-6 col-md-6 col-lg-6"> 
        	<a href="/time"><button class="btn btn-danger btn-lg btn-block">Time Template</button></a>
    	</div>
	</div>
</body>
</html>

<%-- <c:out value="${2+2}"/>
<c:out value="${dojoName}"/> --%>