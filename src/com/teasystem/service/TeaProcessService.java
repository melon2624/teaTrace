package com.teasystem.service;

import com.teasystem.dao.TeaProcessDao;
import com.teasystem.entity.TeaProcess;


/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */
public class TeaProcessService {
	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */
	public TeaProcess getTeaProcessByIdService(String produceId) {
		if (produceId == null || produceId.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TeaProcessDao teaProcessDao = new TeaProcessDao();
		TeaProcess teaProcess = teaProcessDao.getTeaProcessByIdDao(produceId);
		return teaProcess;
	}
	
	
}
