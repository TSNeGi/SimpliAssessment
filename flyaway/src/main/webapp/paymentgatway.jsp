<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Gateway</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<% String fare=request.getParameter("fare");
String user=request.getParameter("firstName");
String contact=request.getParameter("contact");%>



	<form action="ticketconfirmed.jsp?fare="+fare; method ="post">
	<h1> Ready <% out.print(user); %> ! Pay first</h1>
    
        <fieldset>
          <legend> Ticket payment!</legend>
          
          <br>
          <label for="Card Number">Enter Card Number</label>
          <input type="text" name="card_number" placeholder="1478 xxxx xxxx xxx " required>
          
          <label for="Contact">Enter OTP send to <%out.print(contact); %></label>
          <input type="text" name="card_number" placeholder="Enter 6 digit OTP here" required>
       </fieldset>
         <button type="submit" >Pay</button>
     </form>
     
  

</body>
</html>