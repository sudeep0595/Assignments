<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="style.css">
<script>
$('.message a').click(function(){
	   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
	});
</script>
</head>
<body>
	<c:url var="myAction" value="checkLogin.obj"></c:url>
	<div class="login-page">
	<h1>Welcome User</h1>
  	<div class="form">
    <form:form class="login-form" action="${myAction}" method="post" modelAttribute="wuser">
      <b>Login ID</b>   <form:input path="login" required="required"/><br>
	  <b>Password</b> 	<form:input path="password" required="required" type="password"/>
      <button>login</button>
      <p class="message">Not registered? <a href="register.obj">Create an account</a></p>
    </form:form >
  	</div>
	</div>
</body>
</html>