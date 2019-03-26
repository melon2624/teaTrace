<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>智慧茶叶溯源平台</title>
</head>
<body>

	<c:if test="${empty teaInspectBean}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	
	<br /> 茶叶等级:${teaInspectBean.INSPECT_LEVEL}
	<br /> 农药含量：${teaInspectBean.INSPECT_PESTICIDE_CONTENT}
	<br /> 检验时间：${teaInspectBean.INSPECT_TIME}
	<br /> 检验员:${teaInspectBean.NAME}
	<br /> 检验评语:${teaInspectBean.INSPECT_COMMENT}
	<br />
</body>
</html>