<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
        <h1><fmt:formatDate value="${date}" pattern="EEEE, 'the' d 'of' MMMM, yyyy"/></h1>
    </div>
    <div class="container">
    	<div class="col-sm-6 col-md-6 col-lg-6">
    		<a href="/"><button class="btn btn-primary btn-lg btn-block">Home</button></a>
    	</div>
    	<div class="col-sm-6 col-md-6 col-lg-6"> 
        	<a href="/time"><button class="btn btn-info btn-lg btn-block">Time Template</button></a>
    	</div>
	</div>
</body>
</html>