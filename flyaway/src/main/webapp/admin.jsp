<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
 	<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin Login</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>

      <form action= "ListPlaces" method="post">
      
        <h1>Admin | FlyAway</h1>

        <fieldset>
          <legend>Options Available</legend>
          
          <button type="submit" >List of Places </button>
          </fieldset>
     </form>
     
     <form action= "ListAirlines" method="post">
     <button type="submit">List of Airlines</button>
     </form>
     
     
     <form action= "ListFlights" method="post">
     <button type="submit">List of Flights</button>
     </form>
     
      <form action= "cpass.jsp" method="post">
     <button type="submit">Change Password</button>
     </form>
    </body>
</html>