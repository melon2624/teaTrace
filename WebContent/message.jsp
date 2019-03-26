<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% response.setHeader("refresh","3;URL=query.jsp"); %>
<% response.setHeader("Access-Control-Allow-Origin", "*");%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>智慧茶叶溯源平台-${sessionScope.messageTitle}</title>
</head>
<body>
	${messageContext}
	<br>
	即将返回首页...
</body>
</html>