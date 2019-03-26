<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<%@page import="com.teasystem.entity.TeaProduct"%>

<!DOCTYPE html>
<html lang="zh-CN">

	<%
		
	%>

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

		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>产品</title>

		<!-- Bootstrap -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/inspect.css" />
		<link rel="stylesheet" type="text/css" href="css/swiper.min.css" />

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>
		<header>

			<div class="top-sch-box flex-col logoIcon">
				<p>
					茶叶质量检测信息
				</p>
			</div>
		</header>

		<div class="refreshtip">下拉刷新</div>

		<div class="swiper-container">
			<form class="form-horizontal" id="items-3" style="margin-top: 48px;">
				<h2 style="color: #61bb19;position: relative;left: 50%;font-size:26px;font-family: '微软雅黑';font-weight:500">—质量认证—</h2>
				<div class="form-group" style="margin-top: 23px;">
					<label for="inputEmail3" class="col-xs-4 control-label" style="font-family: '微软雅黑';color: gray;	text-align: right;margin-top: 6px;font-size: 15px;">茶叶等级</label>
					<div class="col-xs-6">
						<input type="text" class="form-control" value="${teaInspectBean.INSPECT_LEVEL}" id="inputEmail3">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-xs-4 control-label" style="font-family: '微软雅黑';color: gray;	text-align: right;margin-top: 6px;font-size: 15px;">农药含量</label>
					<div class="col-xs-6">
						<input type="text" class="form-control" value="${teaInspectBean.INSPECT_PESTICIDE_CONTENT}" id="inputPassword3">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-xs-4 control-label" style="font-family: '微软雅黑';color: gray;	text-align: right;margin-top: 6px;font-size: 15px;">检验时间</label>
					<div class="col-xs-6">
						<input type="text" class="form-control" value="${teaInspectBean.INSPECT_TIME}" id="inputPassword3">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-xs-4 control-label" style="font-family: '微软雅黑';color: gray;	text-align: right;margin-top: 6px;font-size: 15px;">检验员</label>
					<div class="col-xs-6">
						<input type="text" class="form-control" value="${teaInspectBean.NAME}" id="inputPassword3">
					</div>
				</div>

			</form>

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

			<div class="comment">
				<h3 style="font-size: 16px;font-family: '微软雅黑';padding-left: 10px;color: gray;">检验评语
				</h3>
				<hr>
				<div id="version">
                        <p>${teaInspectBean.INSPECT_COMMENT}</p>             
                </div>
			</div>
						
		</div>

		</div>

		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="js/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
		<script src="js/swiper.min.js"></script>
		<!--bootstrap检测工具-->
		<script>
			(function() {
				var s = document.createElement("script");
				s.onload = function() {
					//bootlint.showLintReportForCurrentDocument([]);
				};
				s.src = "js/bootlint.min.js";
				document.body.appendChild(s);
			})();
		</script>
		<script type="text/javascript">
			var loadFlag = true;
			var oi = 0;
			var mySwiper = new Swiper('.product', {
				direction: 'vertical',
				scrollbar: '.swiper-scrollbar',
				slidesPerView: 'auto',
				mousewheelControl: true,
				freeMode: true,
				onTouchMove: function(swiper) { //手动滑动中触发
					var _viewHeight = document.getElementsByClassName('product')[0].offsetHeight;
					var _contentHeight = document.getElementsByClassName('product')[0].offsetHeight;

					if(mySwiper.translate < 50 && mySwiper.translate > 0) {
						$(".init-loading").html('下拉刷新...').show();
					} else if(mySwiper.translate > 50) {
						$(".init-loading").html('释放刷新...').show();
					}
				},
				onTouchEnd: function(swiper) {
					var _viewHeight = document.getElementsByClassName('product')[0].offsetHeight;
					var _contentHeight = document.getElementsByClassName('product')[0].offsetHeight;
					// 上拉加载
					if(mySwiper.translate <= _viewHeight - _contentHeight - 50 && mySwiper.translate < 0) {
						// console.log("已经到达底部！");

						if(loadFlag) {
							$(".loadtip").html('正在加载...');
						} else {
							$(".loadtip").html('没有更多啦！');
						}

						setTimeout(function() {
							for(var i = 0; i < 5; i++) {
								oi++;
								$(".list-group").eq(mySwiper2.activeIndex).append('<li class="list-group-item">我是加载出来的' + oi + '...</li>');
							}
							$(".loadtip").html('上拉加载更多...');
							mySwiper.update(); // 重新计算高度;
						}, 800);
					}

					// 下拉刷新
					if(mySwiper.translate >= 50) {
						$(".init-loading").html('正在刷新...').show();
						$(".loadtip").html('上拉加载更多');
						loadFlag = true;

						setTimeout(function() {
							$(".refreshtip").show(0);
							$(".init-loading").html('刷新成功！');
							setTimeout(function() {
								$(".init-loading").html('').hide();
							}, 800);
							$(".loadtip").show(0);

							//刷新操作
							mySwiper.update(); // 重新计算高度;
						}, 1000);
					} else if(mySwiper.translate >= 0 && mySwiper.translate < 50) {
						$(".init-loading").html('').hide();
					}
					return false;
				}
			});
			var mySwiper2 = new Swiper('.swiper-container2', {
				onTransitionEnd: function(swiper) {

					$('.w').css('transform', 'translate3d(0px, 0px, 0px)')
					$('.swiper-container2 .swiper-slide-active').css('height', 'auto').siblings('.swiper-slide').css('height', '0px');
					mySwiper.update();

					$('.tab a').eq(mySwiper2.activeIndex).addClass('active').siblings('a').removeClass('active');
				}

			});
			$('.tab a').click(function() {

				$(this).addClass('active').siblings('a').removeClass('active');
				mySwiper2.slideTo($(this).index(), 500, false)

				$('.w').css('transform', 'translate3d(0px, 0px, 0px)')
				$('.swiper-container2 .swiper-slide-active').css('height', 'auto').siblings('.swiper-slide').css('height', '0px');
				mySwiper.update();
			});
		</script>
	</body>

</html>