
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
	<c:if test="${empty treeplant}">
	<%
		response.sendRedirect("index.jsp");
	%>
	</c:if>
	 农事活动编号：${treeplant.ID}
	<br /> 姓名:${treeplant.NAME}
	<br /> 茶树编号：${treeplant.TREE_ID}
	<br /> 农事种类:${treeplant.FARM_TYPE}
	<br /> 农事时间:${treeplant.FARM_TIME}
	<br /> 操作方式:${treeplant.FARM_MODE}
	<br /> 农事活动备注:${treeplant.FARM_REMARK}
	<br /> 是否铺草：${treeplant.SWARD}
	<br /> 是否嫁接:${treeplant.GRAFTING}
	<br /> 栽种天气:${treeplant.PLANT_WEATHER}
	<br /> 间种作物:${treeplant.INTERPLANT}
	
	<br />

</body>
</html>
<!-- 	/** 农事活动编号 */
	private Integer ID;

	/** 姓名 */
	private String NAME;

	/** 茶树编号 */
	private Integer TREE_ID;

	/** 农事种类 */
	private Integer FARM_TYPE;

	/** 农事时间 */
	private Date FARM_TIME;

	/** 操作方式 */
	private String FARM_MODE;

	/** 农事活动备注 */
	private String FARM_REMARK;

	/** 是否铺草 */
	private String SWARD;

	/** 是否嫁接 */
	private String GRAFTING;

	/** 栽种天气 */
	private String PLANT_WEATHER;

	/** 间种作物 */
	private String INTERPLANT;
 -->