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
<!-- 如果被判断的变量teaprocess为空则返回主页面 -->
<c:if test="${empty teaprocess}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	<!-- 输出从数据库得到的值 -->
	加工编号: ${teaprocess.ID}
	<br />产品名称:${teaprocess.NAME}
	<br />生产编号:${teaprocess.PRODUCE_ID}
	<br />加工类型:${teaprocess.PROCESS_TYPE}
	<br />加工时间:${teaprocess.PROCESS_TIME}
	<br />加工车间:${teaprocess.PROCESS_WORKSHOP}
	<br />加工温度:${teaprocess.PROCESS_TEMP}
	<br />加工操作方式:${teaprocess.PROCESS_MODE}
	<br />
</body>
</html>