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
<!-- 如果被判断的变量treepesticide为空则返回主页面 -->
<c:if test="${empty treepesticide}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	<!-- 输出从数据库得到的值 -->
	农事活动编号:${treepesticide.ID}
	<br />姓名:${treepesticide.NAME}
	<br />茶树编号:${treepesticide.TREE_ID}
	<br />农事种类:${treepesticide.FARM_TYPE}
	<br />农事时间:${treepesticide.FARM_TIME}
	<br />操作方式:${treepesticide.FARM_MODE}
	<br />农事活动备注:${treepesticide.FARM_REMARK}
	<br />农药名称:${treepesticide.PESTI_NAME}
	<br />农药成分:${treepesticide.PESTI_CONTENT}
	<br />农药用量:${treepesticide.PESTI_AMOUNT}
	<br />打药方法:${treepesticide.PESTI_TYPE}
</body>
</html>