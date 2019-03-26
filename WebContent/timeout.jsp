<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% response.setHeader("refresh","3;URL=query.jsp"); %>
<% response.setHeader("Access-Control-Allow-Origin", "*");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询超时</title>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

	<style>
		.tit{color:#fd801c;font-size:32px;text-align:center;}
		.time{background:url(/rk/enroll/asset/image/public/maintain.png); width:132px;height:121px;margin:50px auto;padding: 45px 179px 30px 119px;font-size:14px; color:#339df6;text-align:right;}
		.time font{display: block;font-family: 'Arial Regular';font-size:28px;color:#fd801c;text-align:center;}
		.notice{width:500px;margin:30px auto;}
		.notice p{color:#565656;font-size:16px;}
		.n2{text-indent:32px; }
		.notice .n3{font-size:24px;text-align: right;}
	</style>

</head>
<body>

	<p class="tit">超时错误</p>
	
	<div class="notice">
	<p class="n1">尊敬的用户：</p>
    <p class="n2">您的查询已经超时, <font color="red">请重新扫描二维码, </font>如有带来不便 ，敬请谅解！</p>
</div>
</body>
</html>