<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
	 <title>Product Management | SportyShoes</title>
       <link href="views/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form action="addProduct">  
        <h1>SportyShoes</h1>
        <h5 align="right"><a href="/adminhome">Back to home</a></h5>
        <button>Add a Product, tab here</button>
         <fieldset>
          <legend>Product's List</legend>
          </fieldset>
	<table>

		<tr>
			<th>ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Category</th>
			<th>Action</th>
		</tr>

		<c:forEach var="product" items="${product}">

			<tr>
				<td>${product.product_id}</td>
				<td>${product.product_name}</td>
				<td>${product.product_price}</td>
				<td>${product.product_category}</td>
				<td>
					<a href="product/update/${product.product_id}">Update</a> 
					<a href="product/delete/${product.product_id}">Delete</a>
				</td>
			</tr>

		</c:forEach>

	</table>
	</form>
</body>
</html>