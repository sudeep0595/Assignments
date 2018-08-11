<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="login-page">
<div class="form">
<b>Country:</b>     ${country.co_name}<br>
<b>City:</b>     ${city1.ci_name}  <br>
<b>Temperature:</b>  ${city1.temp } Celsius		<br>
<b>Humidity:</b>	${city1.humidity } %		<br>
<b>Weather:</b>  ${city1.weather}					<br>
<p class="message">go back to Options? <a href="display.jsp">Click here</a></p>
</div>
</div>
</body>
</html>