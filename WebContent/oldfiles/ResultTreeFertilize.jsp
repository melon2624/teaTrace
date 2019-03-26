
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
	<c:if test="${empty treefertilize}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	农事活动编号：${treefertilize.ID}
	<br /> 茶树编号：${treefertilize.TREE_ID}
	<br /> 农事种类:${treefertilize.FARM_TYPE}
	<br /> 农事时间：${treefertilize.FARM_TIME}
	<br /> 操作方式：${treefertilize.FARM_MODE}
	<br /> 农事活动备注:${treefertilize.FARM_REMARK}
	<br /> 肥料名称:${treefertilize.FERT_NAME}
	<br /> 肥料成分:${treefertilize.FERT_CONTENT}
	<br /> 肥料用量:${treefertilize.FERT_AMOUNT}
	<br /> 施肥方法:${treefertilize.FERT_METHOD}
	<br />

</body>
</html>