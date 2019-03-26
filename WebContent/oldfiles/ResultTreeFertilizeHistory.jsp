<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>施肥记录</title>
</head>
<body>

	<c:forEach var="list" items="${fertlist}">
		<br>
		施肥编号:${list.ID}
		<br>
		肥料名称:${list.FERT_NAME}
		<br>
		肥料成分${list.FERT_CONTENT}
		<br>
		用量:${list.FERT_AMOUNT}
		<br>
	</c:forEach>
	
</body>
</html>