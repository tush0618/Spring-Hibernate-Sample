<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form:form modelAttribute="register" action="register/process"
		method="POST">
		<table style="text-align: center;">

			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" name="firstName" id="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" name="lastName" id="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="userId">User ID</form:label></td>
				<td><form:input path="userId" name="userId" id="userId" /></td>
			</tr>
			<tr>
				<td><form:label path="type">Type</form:label></td>
				<td><form:input path="type" name="type" id="type" /></td>
			</tr>
			<tr>
				<td><form:label path="organization">Organization</form:label></td>
				<td><form:input path="organization" name="organization"
						id="organization" /></td>
			</tr>
			<tr>
				<td><form:label path="department">Department</form:label></td>
				<td><form:input path="department" name="department"
						id="department" /></td>
			</tr>

			<tr>
				<td><form:label path="role">Role</form:label></td>
				<td><form:input path="role" name="role" id="role" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" name="password" id="password" type="password"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="confirmPassword">Confirm Password</form:label>
				</td>
				<td><form:input path="confirmPassword" name="confirmPassword"
						id="confirmPassword" type="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="CREATE AN ACCOUNT" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>