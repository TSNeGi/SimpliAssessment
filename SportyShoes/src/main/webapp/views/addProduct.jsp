<!DOCTYPE html>
<html>
<head>
	<link href="style.css" rel="stylesheet" type="text/css" />
	<title>Add Product</title>
</head>
<body>

	<form action="productAdd" method="post">
	
		<div class="form">
			<h1>SportyShoes</h1>
			<h5 align="right"><a href="/adminhome">Back to home</a></h5>
			<fieldset>
          		<legend>Add product,</legend>
			<input type="text" placeholder="Enter Product Name"
				name="product_name" required>
			<br />
		
			
			<input type="number"
				placeholder="Enter Product Price" name="product_price" required min=1>
			<br />

			<select
				name="product_category" id="class">
				<option value="Select">Select Category</option>
				<option value="Cricket">Cricket</option>
				<option value="BaseBall">BaseBall</option>
				<option value="Football">Football</option>
				<option value="Tennis">Tennis</option>
				<option value="Running">Running</option>
				
			</select>
			<br/>
			<button type="submit">Add Product</button>
			</fieldset>
		</div>
	</form>

</body>
</html>