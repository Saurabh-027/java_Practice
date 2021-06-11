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
font-size:50px;
}

.sau{
text-align:center;
font-size:30px;
color:green;
}

.sic{
text-align:center;
font-size:30px;
}

</style>

<meta charset="ISO-8859-1">
<title>Teacher insertion</title>
</head>
<body bgcolor = "87CEEB">
<class div = "devil">
Insert Teaacher Data
</div>

<class div = "sic">
<form action = "/dataServlet.do" method = "post" action = "/dataServlet.do">
Teacher Name<input type = "text" name = "name">
<br>
Teacher Id <input type = " text" name = "empid">
<br>
Mobile No. <input type = "text" name = " mobile">
<br>
Department Id. <input type= "text" name = "dept">
<br>
Username <input type= "text" name = "username">
<br>
Password <input type = "text" name = "pass">
<br>
<input type="hidden" name="role" value="teacherData">
<input type="submit" value="submit">
</div>
</form>
</body>
</html>