<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello,i will show you your login details</h1>
<h2>user : ${param.user}</h2>     <!-- return the value which i create name by jsp -->
<h2>password : ${mypass} </h2>  <!-- which i made by model -->
</body>
</html>