package com.teasystem.service;

import com.teasystem.dao.TeaProductDao;
import com.teasystem.entity.TeaProduct;

/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */

public class TeaProductService {

	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */

	public TeaProduct getTeaProductByIdService(String qrcode) {

		if (qrcode == null || qrcode.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TeaProductDao teaProductDao = new TeaProductDao();
		TeaProduct teaProduct = teaProductDao.getTeaProductByIdDao(qrcode);
		return teaProduct;

	}
	
}
