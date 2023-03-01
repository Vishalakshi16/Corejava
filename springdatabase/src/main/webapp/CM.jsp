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
<title>Xworkz</title>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
     </a>
     
     
     <a href="index.jsp">Home</a>
     
     
  </div>

  </nav>

  
  <h1>WelCome to CM  Details</h1>
  <form action="cm" method="post">
  <pre>
  
  CMName <input type="text" name="name">
  
   Party <select name="party">
   <option>Select</option>
   <option>BJP</option>
   <option>JDS</option>
   <option>AAP</option>
   <option>Congress</option>
   <option>KJP</option>
   
   </select>
   
    State <select name="state">
    <option>select</option>
    <option>Karnataka</option>
    <option>AP</option>
    <option>TN</option>
    <option>WB</option>
    <option>MH</option>
    <option>UP</option>
    <option>Tripura</option>
    <option>Manipura</option>
    
    </select>
    
    
    
    Tenure <select name="tenure">
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
    
    PortFolio <textarea rows="3" cols="50" name="portfolio"></textarea>
    
    
   <input type="submit" value="save"/ class="btn btn-primary">
   
  </pre>
  
  
  </form>
  
  
  


</body>
</html>