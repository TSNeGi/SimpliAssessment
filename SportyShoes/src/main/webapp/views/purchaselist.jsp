<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Purchase List</title>
<link href="style.css" rel="stylesheet" type="text/css" />

</head>
<body>
	
		<form id="right" action="filteredPurchaseListDate" method="get">
		<h1>SportyShoes</h1>
		<h5 align="right"><a href="/adminhome">Back to home</a></h5>
			<input type="date" name="date" placeholder="(DD-MM-YYYY)" required="required">
			<input type="submit" value="Filter">
		</form>
		<form id="right" action="filteredPurchaseListCategory">
			<select
				name="product_category" id="class">
				<option value="Select">Select Category</option>
				<option value="Cricket">Cricket</option>
				<option value="BaseBall">BaseBall</option>
				<option value="Football">Football</option>
				<option value="Tennis">Tennis</option>
				<option value="Running">Running</option>
				
			</select>
			<input type="submit" value="Filter">
		</form>
	<form>
	<table>

		<tr>
			<th>Purchase ID</th>
			<th>Product Name / Id</th>
			<th>Product Category</th>
			<th>Purchase Date</th>
			<th>Purchase Amount</th>
			<th>Purchased by </th>
		</tr>

		<c:forEach var="purchase" items="${purchases}">

			<tr>
				<td>${purchase.purchase_id}</td>
				<td>${purchase.purchase_name}</td>
				<td>${purchase.purchase_category}</td>
				<td>${purchase.purchase_date}</td>
				<td>${purchase.purchase_price}</td>
				<td>${purchase.purchase_user}</td>
			</tr>

		</c:forEach>

	</table>
	</form>
</body>
</html>