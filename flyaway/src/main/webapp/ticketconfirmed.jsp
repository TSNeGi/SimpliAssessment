<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Confirmation</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
 <form action="home.jsp" method="post">
	<h1> Ticket Confirmed</h1>
    
        <fieldset>
          <legend>Payment Status </legend>
          <label >Payment Id :<% out.print(Math.random()*(10001)+10000);  %>  </label>
          <h2 align="center">Payment Done Successfully!</h2>
          
          <h3 align="center">Ticket is sent to your contact number!</h3>
          
          
          <button>Book new Ticket </button>
          </fieldset>
     </form>   
</body>
</html>