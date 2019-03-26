package com.teasystem.service;

import com.teasystem.dao.TeaInspectDao;
import com.teasystem.entity.TeaInspect;

/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */

public class TeaInspectService {

	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */

	public TeaInspect getTeaInspectByQrCodeService(String qrcode) {

		if (qrcode == null || qrcode.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TeaInspectDao teaInspectDao = new TeaInspectDao();
		TeaInspect teaInspect = teaInspectDao.getTeaInspectByQrCodeDao(qrcode);
		return teaInspect;

	}
	
	public TeaInspect getTeaInspectByProduceIdService(String ProduceId) {

		if (ProduceId == null || ProduceId.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TeaInspectDao teaInspectDao = new TeaInspectDao();
		TeaInspect teaInspect = teaInspectDao.getTeaInspectByProduceIdDao(ProduceId);
		return teaInspect;

	}
	
	
}
