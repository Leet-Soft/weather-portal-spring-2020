<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Something went wrong</title>
</head>
<body>

<% String errorMessage = request.getAttribute("error").toString(); %>

<h1 style="color:red"><%= errorMessage %> </h1>

</body>
</html>