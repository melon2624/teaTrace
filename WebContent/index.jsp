<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<%@page import="com.teasystem.entity.TeaProduct"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- 如果没有传入二维码处理 -->
<c:if test="${empty teaproduct}">
	<%
		//从session中取历史记录
		TeaProduct teaproduct=(TeaProduct)session.getAttribute("teaproduct");
	
		if(teaproduct==null)
		{
			//session有没有直接报错
			//response.sendError(403);
			request.setAttribute("messageTitle", "错误");
			request.setAttribute("messageContext", "请重新扫描或者输入溯源码!");
			request.getRequestDispatcher("message.jsp").forward(request, response);			
		}
		
	%>
	</c:if>
	
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
		<link rel="stylesheet" type="text/css" href="css/product.css" />
		<link rel="stylesheet" type="text/css" href="css/swiper.min.css" />

		<title>溯源</title>

		<style>
			* {
				margin: 0;
				padding: 0;
				text-decoration: none;
			}
			
			.swiper-container img {
				width: 100%;
				height: auto;
			}
			
			#interaction {
				margin-top: 12px;
			}
		</style>
	</head>

	<body>
		<header>

			<div class="top-sch-box flex-col logoIcon">
				<p>
					茶叶产品信息
				</p>
			</div>
		</header>

		<div id="container">
			<div class="swiper-container swiper-container1">
				<div class="swiper-wrapper">
					<div class="swiper-slide"><img src="img/1.png" /></div>
					<div class="swiper-slide"><img src="img/2.png" /></div>
					<div class="swiper-slide"><img src="img/3.png" /></div>
				</div>
				<!-- 如果需要分页器 -->
				<div class="swiper-pagination"></div>

				<!--如果需要导航按钮-->
				<!--<div class="swiper-button-prev"></div>-->
				<!--<div class="swiper-button-next"></div>

			<!-- 如果需要滚动条 -->
				<!--<div class="swiper-scrollbar"></div>-->
			</div>
			
			<div class="product-information">
				<h2 style="color: #61bb19;position: relative;text-align:center;font-size:26px;font-family: '微软雅黑';font-weight:500;padding-top: 15px;background-color: white;height: 60px;">—产品信息—</h2>
				<div class="items">
					<div class="item">
						<div class="item-tag"> 产品名称 </div>
						<div class="item-info"> ${teaproduct.TEA_TYPE_NAME} </div>
					</div>
					<div class="item">
						<div class="item-tag"> 溯源码</div>
						<div class="item-info"> ${teaproduct.PRODUCT_QR_CODE}</div>
					</div>
					<div class="item">
						<div class="item-tag"> 原产地</div>
						<div class="item-info"> ${teaproduct.PRODUCE_ORIGIN} </div>
					</div>
					<div class="item">
						<div class="item-tag"> 生产时间</div>
						<div class="item-info"> ${teaproduct.PRODUCE_START_TIME} </div>
					</div>
					<div class="item">
						<div class="item-tag">净含量</div>
						<div class="item-info"> ${teaproduct.PRODUCT_WEIGHT}</div>
					</div>
				</div>

				
				
				<div class="items-2">
					<h3 style="font-size: 18px;font-family: '微软雅黑';padding-left: 17px;color: gray;">茶叶简介</h3>
					<hr>
					<div id="version">
						<p>${teaproduct.TEA_INFO}</p>
					</div>
					<div id="interaction">
						<a href="soil.html" style="margin-right: 6%;float: right;color: gray;"><img src="img/prise.png" /></a>
						<a href="soil.html" style="margin-right: 6%;float: right;color: gray;"><img src="img/star.png" /></a>
					</div>
				</div>
				
				<div class="items-3">
					<h3 style="font-size: 18px;font-family: '微软雅黑';padding-left: 17px;color: gray;">冲泡方式</h3>
					<hr>
					<div id="version">
						<p>${teaproduct.TEA_BREW_INFO}</p>
					</div>
					<div id="interaction">
						<a href="soil.html" style="margin-right: 6%;float: right;color: gray;"><img src="img/点赞.png" /></a>
						<a href="soil.html" style="margin-right: 6%;float: right;color: gray;"><img src="img/星星.png" /></a>
					</div>
				</div>
				
			</div>
			
		</div>
		
		<hr />

		<nav>
			<a href="index.jsp" style="text-decoration: none;color: #61bb19;">
				<img src="img/tea_2.png" /></br>
				产品信息
			</a>
			<a href="trace.jsp" style="text-decoration: none;">
				<img src="img/product_02.png" /></br>
				追根溯源
			</a>
			<a href="SearchTeaInspect" style="text-decoration: none;">
				<img src="img/verify_02.png" /></br>
				质检结果
			</a>
			<a href="TeaPurchase.html" style="text-decoration: none;">
				<img src="img/product_02.png" /></br>
				购买链接
			</a>
		</nav>

		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/swiper.min.js"></script>

		<script>
			var mySwiper = new Swiper('.swiper-container.swiper-container1', {
				direction: 'horizontal',
				loop: true,
				autoplay: true, //等同于以下设置

				// 如果需要分页器
				pagination: {
					el: '.swiper-pagination',
				},

				// 如果需要前进后退按钮
				navigation: {
					nextEl: '.swiper-button-next',
					prevEl: '.swiper-button-prev',
				},
			})
		</script>
		<script type="text/javascript">
			var mySwiper2 = new Swiper('.swiper-container.swiper-container2', {
				direction: 'horizontal',
	//			autoplay: true, //等同于以下设置

				scrollbar: {
					el: '.swiper-scrollbar',
				},
			});
		</script>

	</body>

</html>