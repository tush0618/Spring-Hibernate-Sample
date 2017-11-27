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
				<td><form:label path="fname">First Name</form:label></td>
				<td><form:input path="fname" name="fname" id="fname" /></td>
			</tr>
			<tr>
				<td><form:label path="lname">Last Name</form:label></td>
				<td><form:input path="lname" name="lname" id="lname" /></td>
			</tr>
			<tr>
				<td><form:label path="userid">User ID</form:label></td>
				<td><form:input path="userid" name="userid" id="userid" /></td>
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
				<td><form:input path="password" name="password" id="password" />
				</td>
			</tr>
			<tr>
				<td><form:label path="cpassword">Confirm Password</form:label>
				</td>
				<td><form:input path="cpassword" name="cpassword"
						id="cpassword" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="CREATE AN ACCOUNT" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>