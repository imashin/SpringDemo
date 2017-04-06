<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>Sample01View</title>
	</head> 
	<body>
		<form:form modelAttribute="sample01DataList" action="Sample02" method="GET">
			<table border=1>
				<tr>
					<th>No</th>
					<th>Name</th>
				</tr>
				<c:forEach varStatus="us" var="data" items="${sample01DataList.dataList}">
					<tr>
						<td><form:input type="hidden" path="dataList[${us.index}].id"/>${data.id}</td>
						<td><form:input type="hidden" path="dataList[${us.index}].name"/>${data.name}</td>
					</tr>
				</c:forEach>
			</table>
            <input type="submit" value="登録">
		</form:form>
	</body>
</html>