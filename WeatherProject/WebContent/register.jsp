<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
<link rel="stylesheet" href="style.css">
<script>
	$('.message a').click(function() {
		$('form').animate({
			height : "toggle",
			opacity : "toggle"
		}, "slow");
	});
</script>


</head>
<body>
	<c:url var="myAction" value="newUser.obj"></c:url>
	<div class="login-page">
		<h1>Welcome</h1>
		<div class="form">
			<form:form id="myform" action="${myAction}" method="post" modelAttribute="wuser">
				<b>Name</b>       <form:input path="name" required="required" /><br>
				<b>Login ID</b>   <form:input path="login" /><br>
				<b>Password</b>   <form:input path="password" required="required" type="password" />
				<!--  <b>Retype Password</b> <input required="required" type="password" value="password1"> -->
				<button>create</button>
				<p class="message">
					Already registered? <a href="showForm.obj">Sign In</a>
				</p>
			</form:form>
		</div>
	</div>

</body>
</html>