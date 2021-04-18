<!DOCTYPE html>
<html>
<head>
	 <title>Update Product | SportyShoes</title>
       <link href="views/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form action="productAdd" method="post">
		<h1>SportyShoes</h1>
		<h5 align="right"><a href="/adminhome">Back to home</a></h5>
		<fieldset>
			<legend>Update Product</legend>
			<input type="number" value="${product.product_id}" placeholder="Enter Product ID"
				name="productId" readonly>

			<input type="text" value="${product.product_name}" placeholder="Enter Product Name"
				name="productName" readonly>
		
			<input type="text" value="${product.product_price}"
				placeholder="Enter Product Price" name="productPrice" required min=1>
			
			<select 
				name="product_category" id="class">
				<option value="Select">Select Category</option>
				<option value="Cricket">Cricket</option>
				<option value="BaseBall">BaseBall</option>
				<option value="Football">Football</option>
				<option value="Tennis">Tennis</option>
				<option value="Running">Running</option>
				
			</select>
			<button type="submit">Update Product</button>
		</fieldset>
	</form>

</body>
</html>