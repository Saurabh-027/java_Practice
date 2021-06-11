<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
.dev
{
text-align:center;
color:"87CEEB";
font-size:50px;
}

.sau
{
   color: "black";
   font-size:30px;
}

.vic
{
    color: "black"
    font-text:30px;
    text-align:center;

}


</style>
<meta charset="ISO-8859-1">
<title>TeacherShow</title>
</head>
<body bgcolor="87CEEB">
<p class = "dev">Hello Teacher </p>
<p class = "sau">
<p>Username = ${username}</p>
<br>
<p>Employee ID = ${empid}</p>
</p>
<div class = "vic">
<a href="/studentdataentry" target="_new"> Student </a>
</div>
</body>
</html>