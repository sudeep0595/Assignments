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
    <c:url var="myAction" value="displayWeather.obj" />
	       <div class="login-page">
	       <div class="center">
	       <div class="form">
		   <h1><b>Select City</b></h1>
		   <form:form action="${myAction}" method="get" modelAttribute="city">
           <form:select path="ci_id"  >
           <c:forEach items="${cityList}" var="city">
           <form:option value="${city.ci_id}">${city.ci_name}
           </form:option>
		   </c:forEach>				
		   </form:select>	
		   <br><br>
		   <br>
		   <button>Select</button>
		   </form:form>
	      </div>
	</div>
	</div>



</body>
</html>