<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>xworkz</title>
</head>
<body>
	<form action="em" method="get">
		<h1>Display Email:${email}</h1>
	
		<input type="submit"  value="send">
	</form>

	<form action="mob" method="get">
		<h1>Display MobileNo:${phNo}</h1>
		
		<input type="submit"  value="send">
	</form>
	
	<form action="aada" method="get">
		<h1>Display AadarCardNumber:${aadarNo}</h1>
		
		<input type="submit"  value="send">
	</form>

	<form action="ag" method="get">
		<h1>Display Age:${agee}</h1>
				<input type="submit"  value="send">
	</form>
	
	<form action="birth" method="get">
		<h1>Display DOB with time:${birthday}</h1>
		
		<input type="submit"  value="send">
	</form>

	<form action="sal" method="get">
		<h1>Display DesiredSalary:${salaryy}</h1>
		
		<input type="submit"  value="send">
	</form>

	<form action="frnd">
		<h1>Display List Of Best Friend Names :</h1>
		<input type="submit" value="send">
		<ul>
			<c:forEach items="${frnds}" var="item">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</form>

	<form action="visit" method="get">
		<h1>Display List Of visited places Names :</h1>

		<input type="submit" value="send">
		<ul>
			<c:forEach items="${visite}" var="item">
				<li>${item}</li>
			</c:forEach>

		</ul>
	</form>

	<form action="skills" method="get">
		<h1>Display List Of Skill :</h1>
		<input type="submit" value="send">
		<ul>
			<c:forEach items="${skill}" var="item">
				<li>${item}</li>
			</c:forEach>

		</ul>
	</form>

	<form action="bvrg">
		<h1>Display Beverage:${dto1}</h1>
		<input type="submit" value="send"> 
		<label>Beverage name:${dto1.tasty}</label> <br>
		
		<label>Beverage Color:${dto1.color}</label><br> 
		<label>Beverage price:${dto1.price}</label> <br>
		<label>Beverage Madeby:${dto1.madeby}</label><br>
		<label>Beverage Flavour:${dto1.flavour}</label><br>
		<label>Beverage buyer:${dto1.buyer}</label><br>
		<label>Beverage Name:${dto1.name}</label><br>
	</form>
	
	<form action="chaty">
		<h1>Display Chat Detailes :${dto2}</h1>
		<input type="submit" value="send"> 
		<label> Chat Name:${dto2.name} </label><br> 
		<label>Chat Type:${dto2.type}</label> <br>
		<label>Chat Price:${dto2.price}</label> <br>
		<label>Chat Quantity:${dto2.quantity}</label> <br>
		<label>Chat ranting:${dto2.ranting}</label> <br>
		
		<label>Chat tasty:${dto2.tasty}</label> <br>
		<label>Chat centerName:${dto2.centerName}</label> <br>
		<label>Chat owner:${dto2.owner}</label> <br>
		<label>Chat noOfCharts:${dto2.noOfCharts}</label> <br>
		<label>Chat ownerPh:${dto2.ownerPh}</label> <br>
		
		<label>Chat address:${dto2.address}</label> <br>
		<label>Chat id:${dto2.id}</label> <br>
		
     </form>
     
     <form action="educ">
		<h1>Display Education:${ed}</h1>
		<input type="submit" value="send"> 
		<label>Education firstName:${ed.firstName}</label><br> 
		<label>Education lastName:${ed.lastName}</label> <br>
		<label>Education qualification:${ed.qualification}</label> <br>
		<label>Education stream:${ed.stream}</label><br>
		<label>Education phNo:${ed.phNo}</label><br>
		<label>Education schoolName:${ed.schoolName}</label><br>
		<label>Education colleageName:${ed.colleageName}</label><br>
		<label>Education Address:${ed.address}</label>
		<label>Education CGP:${ed.cgp}</label>
		<label>Education Rank:${ed.rank}</label>
	</form>
	
	  <form action="phs" >
	  <h1>Display Mobile:${dto4}</h1>
		<input type="submit" value="send"> 
		<label> MobileName:${dto4.mobileName}</label> <br>
		<label>Mobile color:${dto4.color}</label> <br>
		<label>Mobile shape:${dto4.shape}</label> <br> 
		<label>Mobile version:${dto4.version}</label><br>
		<label>Mobile ram:${dto4.ram}</label> <br>
	  </form>
	  
	  
	  <form action="fdto">
	<h6>Display Family DTO: {family}</h6>
	<input type="submit" value="send">
	<label> Family fatherName: ${family.fatherName}</label> <br>
	<label> Family homeName: ${family.homeName}</label><br>
	<label> Family motherName: ${family.motherName}</label><br>
	<label> Family fatherPh: ${family.fatherPh}</label><br>
	<label> Family grandMother: ${family.grandMother}</label> <br>
	<label> Family address: ${family.addressName}</label> <br>
	<label> Family brotherName: ${family.brotherName}</label><br>
	<label> Family sisterName: ${family.sisteName}</label><br>
	<label> Family nuberOfSisters: ${family.nuberOfSister}</label><br>
	<label> Family nativePlace: ${family.nativePlace}</label> <br>
	</form>
</body>
</html>