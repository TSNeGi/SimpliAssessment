<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <title>User's List | SportyShoes</title>
       <link href="views/style.css" rel="stylesheet" type="text/css" />
</head>


<body>
<form action="filteredUserList">  
        <h1>SportyShoes</h1>
        <h5 align="right"><a href="/adminhome">Back to home</a></h5>
         <fieldset>
          <legend>User's List</legend>
 </fieldset>
 
		<input type="text" placeholder="Type to search" name="like" required>
		<button>Search User</button>
	</form>
	

	<form id="right" action="/userList" method="get">
	<button>Show Complete list</button>
	<table>

		<tr>
			<th>User's ID</th>
			<th>Username</th>
			<th>Mail id</th>
			<th>Contact</th>

		</tr>

		<c:forEach var="users" items="${users}">

			<tr>
				<td>${users.user_id}</td>
				<td>${users.username}</td>
				<td>${users.email}</td>
				<td>${users.contact}</td>
			</tr>

		</c:forEach>

	</table>
	</form>
</body>
</html>






