<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
 <html>
 	<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Change password</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>

      <form action="cpass" method ="POST">
      
        <h1>SportyShoes</h1>

        <fieldset>
        <legend>Enter Password</legend>
         <input type="text" name="opassword" placeholder="Enter your Password to verify">
          <legend>Change Password</legend>
         <input type="text" name="cpassword" placeholder="Enter new Password">
          
          
       </fieldset>
         <button type="submit">Change</button>
         
     </form>
    </body>
</html>