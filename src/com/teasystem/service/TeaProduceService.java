package com.teasystem.service;

import com.teasystem.dao.TeaProduceDao;
import com.teasystem.entity.TeaProduce;

/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */

public class TeaProduceService {

	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */

	public TeaProduce getTeaProduceByIdService(String produceid) {

		if (produceid == null || produceid.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TeaProduceDao teaProduceDao = new TeaProduceDao();
		TeaProduce teaProduce = teaProduceDao.getTeaProduceByIdDao(produceid);
		return teaProduce;

	}
	
}
