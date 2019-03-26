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

	<c:if test="${empty teaproduct}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	
	产品名称：${teaproduct.TEA_TYPE_NAME}
	<br /> 产品追溯码：${teaproduct.PRODUCT_QR_CODE}
	<br /> 生产地址：${teaproduct.PRODUCE_ORIGIN}
	<br /> 生产时间：${teaproduct.PRODUCE_START_TIME}
	<br /> 净含量:${teaproduct.PRODUCT_WEIGHT}
	<br /> 茶叶简介:${teaproduct.TEA_INFO}
	<br /> 冲泡方法:${teaproduct.TEA_BREW_INFO}
	<br />
	
	<br />
	<a href="trace.jsp">溯源</a>
	
	<br />
	<a href="SearchTeaInspect">质检信息</a>
	
	
</body>
</html>