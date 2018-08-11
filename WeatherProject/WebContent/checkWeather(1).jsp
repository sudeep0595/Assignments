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
	<h2><b><u>CITIES </b></u> </h2>
	<c:forEach items="${cityList}" var="cy">
    <h4>${cy.ci_name}</h4>
	</c:forEach>
    <p class="message">Go back to choices? <a href="display.jsp">Click here</a></p>
</div>
</div>
</body>
</html>