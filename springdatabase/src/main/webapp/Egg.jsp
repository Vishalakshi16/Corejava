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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
     </a>
     
     
     <a href="index.jsp">Egg</a>
     
     
  </div>

  </nav>

  
  <h1>WelCome to WebApplication  Details</h1>
  <form action="egg" method="post">
  <pre>
  
  HotelName <input type="text" name="hotelName">
  
   Egg Dish Name <select name="dishName">
   <option>Select</option>
   <option>Omlet</option>
   <option>Egg-Rice</option>
   <option>Half-Boil</option>
   <option>Egg Burge</option>
   <option>Egg Puff</option>
   <option>Egg Masal</option>
   <option>Egg bond</option>
   <option>Egg chilli</option>
   <option>Egg Maggie</option>
   </select>
   
    Egg Type <select name="type">
    <option>select</option>
    <option>Nati</option>
    <option>Farm</option>
    <option>Boiler</option>
    <option>Duck</option>
    </select>
    
    Price <input type="text" name="price">
    
    Quantity <select name="quantity">
    <option>select</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
    <option>5</option>
    <option>6</option>
    <option>7</option>
    <option>10</option>
    </select>
    Take Away Yes:<input type="radio" value="true" name="takeAway"/>
                  No:<input type="radio" value="false" name="takeAway"/>
    
   <input type="submit" value="save"/>
   
  </pre>
  
  
  </form>
  
  
  


</body>
</html>