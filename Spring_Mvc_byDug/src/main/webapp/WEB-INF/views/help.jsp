<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

<%
/*
String name=(String)request.getAttribute("name");
Integer rollno=(Integer)request.getAttribute("rollno");

LocalDateTime time=(LocalDateTime) request.getAttribute("time"); */
%>
<%--  
<h1>Hello My name is <%=name %></h1>
<h1>My roll number is<%=rollno %></h1>

<h1>this is my time <%=time.toString %></h1> --%>

<h1>Hello My name is ${name }</h1>
<h1>my roll no is ${rollno }</h1>
<h1>this is my time ${time}</h1>
<hr>

<c:forEach var="item" items="${marks }">
<h1>${item  }</h1>
</c:forEach>

<h1>this is help page</h1>
<h1>we are learing spring framework</h1>
</body>
</html>