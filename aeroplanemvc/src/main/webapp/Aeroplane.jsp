<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>xworkz</title>

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
     src = "https://in.images.search.yahoo.com/images/view;_ylt=AwrKC1ocTPZjSrkiwDO9HAx.;_ylu=c2VjA3NyBHNsawNpbWcEb2lkAzU2MTZlOWU4YmIzYTQwNDk2MWViNmJkMTE5NjI0ODlhBGdwb3MDMTgEaXQDYmluZw--?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fsearch%2Fimages%3Fp%3Dairoplane%26type%3DE210IN714G0%26fr%3Dmcafee%26fr2%3Dpiv-web%26tab%3Dorganic%26ri%3D18&w=2400&h=1800&imgurl=flatearthfacts.com%2Fwp-content%2Fuploads%2F2017%2F12%2FFlying-Jet-Airplane-17222294.jpeg&rurl=https%3A%2F%2Fflatearthfacts.com%2Fflat-earth-model%2Fproof-the-earth-is-flat%2Fmissing-gps-data-proves-flat-earth%2F&size=1571.6KB&p=airoplane&oid=5616e9e8bb3a404961eb6bd11962489a&fr2=piv-web&fr=mcafee&tt=Missing+GPS+Data+Proves+Flat+Earth%3F+%E2%80%93+Flat+Earth+Facts&b=0&ni=21&no=18&ts=&tab=organic&sigr=Ckq4CzmJsEdY&sigb=fYJOH7fFd8RA&sigi=UKUd0MC8DrvX&sigt=VHtcSRPE6Nmt&.crumb=/dDigYwuzBu&fr=mcafee&fr2=piv-web&type=E210IN714G0"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
 </a>
 <a href = "index.jsp"> Home </a>

 </div>
 </nav>
 
 <h1> Airoplane saved operation </h1>
 
 <form action = "air" method = "post">
 <pre> 
 Company <input type = "text" name = "company"/>
 Name <input type = "text" name = "name"/>
 Cost <input type = "text" name = "cost"/>
 Type <select name = "type">
     <option value = "${dto.type}"> SELECT </option>
     <c:forEach items = "${type}" var = "t">
     <option value = "${t}" > ${t} </option>
     </c:forEach> 
     </select>
Country <input type = "text" name = "country"/>
<input type = "submit" value = "Send"/>
</pre>
</form>
</body>
</html>