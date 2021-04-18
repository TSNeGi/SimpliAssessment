<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
 	<head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin Home page</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>

      <form >
      
        <h1>SportyShoes</h1>

        <fieldset>
          <legend>Hello Admin,</legend>
          </fieldset>
     </form>
     
     <div>
		<form action="productList" method="get">
			<button type="submit">Manage Products</button>
		</form>
		<form action="userList" method="get">
			<button type="submit">Signed Up Users</button>
		</form>
		<form action="purchaselist" method="get">
			<button type="submit">Purchase Reports</button>
		</form>
		<form action="cpass" method="post">
			<button type="submit">Change Password</button>
		</form>
		
	</div>
     
  		      
     
    </body>
</html>