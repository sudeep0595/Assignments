<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Weather Form</title>
<!-- <script src="js/jquery.min.js">
</script>
<script type="text/javascript">
  $(document).ready(function () {
     $('#countryname').change(function(){
       var country=$('#countryname option:selected').val();
       //alert(${pageContext.request.contextPath});
       alert(country);
       $.ajax({
             type:"POST",
              headers:{
               Accept:"application/json; charset=utf-8",
               "Content-Type": "application/json; charset=utf-8"},
            data:{id:countryname},
            url:'${pageContext.request.contextPath}/fetchCity.obj',
            success:function(result){
            	alert(result);
              var s='';
              for(var i=0;i<result.length;i++)
               {
                s+='<option value="'+result[i].getCi_id()+'">"+result[i].getCi_name()+"</option>';
                }
                $('#cityname').html(s);
              },
              error: function(){
            	  alert("error");
              }
             });
          });
   });
 </script> -->
<link rel="stylesheet" href="style.css">
<style>
.center {
	margin: auto;
	width: 100%;
	padding-top: 125px;
}
</style>
</head>
<body>
	<c:url var="myAction" value="selectCity.obj" />
	<div class="login-page">
	<div class="center">
	<div class="form">
		<h1><b>Select Country</b></h1>
		<form:form action="${myAction}" method="get" modelAttribute="country">
        <form:select path="co_id"  >
        <c:forEach items="${countryList}" var="country">
        <form:option value="${country.co_id}">${country.co_name}
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
	
	 <%-- <select>
				<c:forEach var="countryList" items="${countryList}">
				<option value="${countryList.co_id}" name="">${countryList.co_name}
				</option>
				</c:forEach>
				<form:options items="${countryList.co_name}">${countryList.co_name}</form:options>
		<select><br><br> --%>
	
</body>
</html>