<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="utf-8">
		<meta name="keywords" content="Traceability" />
		<meta name="description" content="Traceability" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name='apple-touch-fullscreen' content='yes'>
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="format-detection" content="telephone=no">
		<meta name="format-detection" content="address=no">

		<link href="css/bootstrap.min.css" rel="stylesheet">

		<style type="text/css">
			header {
				height: 36px;
				line-height: 1rem;
				background: linear-gradient(to right, #61bb19 15%, #d6e2ad 100%);
				position: fixed;
				top: 0;
				left: 0;
				width: 100%;
				z-index: 99;
			}
			
			header p {
				font-family: "微软雅黑";
				font-weight: 800;
				color: #fff;
				margin-left: 40%;
				margin-top: 12px;
			}
			
			.active img {
				position: relative;
				width: 100%;
				height: auto;
				margin-top: 20px;
			}
			
			.a1 img {
				float: left;
				margin-top: 9px;
				margin-left: 3px;
				width: 16px;
			}
			
			
			#container {
				background-color: #f0f0f0;
				width: 100%;
				height: 390px;
				margin-top: 30px;
			}
			
			.product-information {
				position: relative;
				left: 0px;
				width: 100%;
				background-color: white;
			}
			
			.items {
				position: absolute;
				border-radius: 3px;
				margin-left: 3%;
				margin-right: 50%;
				background-color: white;
				width: 94%;
				height: 260px;
			}
			
			.item {
				font-size: 16px;
				font-family: "微软雅黑";
				font-weight: 600;
			}
			
			.item-tag {
				float: left;
				width: 28%;
				margin-right: 5%;
				text-align: right;
				margin-top: 20px;
				color: gray;
			}
			
			.item-info {
				float: left;
				width: 55%;
				border-radius: 15px;
				background: rgba(50, 205, 50, 0.7);
				color: #fff;
				padding: 5px;
				margin-top: 15px;
				text-align: center;
			}
		</style>

		<title></title>
	</head>

	<body>
		<header>
			<div class="a1">
				<a href="trace.jsp"><img src="img/arrow.png" /></a>
			</div>

			<div class="top-sch-box flex-col logoIcon">
				<p>
					茶树溯源信息
				</p>
			</div>
		</header>
		
		<c:forEach var="list" items="${pestlist}">

			<div id="container">
			<div class="product-information">
			<h2 style="color: #61bb19;position: relative;text-align:center;font-size:26px;font-family: '微软雅黑';font-weight:500;padding-top: 20px;">—记录@${list.FARM_TIME}—</h2>
			<hr>
			<div class="items">
				<div class="item">
					<div class="item-tag"> 农药名称</div>
					<div class="item-info"> ${list.PESTI_NAME} </div>
				</div>
				<div class="item">
					<div class="item-tag"> 农药成分</div>
					<div class="item-info"> ${list.PESTI_CONTENT}</div>
				</div>
				<div class="item">
					<div class="item-tag"> 用量</div>
					<div class="item-info"> ${list.PESTI_AMOUNT} </div>
				</div>
				<div class="item">
					<div class="item-tag"> 使用时间</div>
					<div class="item-info"> ${list.FARM_TIME} </div>
				</div>
				<div class="item">
					<div class="item-tag"> 操作人</div>
					<div class="item-info"> ${list.NAME}  </div>
				</div>
			</div>
		</div>
		</div>
			
		</c:forEach>
	</body>
</html>



