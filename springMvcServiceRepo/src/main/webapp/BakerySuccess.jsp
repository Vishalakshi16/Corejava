<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xworkz</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">

<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
 </a>
 </div>
 </nav>
 
 <h1> Bakery Saved , details..</h1>
 <h3> Name : ${Name} </h3>
 <h3> OwnerName : ${getOwnerName}</h3>
 <h3> WifeName : ${getOwnerWifeName} </h3>
 <h3> MarriedOrNot : ${getMarried}</h3>
 <h3> FamousFor : ${getFamous}</h3>
 <h3> Since : ${getSince} </h3>

</body>
</html>