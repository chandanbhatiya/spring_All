<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>file uploaded result </title>
</head>
<body>
<h1>${msg }</h1>
<img alt="profile file" src="<c:url value=" resourses/image/${filename }" />" />
</body>
</html>