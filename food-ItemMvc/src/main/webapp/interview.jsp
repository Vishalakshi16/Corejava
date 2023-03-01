<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">

<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>

</head>
<body style = 'color : red'>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
     </a>
     
     <a href = "index.jsp"> Home </a>
  </div>
  </nav>
  
  <h1> Page to send Interview details..</h1>
  <form action = "attend" method = "Post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label"> Name </label>
    <input type="text" class="form-control" name = "name"
    id="exampleInputEmail1" placeholder = "enter name">
    </div>
  
  <div>
  
     <select class = "form-select" aria-lable = "Default select example" name = "company">
        <option selected > Select company name </option>
        <option value = "Trigyn"> Trigyn </option>
        <option value = "Nimesa" > Nimesa </option>
        <option value = "SmartIMS"> SmartIMS </option>
      </select>
 </div>
 
 
    <div class="mb-3">
       <label for="exampleInputEmail1" class="form-label"> Role </label>
        <input type="text" class="form-control" name = "role"
         id="exampleInputEmail1" placeholder = "enter role">
    </div>
    
    <div>
    <input type = "submit" value = "Send" class = "btn btn-dark">   
    
    </div>

  </form>

</body>
</html>