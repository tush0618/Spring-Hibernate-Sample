<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<form:form modelAttribute="product" action="product/add"
		method="POST">
		<table style="text-align: center;">

			
			<tr>
				<td><form:label path="productId">Product ID</form:label></td>
				<td><form:input path="productId" name="productId" id="productId" /></td>
			</tr>
			<tr>
				<td><form:label path="productName">Product Name</form:label></td>
				<td><form:input path="productName" name="productName" id="productName" />
				</td>
			</tr>
			<tr>
				<td><form:label path="vnfId">VNF ID</form:label></td>
				<td><form:input path="vnfId" name="vnfId" id="vnfId" /></td>
			</tr>
			<tr>
				<td><form:label path="vnfName">VNF Name</form:label></td>
				<td><form:input path="vnfName" name="vnfName" id="vnfName" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Product" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>