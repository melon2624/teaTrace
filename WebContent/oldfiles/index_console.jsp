<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
	当前查询的茶叶的树的施肥记录:<%
	if(session.getAttribute("fertids")!=null)
	{
		@SuppressWarnings("unchecked")
		List<Integer>fertids=(List<Integer>)session.getAttribute("fertids");
	
		for(int i=0;i<fertids.size();i++)
		{
			out.print(fertids.get(i)+" ");
		}
	}
	%>
	
	<br/>
	当前查询的茶叶的树的农药使用记录:<%
	if(session.getAttribute("pestids")!=null)
	{
		@SuppressWarnings("unchecked")
		List<Integer>pestids=(List<Integer>)session.getAttribute("pestids");
	
		for(int i=0;i<pestids.size();i++)
		{
			out.print(pestids.get(i)+" ");
		}
	}
	%>
	
</body>
</html>