<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
 	<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>change password</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>

      <form action="passwordServlet" method ="POST">
      
        <h1>Admin | FlyAway</h1>

        <fieldset>
          <legend>Change Password</legend>
         <input type="text" name="cpassword" placeholder="Enter new Password">
          
          
       </fieldset>
         <button type="submit">Change</button>
         <button type="button" onclick="document.location='admin.jsp'">Back to AdminPage</button>
     </form>
    </body>
</html>