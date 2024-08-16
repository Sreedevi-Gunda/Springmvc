<%@page import="java.util.List"%>
<%@page import="com.jsp.spring_mvc_1.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="./CSS/home.css">

</head>
<body>
	<h1>Home</h1>
	<p style = "text-align:center">Welcome User...</p>
	
	<% List<User> user= (List<User>)request.getAttribute("user"); %>
	<%-- user --%>
	
	<div id = "div1">
	<table border  = "2px" solid = "green" style = color:green cellpadding = "10">
	<tr>
	<th>Id</th>
	<th>FName</th>
	<th>LName</th>
	<th> Email</th>
	<th>Password</th>
	<th>Phone</th>
	<th>Age</th>
	<th>Gender</th>
	<th>Update</th>
	<th>Delete</th>
	
	
	</tr>
 
	<% for(User u1: user){ %>
	<tr>
	<td><%= u1.getId() %></td>
	<td><%= u1.getFName() %></td>
	<td><%= u1.getLName() %></td>
	<td><%= u1.getEmail() %></td>
	<td><%= u1.getPwd() %></td>
	<td><%= u1.getPhone() %></td>
	<td><%= u1.getAge() %></td>
	<td><%= u1.getGender() %></td>
	<td><button id = "btn1">
 	 
 	  <a href="update?id=<%= u1.getId() %>">Update </a>
 	 </button>
 	  </td>
 	 <td>  
 	 <button id = "btn2">
 	 <a href="delete?id=<%= u1.getId() %>">Delete </a>
 	 </button>  
 	 </td>
 	
 	</tr>
 
<%} %>

</table>
	</div>
	
	
	
		
			

	
	
	
	
	
	 
	
	
</body>
</html>
