<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous">
</script>
</head>
<body>
	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-line-block align-text-top">
			</a> <a href="index"> Home </a>
		</div>
	</nav>

	<h1>Welcome to River data saving..</h1>
	<c:forEach items="${errors}" var="e">
	<span style="color:red;">${e.message}</span>
	</c:forEach>
	
	<form action="river" method="post">
		<pre>
	Name<input type="text" name="name"/>
	Birthplace <input type="text" name="birthplace"/>
	NoOfSubRivers<select name="noOfSubRivers">
	<option value="${dto.noOfSubRivers}">SELECT</option>
	<c:forEach items="${noOfSubRivers}" var="p">
	<option value="${p}">${p}</option>
	</c:forEach>
	</select>
	Location<select name="location">
	<option value="${dto.location}">SELECT</option>
	<c:forEach items="${location}" var="g">
	<option value="${g}">${g}</option>
	</c:forEach>
	</select>
	<input type="submit" value="Save">
	</pre>
	</form>
</body>
</html>