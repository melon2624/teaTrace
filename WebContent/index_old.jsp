<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>智慧茶叶溯源平台查询后台</title>
</head>

<body>
	-------------------------------------------------------
	欢迎使用本平台
	-------------------------------------------------------
	<br/>
	查询茶叶产品信息：
	<form action="SearchTeaProduct" method="post">
		<p>
			产品追溯码: <input type="text" name="qrcode" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------	
	<br/>
	查询茶叶质量检测信息（输入其一即可）：
	<form action="SearchTeaInspect" method="post">
		<p>
			产品追溯码: <input type="text" name="qrcode" />
		</p>
		<p>
			生产批次编号: <input type="text" name="produceid" />
		</p>		
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------
	<br/>
	查询茶园环境检测信息：
	<form action="SearchBlockEnv" method="post">
		<p>
			茶园编号: <input type="text" name="blockid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------	
	<br/>
	查询茶叶加工信息：
	<form action="SearchTeaProcess" method="post">
		<p>
			生产批次编号: <input type="text" name="produceid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------
	<br/>
	查询茶叶生产批次信息：
	<form action="SearchTeaProduce" method="post">
		<p>
			生产批次编号: <input type="text" name="produceid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------	
	<br/>
	查询茶树基本信息：
	<form action="SearchTree" method="post">
		<p>
			茶树编码: <input type="text" name="treeid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------
	<br/>
	查询茶树种植信息：
	<form action="SearchTreePlant" method="post">
		<p>
			农事活动编号: <input type="text" name="farmid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>	
	-------------------------------------------------------
	<br/>
	查询茶树施肥信息：
	<form action="SearchTreeFertilize" method="post">
		<p>
			农事活动编号: <input type="text" name="farmid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>	
	-------------------------------------------------------
	<br/>
	查询茶树打药信息：
	<form action="SearchTreePesticide" method="post">
		<p>
			农事活动编号: <input type="text" name="farmid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>
	-------------------------------------------------------
	<br/>
	查询茶树采摘信息：
	<form action="SearchTreePick" method="post">
		<p>
			农事活动编号: <input type="text" name="farmid" />
		</p>
		<input type="submit" value="提交查询" />
	</form>	
	<br/>
	
	当前查询的溯源码:<%
		String qrcode=(String)session.getAttribute("qrcode");
		out.print(qrcode);
	%>
	
	<br/>
	当前查询的茶叶的批次:<%
		String produceid=(String)session.getAttribute("produceid");
		out.print(produceid);
	%>
	
	<br/>
	当前查询的茶叶的茶树:<%
		String treeid=(String)session.getAttribute("treeid");
		out.print(treeid);
	%>
	
	<br/>
	
</body>
</html>