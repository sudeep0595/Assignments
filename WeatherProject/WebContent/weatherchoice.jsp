
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WEATHER CHOICE</title>
<style >
.form {
 

  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}</style>
 <link rel="stylesheet" href="weatherchoicecss.css"></link> 
</head>
<body>
      <h1>CHOOSE THE WEATHER STATUS</h1>
	<div class="form">
       <c:url var="myAction" value="checkWeather.obj"/>
       <form:form action="${myAction}" method="get" modelAttribute="city">
  		<form:select path="weather">
  		<form:option value="Rainy">Rainy</form:option>
  		<form:option value="Cloudy">Cloudy</form:option>
  		<form:option value="Clear">Clear</form:option>
  		<form:option value="Hot">Hot</form:option>
  		<form:option value="Cold">Cold</form:option>
  		</form:select>
 		<br><br><button>FIND CITIES</button>

  </form:form> 
  </div>

</body>
</html>

<!-- MyController -->
<!--  @ModelAttribute("weatherList")
	 public List<String> getWeather() {

			List<String> weatherlist = new ArrayList<String>();
			weatherlist.add("Rainy");
			weatherlist.add("Cloudy");
			weatherlist.add("Clear");
			weatherlist.add("Hot");
			weatherlist.add("Cold");
			return weatherlist;

		}
		
		 @RequestMapping(value="/checkWeather")
	 public String checkWeather(@ModelAttribute(value="login") Login login,
			           Model model) {
		 System.out.println("checking weather");
		 model.addAttribute("weather", login.getWeather());    
		 // code with service/dao/jpa layers
		 return "weatherchoice";
		 
		----LOGIN
		 private String weather;
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	 } -->