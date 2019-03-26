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
	<c:if test="${empty teaproduce}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	生产编号：${teaproduce.ID}
	<br /> 姓名：${teaproduce.NAME}
	<br /> 生产阶段:${teaproduce.PRODUCE_IN_PROCESS}
	<br /> 生产开始时间：${teaproduce.PRODUCE_START_TIME}
	<br /> 生产产地：${teaproduce.PRODUCE_ORIGIN}
	<br /> 生产种类:${teaproduce.PRODUCE_TYPE}
	<br /> 生产等级:${teaproduce.PRODUCE_LEVEL}
	<br /> 生产备注:${teaproduce.PRODUCE_REMARK}
	<br /> 茶树编号:${teaproduce.TREE_ID}
	<br />
</body>
</html>