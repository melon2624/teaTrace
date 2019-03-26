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
	<c:if test="${empty treepick}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	
	采摘人员：${treepick.NAME}
	
	<br /> 茶树编号：${treepick.TREE_ID}
	<br /> 农事种类:${treepick.FARM_TYPE}
	<br /> 农事时间：${treepick.FARM_TIME}
	<br /> 农事操作方式：${treepick.FARM_MODE}
	<br /> 农事活动备注:${treepick.FARM_REMARK}
	<br /> 茶树年龄:${treepick.PICK_TREE_AGE}
	<br /> 重量:${treepick.PICK_WEIGHT}
	<br /> 采摘部位:${treepick.PICK_PART}
	<br /> 采摘方法:${treepick.PICK_STANDARD}
	<br />
</body>
</html>