<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.0.min.js" />" ></script>
		
		<meta charset="utf-8">
		<title>Sample03View</title>
	</head> 
	<body>
		<input type="button" id="ajax_btn" value="Ajax通信テスト" />
		<table border=1>
			<tr>
				<th>No</th>
				<th>Name</th>
			</tr>
			<c:forEach varStatus="us" var="data" items="${sample03DataList.dataList}">
				<tr>
					<td><form:input type="hidden" path="dataList[${us.index}].id"/>${data.id}</td>
					<td><form:input type="hidden" path="dataList[${us.index}].name"/>${data.name}</td>
				</tr>
			</c:forEach>
		</table>
<script type="text/javascript">
$(function() {
    // Ajax通信テスト ボタンクリック
    $("#ajax_btn").click(function() {
        $.ajax({
            type        : "GET",
            url         : "Sample03Rest",
            dataType    : "json",
            success     : function(data) {
                            success(data);
                        },
            error       : function(XMLHttpRequest, textStatus, errorThrown) {
                            error(XMLHttpRequest, textStatus, errorThrown);
                        }
        });
    });
});
 
// Ajax通信成功時処理
function success(data) {
    alert("success:" + data);
}
 
// Ajax通信失敗時処理
function error(XMLHttpRequest, textStatus, errorThrown) {
    alert("error:" + XMLHttpRequest);
    alert("status:" + textStatus);
    alert("errorThrown:" + errorThrown);
}
</script>
	</body>
</html>