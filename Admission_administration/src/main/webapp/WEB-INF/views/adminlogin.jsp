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
<title>Admin login page</title>
</head>
<body bgcolor="87CEEB">

<div class="devil">
welcome to Attendance Management System
</div>
<p class="vic">
<p class="sau"> ADMIN LOG IN:</p>
<br>
<form action = "/loginServlet.do "method = "post">
<p class="sic">
ADMIN ID:
<input type = "text" name = "id">
<input type="hidden" name="role" value="admin">
<br>
<input type="submit" value="submit">
<br>
<a href="" target="_self">Forget Password</a>
</p>
</form>
</body>
</html>