<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FlyAway Book Ticket</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<form action="FlightServlet" method="POST">

		<h1>Fly with FlyAway</h1>
		 <h5 align="right"><a href="login.jsp">Admin Login</a></h5>

		<fieldset>
			<legend>Book Ticket</legend>
			<label for="from">Source</label>
			<input type="text" name="source" placeholder="Enter Source" required>
			
			<label for="to">Destination</label>
			<input type="text" name="destination" placeholder="Enter Destination" required> 
			
			<label for="date">Date of travel</label> 
			<input type="date" name="date" required>
			
			<label for="no_person">Number of person</label>
			<input type="number" name="no_person" value='1' min="1" max="5">
			

		</fieldset>
		<button type="submit">Search</button>
	</form>
</body>
</html>