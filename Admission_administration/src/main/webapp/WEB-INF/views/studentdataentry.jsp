<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>

.devil{
text-align:center;
color:"87CEEB";
background-color:white;
font-size:100px;
}

.sau{
text-align:center;
font-size:50px;
color:green;
}

.sic{
text-align:center;
font-size:30px;
}

</style>

<meta charset="ISO-8859-1">
<title>Student insertion</title>
</head>
<body bgcolor="87CEEB">
<p><div class = "devil"> Student Insertion </div></p>




<center>
<form action = "/dataServlet.do" method = "post">
<p><class div = "sic"> Student ID<input type = "text" name = "stuid"></div></p>
<br>
<p><class div = "sic">Name<input type = "text" name = "name"></div></p>
<br>
<p><class div = "sic">Mobile No. <input type = "text" name = "mobile"></div></p>
<br>
<p><class div = "sic">Department Id <input type = "text" name = "dept"></div></p>
<br>
<p><class div = "sic">Username <input type = "text" name = "user"></div></p>
<br>
<p><class div = "sic">Password <input type = "text" name = "pass"></div></p>
<br>
<p><input type="hidden" name="role" value="studentData"></p>
<class div = "sic"><input type="submit" value="submit"></div>

</form>




</center>
</body>
</html>