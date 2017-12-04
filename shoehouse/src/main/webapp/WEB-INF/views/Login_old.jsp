<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Login</title>

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/w3.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/bootstrap.css"/>">
<link href="https://fonts.googleapis.com/css?family=Belgrano"
	rel="stylesheet">
</head>
<body>
	<div class="header row">
		<div class="logo col-md-1">
			<img alt="Image not available" src="<c:url value="/resources/images/shoelogo.jpg"/>"
				width="95px" height="90px">
		</div>
		<div class="name-quote col-md-3">
			<h1>ShoeHouse.com</h1>
			<h5>Good shoes take you good places</h5>
		</	div>
	</div>


	<!-- 	Login form starts here -->
	<div class="row">
		<div class="login-container">
			<div class="login-box">
				<div class="login-title">
					<h2>Login to ShoeHouse</h2>
				</div>
				<p class="login-button-info-text login-info-text login-divide">EASILY
					USING</p>
				<div class="social-login-container">
					<a href="www.facebook.com" title="Facebook"> <img
						class="login-fb-logo" alt="fb"
						src="<c:url value="/resources/images/social-media/facebook-login.png"/>"/>
					</a> <a href="www.gmail.com" title="Google"> <img
						class="login-gplus-logo" alt="fb"
						src="<c:url value="/resources/images/social-media/google-login.png"/>"/></a>
				</div>
				<p class="login-divide-text">-OR-</p>
				<form:form class="login-form" modelAttribute="login"
					action="my/profile" method="POST">
					<fieldset class="login-input-container">
						<div class="login-input-item">
							<form:input path="email" type="email"
								class="login-user-input-email login-user-input" name="email"
								placeholder="Email" />
						</div>
						<div class="login-input-item">
							<form:input path="password" type="password"
								class="login-user-input-password login-user-input"
								name="password" placeholder="Password" />
						</div>
					</fieldset>
					<fieldset class="login-button-container">
						<input type="submit" class="login-button" value="Login" />
					</fieldset>
				</form:form>
				<div class="forgot-register-container">
					<a class="forgot-password" href="">Forgot Password</a>
					<div class="register-link">
						<span class="login-button-info-text">New to ShoeHouse?</span> <a
							class="create-account" href="">Create Account</a>
					</div>
				</div>
			</div>
		</div>

	</div>

	<hr width="100%" style="padding-top: 30px;">

	<!-- 		Footer starts here -->
	<div class="footer row">
		<div class="col-md-3 ">
			<div class="footer-first-col">
				<h4>Useful Links</h4>
			</div>
			<div class="footer-first-col">
				<ul>
					<li>Contact Us</li>
					<li>FAQ's</li>
					<li>Terms and Conditions</li>
					<li>Cancellation</li>
					<li>Shipping</li>
					<li>Returns</li>
				</ul>
			</div>
		</div>

		<!-- 			Mobile Store starts here -->
		<div class="col-md-5">
			<div class="row">
				<div class="footer-second-col"
					style="padding-bottom: 0px; color: #697071; text-align: center;">
					<h4 style="padding-bottom: 0px; padding-left: 10px;">Experience
						ShoeHouse App on Mobile</h4>
				</div>
				<div style="display: flex; padding: 5px;">
					<div style="padding: 5px;">
						<img class="img-responsive" alt="Image not Available"
							src="<c:url value="/resources/images/footer-android.png"/>"
							style="width: 150px; height: 45px;">
					</div>
					<div style="padding: 5px;">
						<img class="img-responsive" alt="Image not Available"
							src="<c:url value="/resources/images/footer-applestore.png"/>"
							style="width: 150px; height: 45px;">
					</div>
					<div style="padding: 5px;">
						<img class="img-responsive" alt="Image not Available"
							src="<c:url value="/resources/images/footer-windowstore.png"/>"
							style="width: 170px; height: 45px;">
					</div>
				</div>
			</div>
			<div class="row" style="padding-top: 30px; text-align: center;">
				<div class="footer-second-col">
					<h4>Follow us on Social Media</h4>
				</div>
				<img class="social" alt="Image not available"
					src="<c:url value="/resources/images/social-media/facebook.png"/>"/> <img
					class="social" alt="Image not available"
					src="<c:url value="/resources/images/social-media/twitter.png"/>"/> <img class="social"
					alt="Image not available"
					src="<c:url value="/resources/images/social-media/instagram.png"/>"/> <img
					class="social" alt="Image not available"
					src="<c:url value="/resources/images/social-media/linkedin.png"/>"/> <img
					class="social" alt="Image not available"
					src="<c:url value="/resources/images/social-media/youtube.png"/>"/> <img class="social"
					alt="Image not available"
					src="<c:url value="/resources/images/social-media/google-plus.png"/>"/>
			</div>
		</div>

		<!-- 				Features starts here -->
		<div class="col-md-4">
			<div style="display: flex; padding-bottom: 20px;">
				<img class="img-responsive" alt="Image not Available"
					src="<c:url value="/resources/images/footer-original.jpg"/>"
					style="width: 70px; height: 70px;"/>
				<p class="footer-third-col">100% ORIGINAL guarantee for all
					products</p>
			</div>
			<div style="display: flex; padding-bottom: 15px;">
				<img class="img-responsive" alt="Image not Available"
					src="<c:url value="/resources/images/30days.png"/>" style="width: 70px; height: 70px;">
				<p class="footer-third-col">Free returns for 30 Days after
					receiving your order</p>
			</div>
			<div style="display: flex; padding-bottom: 20px;">
				<img class="img-responsive" alt="Image not Available"
					src="<c:url value="/resources/images/free.png"/>" style="width: 70px; height: 70px;">
				<p class="footer-third-col">Free delivery for all orders</p>
			</div>

		</div>
	</div>
	<hr>
	<div class="row"
		style="text-align: right; padding-right: 30px; color: #697071;">
		<p>© 2016 www.ShoeHouse.com. All rights reserved.</p>
	</div>
</body>
</html>