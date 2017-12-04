<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<script type="text/javascript">
	function validateForm() {
		if (document.login.email.value == "") {
		     document.getElementById('errors-user').innerHTML="*Please enter a valid Email ID*";
		     return false;
		}
		if (document.login.password.value == "") {
		     document.getElementById('errors-pass').innerHTML="*Please enter a valid Password*";
		     return false;
		}
	}
</script>
<body>
	<form:form name="login" modelAttribute="login" action="my" method="POST" onsubmit="return validateForm();">
		<table style="text-align: center;">

			<div id ="errors-user"></div>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email"
						type="email" /></td>
			</tr>
			<div id ="errors-pass"></div>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:input path="password" name="password" id="password"
						type="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"/></td>
			</tr>
		</table>
	</form:form>
	<div id ="errors"></div>
	<span style="color: red;">${message}</span>
</body>
</html>