<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Enter your details</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>



	<%
	String fare = request.getParameter("fare");
	Double ticket_id = Math.random() * (10001) + 10000;
	String Source = request.getParameter("source");
	String Destination = request.getParameter("destination");
	String date = request.getParameter("date");
	%>


	<form action="home.jsp" method="POST">

		<h1>Review your Ticket!</h1>
		<h4 align="left">Ticket ID : <% out.print(ticket_id);%> </h4>
		<fieldset>
			<legend>Ticket details</legend>
			<label>Source :  <%out.print(Source);%></label> 
			<label>Destination : <% out.print(Destination);%></label>
			<label>Date Of Journey : <%out.print(date);%>
			</label> <label>Amount :<%out.print(fare);%></label>
		</fieldset>
		
		<button type="submit">Edit</button>

	</form>

	<form action="paymentgatway.jsp" method="POST">

		<h1>All fine, then go Down</h1>

		<h4 align="left">Ticket ID :<%out.print(ticket_id);%></h4>
		<fieldset>
			<legend>Enter your details</legend>
			<label for="name">First Name</label> 
			<input type="text" name="firstName" placeholder="Enter First Name" required>
			<label for="name">Last Name</label> 
			<input type="text" name="lastName" placeholder="Enter Last Name" required> 
			<label for="name">Age</label>
			<input type="text" name="age" placeholder="Enter Age" required> 
			<label for="name">Contact Number</label> 
			<input type="text" name="contact"placeholder="All notification will send to this number"required>

		</fieldset>
		<button type="submit">Register & Pay <%out.print(fare);%> /-</button>

	</form>
</body>
</html>