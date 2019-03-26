
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>智慧茶叶溯源平台</title>
</head>
<body>
<c:if test="${empty blockenv}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	   茶园编号：${blockenv.ID}
	<br /> 茶园名称：${blockenv.BLOCK_NAME}
	<br /> 记录时间:${blockenv.ENV_TIME}
	<br /> 土壤温度：${blockenv.SOIL_TEMP}
	<br /> 土壤湿度：${blockenv.SOIL_HUMIDITY}
	<br /> 空气温度:${blockenv.ENV_TEMP}
	<br /> 空气湿度 :${blockenv.ENV_HUMIDITY}
	<br /> 日降水量:${blockenv.ENV_RAINFALL}
	
	<br />
</body>
</html>