<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>territory</title>
<style>
body {
	background-image: url(back2.gif);
	background-size: cover;
}

.center {
	margin: auto;
	width: 100%;
	padding-top: 0px;
}
img {
    opacity: 1.0;
    transition: opacity 1s ease-in-out;
    -moz-transition: opacity 1s ease-in-out;
    -webkit-transition: opacity 1s ease-in-out;
}
#left_banner:hover {
    opacity: 0.3;
    transition: opacity .55s ease-in-out;
    -moz-transition: opacity .55s ease-in-out;
    -webkit-transition: opacity .55s ease-in-out;
}
#right_banner:hover {
    opacity: 0.3;
    transition: opacity .55s ease-in-out;
    -moz-transition: opacity .55s ease-in-out;
    -webkit-transition: opacity .55s ease-in-out;
}
.bottom-left {
    position: absolute;
    bottom: 10%;
    left: 10%;
}
.top-right {
    position: absolute;
    bottom: 10%;
    right: 5%;
}
</style>
</head>
<body>
	<marquee scrollamount="30">
		<h1 style="font-family:courier;color:white;font-size:300%;">CHOOSE ONE OF THE FOLLOWING IMAGES FOR OPTIONS</h1>
	</marquee>
	<div class="center">
		<div style="width: 100%; height: 400px;">
			<a href="weatherform.obj"> <img id="left_banner" src="citymain.gif"
				alt="Norway" title="SELECT CITY TO GIVE WEATHER REPORT"
				style="float: left; width: 35%; height: 100%; object-fit: cover; border-radius: 50%" hspace="150">
				<div class="bottom-left"><h3 style="font-family:courier;color:white;font-size:150%;"><b>SELECT CITY TO GIVE WEATHER REPORT</b></h3></div>
			</a>
			&nbsp; &nbsp;
			<a href="weatherchoice.obj"> <img id="right_banner" src="weather4.gif"
				alt="Paris" title="SELECT WEATHER TO GIVE CITIES REPORT"
				style="float: left; width: 35%; height: 100%;  border-radius: 50%">
				<div class="top-right"><h3 style="font-family:courier;color:white;font-size:150%;"><b>SELECT WEATHER TO GIVE CITIES REPORT</b></h3></div>
			</a>
		</div>
	</div>
</body>
</html>