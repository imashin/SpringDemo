<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>LoginView</title>
	</head> 
	<body>
		<div>
			<!--
			Controller側で @ModelAttribute の引数を省略した場合、型の先頭を小文字にした文字列が設定される。
			つまり、@ModelAttribute("loginForm")が指定されていることになる。
			なので、View側で指定する値も先頭を小文字にした文字列を設定する。
			 -->
	        <form:form modelAttribute="loginForm">
	        	<form:input path="username" /><br/>
	        	<form:input path="passwd" /><br/>
	            <input type="submit" value="登録">
	        </form:form>
		</div>
	</body>
</html>
	