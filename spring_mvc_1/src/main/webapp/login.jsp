<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="./CSS/login.css">
</head>
<body>
 
<div id = "div1">
 <div id = "div2">  
 <p>login</p>
 <form action = "login" method = "post">
 <input type = "email" placeholder = "Enter your email" name = "email"> <br><br>
 <input type = "password" placeholder = "Enter your password" name = "pwd" ><br><br>
 <button>SUBMIT</button> <br><br><br>
 <% String s = (String)request.getAttribute("msg"); 
   if(s != null){ 
   %>
	   <h1 ><%= s %>
	   </h1>
<% } %>
 </form>
 </div> 
 </div>
</body>


</html>