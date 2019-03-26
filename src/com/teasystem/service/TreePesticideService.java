package com.teasystem.service;

import com.teasystem.dao.TreePesticideDao;
import com.teasystem.entity.TreePesticide;

/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */
public class TreePesticideService {
	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */
	public TreePesticide getTreePesticideByIdService(String farmid) {
		if (farmid == null ||farmid.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreePesticideDao treePesticideDao = new TreePesticideDao();
		TreePesticide treePesticide = treePesticideDao.getTreePesticideByIdDao(farmid);
		return treePesticide;
	}
}
