<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<title>茶叶溯源查询</title>

		<!-- Bootstrap -->
		<link href="css/bootstrap.min.css" rel="stylesheet">

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
      <script src="js/html5shiv.min.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
		<style>
			* {
				margin: 0;
				padding: 0;
				box-sizing: border-box;
			}
			
			.top {
				width: 100%;
				background: rgba(0, 0, 0, 0.7);
				z-index: 2;
				color: white;
				font-family: '微软雅黑';
				text-align: center;
			}
			
			@media screen and (min-width: 640px) {
				.top {
					height: 60px;
					font-size: 26px;
					line-height: 60px;
					font-weight: 500;
					position: absolute;
				}
				.serch {
					background: rgba(0, 0, 0, 0.6);
					height: 90px;
					margin-left: 27.5%;
					margin-top: 220px;
					width: 45%;
				}
				.ser1 {
					width: 90%;
					height: 50px;
					margin-top: 20px;
					margin-left: 5%;
				}
				.ser1-1 {
					height: 50px;
				}
				.ser1-2 {
					font-size: 18px;
					height: 50px;
				}
				.ad {
					width: 80%;
					margin-left: 10%;
					margin-top: 30px;
				}
				.ad img {
					width: 98%;
					margin: 9px 1%;
				}
				.info {
					height: 617px;
					margin-top: 30px;
				}
				.info1 {
					font-size: 30px;
					line-height: 100px;
				}
				.info2 img {
					width: 30%;
					margin-top: 10px;
					margin-left: 35%;
				}
				#icon-title {
					font-size: 26px;
					line-height: 100px;
				}
				#icon1 {
					float: left;
					width: 15%;
					margin-left: 20%;
					height: 150px;
				}
				#icon2 {
					float: left;
					width: 15%;
					height: 120px;
				}
				#icon3 {
					float: left;
					width: 15%;
					height: 120px;
				}
				#icon4 {
					float: left;
					width: 15%;
					height: 120px;
				}
				.icon img {
					margin-left: 34%;
					width: 98px;
					height: 98px;
				}
				.icon-1 {
					margin-left: 0px;
				}
				.icon-2 {
					margin-left: 10px;
				}
				.bottom {
					height: 200px;
				}
			
				#bottom-1 {
					float: left;
					margin-left: 389px;
				}
			
				.bottom1 {
					float: left;
					margin-left: 60px;
				}
			}
			
			@media screen and (max-width: 640px) {
				.top {
					height: 40px;
					font-size: 20px;
					line-height: 40px;
					font-weight: 100;
				}
				.serch {
					background: rgba(0, 0, 0, 0.5);
					height: 50px;
					width: 100%;
				}
				.ser1 {
					width: 96%;
					height: 40px;
					margin-top: 5px;
					margin-left: 2%;
				}
				.ser1-1 {
					height: 40px;
				}
				.ser1-2 {
					font-size: 14px;
					height: 40px;
				}
				.ad {
					width: 98%;
					margin-left: 1%;
					margin-top: 3px;
				}
				.ad img {
					width: 98%;
					margin: 3px 1%;
				}
				.info {
					height: 420px;
					margin-top: 3px;
				}
				.info1 {
					font-size: 22px;
					line-height: 60px;
				}
				.info2 img {
					width: 100%;
				}
				#icon-title {
					font-size: 18px;
					line-height: 50px;
				}
				.icon img {
					width: 94%;
					margin-left: 3%;
				}
				#icon1 {
					float: left;
					margin-left: 5%;
					width: 18%;
				}
				#icon2 {
					float: left;
					margin-left: 6%;
					width: 18%;
				}
				#icon3 {
					float: left;
					margin-left: 6%;
					width: 18%;
				}
				#icon4 {
					float: left;
					margin-left: 6%;
					width: 18%;
				}
				.icon-1 {
					width: 100%;
					text-align: center;
				}
				.icon-2 {
					margin-left: 2px;
				}
				.bottom {
					width: 100%;
					height: auto;
					background: rgba(0, 0, 0, 0.8);
				}
				#bottom-1 {
					margin-left: 40px;
				}
			
				.bottom1 {
					margin-left: 40px;
				}
			}
			
			.myCarousel {
				width: 100%;
				z-index: 1;
			}
			
			.serch {
				z-index: 2;
				position: absolute;
			}
			
			.ser1-1 {
				width: 82%;
				float: left;
				border-width: 0;
			}
			
			.ser1-2 {
				width: 18%;
				border-width: 0;
				float: left;
				color: white;
				background: limegreen;
			}
			
			.ad {
				border: 1px solid lightgray;
			}
			
			.info {
				width: 100%;
				background-image: url(img/background.jpg);
				background-repeat: repeat-x;
			}
			
			.info1 {
				text-align: center;
				color: limegreen;
				font-family: '微软雅黑';
				font-weight: 600;
			}
			
			#icon-title {
				text-align: center;
				color: limegreen;
				font-family: '微软雅黑';
				font-weight: 500;
			}
			
			#icon1 {
				float: left;
			}
			
			#icon2 {
				float: left;
			}
			
			#icon3 {
				float: left;
			}
			
			#icon4 {
				float: left;
			}
			
			.icon-1 {
				font-size: 14px;
				text-align: center;
			}
			
			.icon-2 {
				font-size: 14px;
				text-align: center;
			}
			.bottom {
				width: 100%;
				background: rgba(0, 0, 0, 0.8);
			}
			
			#bottom-1 {
				color: steelblue;
				margin-top: 30px;
			}
			
			.bottom1 {
				color: steelblue;
				margin-top: 30px;
			}
		</style>
	</head>

	<body>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="js/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="js/bootstrap.min.js"></script>
		<!--bootstrap检测工具-->

		<div class="top">
			<p>茶 叶 溯 源 查 询</p>
		</div>

		<div class="serch">
			<div class="ser1">
				<form action="SearchTeaProduct" method="post">
				<input class="ser1-1" type="text" class="form-control" name="qrcode" placeholder="    请输入茶叶溯源码" />
				<button class="ser1-2" type="submit">查询</button>
				</form>
			</div>
		</div>
		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="img/slide1.jpg" alt="First slide" style="width: 100%;">
				</div>
				<div class="item">
					<img src="img/slide2.jpg" alt="Second slide" style="width: 100%;">
				</div>
				<div class="item">
					<img src="img/slide3.jpg" alt="Third slide" style="width: 100%;">
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a>
			<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
				<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<script>
			$(function() {
				// 初始化轮播
				$(".start-slide").click(function() {
					$("#myCarousel").carousel('cycle');
				});
				// 停止轮播
				$(".pause-slide").click(function() {
					$("#myCarousel").carousel('pause');
				});
				// 循环轮播到上一个项目
				$(".prev-slide").click(function() {
					$("#myCarousel").carousel('prev');
				});
				// 循环轮播到下一个项目
				$(".next-slide").click(function() {
					$("#myCarousel").carousel('next');
				});
				// 循环轮播到某个特定的帧 
				$(".slide-one").click(function() {
					$("#myCarousel").carousel(0);
				});
				$(".slide-two").click(function() {
					$("#myCarousel").carousel(1);
				});
				$(".slide-three").click(function() {
					$("#myCarousel").carousel(2);
				});
			});
		</script>
		<div class="ad">
			<img src="img/ad2.jpg" />
		</div>
		<div class="info">
			<p class="info1">通过以下方式追溯产品信息</p>
			<div class="info2">
				<img src="img/code.jpg" />
			</div>
			<p id="icon-title">通过查询得到如下相关信息</p>
			<div class="icon" id="icon1">
				<img src="img/icon1.png" />
				<div class="icon-1">
					<a style="color: black;text-decoration: none;">
						</br>产品信息</a>
				</div>
				
			</div>
			<div class="icon" id="icon2">
				<img src="img/icon2.png" />
				<div class="icon-2">
					<a style="color: black;text-decoration: none;">
					</br>生产商信息</a>
				</div>
				
			</div>
			<div class="icon" id="icon3">
				<img src="img/icon3.png" />
				<div class="icon-2">
					<a style="color: black;text-decoration: none;">
					</br>经销商信息</a>
				</div>
				
			</div>
			<div class="icon" id="icon4">
				<img src="img/icon4.png" />
				<div class="icon-1">
					<a style="color: black;text-decoration: none;">
					</br>检验信息</a>
				</div>
				
			</div>
		</div>
		<div class="bottom">
			<footer id="pc-footer">
				<div class="pc-layer">
					<div class="pc-footer">
						<div class="pc-listing clearfix">
							<dl id="bottom-1">
								<dt>政府部门</dt>

								<dd>
									<a href="http://www.aqsiq.gov.cn/ " rel="noopener noreferrer " target="_blank ">国家质量监督检验检疫总局</a>
								</dd>

								<dd>
									<a href="http://www.cnca.gov.cn/ " rel="noopener noreferrer " target="_blank ">中国国家认证认可监督管理委员会</a>
								</dd>

								<dd>
									<a href="http://www.sda.gov.cn/ " rel="noopener noreferrer " target="_blank ">国家食品药品监督管理总局</a>
								</dd>

								<dd>
									<a href="javascript:void(0); " class="smore ">更多>></a>
								</dd>
							</dl>
							<dl class="bottom1">
								<dt>出入境检验检疫局</dt>

								<dd>
									<a href="http://www.bjciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">北京出入境检验检疫局</a>
								</dd>

								<dd>
									<a href="http://www.tjciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">天津出入境检验检疫局</a>
								</dd>

								<dd>
									<a href="http://www.heciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">河北出入境检验检疫局</a>
								</dd>

								<dd>
									<a href="http://www.sxciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">山西出入境检验检疫局</a>
								</dd>

								<dd>
									<a href="javascript:void(0); " class="smore1 ">更多>></a>
								</dd>
							</dl>
							<dl class="bottom1">
								<dt>茶叶企业</dt>

								<dd>
									<a href="javascript:void(0); " class="smore2 ">更多>></a>
								</dd>
							</dl>
							<dl class="bottom1">
								<dt>其他</dt>

								<dd>
									<a href="http://www.caiq.org.cn/ " rel="noopener noreferrer " target="_blank ">中国检验检验科学研究院</a>
								</dd>

								<dd>
									<a href="javascript:void(0); " class="smore3 ">更多>></a>
								</dd>
							</dl>
						</div>
					</div>

					<div class="pc-surface" style="display:none; ">
						<div class="pc-district">
							<ul>

							</ul>
						</div>
					</div>
					<div class="pc-surface1" style="display:none; ">
						<div class="pc-district">
							<ul>

								<li>
									<a href="http://www.nmciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">内蒙古出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.lnciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">辽宁出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.jlciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">吉林出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.hljciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">黑龙江出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.shciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">上海出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.jsciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">江苏出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.ziq.gov.cn/ " rel="noopener noreferrer " target="_blank ">浙江出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.ahciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">安徽出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.nbciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">宁波出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.fjciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">福建出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.xmciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">厦门出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.jxciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">江西出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.sdciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">山东出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.haciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">河南出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.hbciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">湖北出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.hnciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">湖南出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.gdciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">广东出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.szciq.gov.cn/cn/index.html " rel="noopener noreferrer " target="_blank ">深圳出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.zhciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">珠海出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.zhciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">海南出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.gxciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">广西出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.cqciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">重庆出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.scciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">四川出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.gzciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">贵州出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.ynciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">云南出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.xzciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">西藏出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.snciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">陕西出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.gsciq.gov.cn/www/default.asp " rel="noopener noreferrer " target="_blank ">甘肃出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.qhciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">青海出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.nxciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">宁夏出入境检验检疫局</a>
								</li>

								<li>
									<a href="http://www.xjciq.gov.cn/ " rel="noopener noreferrer " target="_blank ">新疆出入境检验检疫局</a>
								</li>

							</ul>
						</div>
					</div>
				</div>
	</body>

</html>