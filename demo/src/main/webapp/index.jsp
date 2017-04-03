<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:url value="/showMessage.jsp" var="messageUrl" />
<c:url value="/Login" var="login" />
<c:url value="/Sample01" var="sample01" />
<c:url value="/Sample02" var="sample02" />

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<!-- 
		<div>
			<a href="${login}">go login</a>
		</div>
		 -->

		<div>
			<a href="${sample01}">go sample01</a>
		</div>

		<div>
			<a href="${sample02}">go sample02</a>
		</div>
	</body>
</html>
