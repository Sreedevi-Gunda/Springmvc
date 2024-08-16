<%@page import="com.jsp.spring_mvc_1.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<%User u=(User)request.getAttribute("user"); %>
<form action="update1" method="get">
<label>Enter the id:</label>
	<input type="number" name="id"  value="<%= u.getId()%>"placeholder="Enter your Id">
    <br> 	
	<br>
  	<label>Enter your first name:</label>
   <input type="text" name="name"  value="<%= u.getFName()%>"placeholder="Enter your firstname">
   <br> 	
   <br>
   <label>Enter your last name:</label>
    <input type="text" name="name"  value="<%= u.getLName()%>"placeholder="Enter your lastname">
   <br> 	
  <br>
  <label>Enter your email :</label>
  <input type="text" name="email" value="<%= u.getEmail() %>" placeholder="Enter your email">
  <br> 	
  <br>
  <label>Enter your Password:</label>
  <input type="text" name="password" value="<%= u.getPwd() %>" placeholder="Enter your password">
  <br> 	
  <br>
  <label>Enter your gender:</label>
   <input type="text" name="gender"  value="<%= u.getGender()%>"placeholder="Enter your gender">
   <br> 	
   <label>Enter your phone Number :</label>
  <input type="number" name="phone" value="<%= u.getPhone()%>" placeholder="Enter your phone number">
  <br> 	
  <label>Enter your age:</label>
  <input type="number" name="age" value="<%= u.getAge() %> placeholder="Enter your age">
  <br> 	
  <br>
  <button> Edit</button>

</form>

</body>
</html>