<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>Sample03View</title>
		
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.0.min.js" />" ></script>
		
<script type="text/javascript">
$(function() {
    // Ajax通信テスト ボタンクリック
    $("#ajax_btn").click(function() {
    	var keyword_value = $("#keyword_text").val();
        $.ajax({
            type        : "POST",
            url         : "Sample03",
            dataType    : "json",
            data		: { keyword : keyword_value },
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
	</head> 
	<body>
		<input type="text" id="keyword_text" />
		<input type="button" id="ajax_btn" value="Ajax通信テスト" />
	</body>
</html>