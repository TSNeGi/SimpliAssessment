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

      <form action="AdminServlet" method ="POST">
      
        <h1>Admin | FlyAway</h1>

        <fieldset>
          <legend>Login here</legend>
          <label for="Username">Username</label>
          <input type="text" name="username" placeholder="Enter Username" required>
          
          <label for="password">Password</label>
         <input type="text" name="password" placeholder="Enter Password" required>
          
          
       </fieldset>
         <button type="submit">Login</button>
     </form>
    </body>
</html>