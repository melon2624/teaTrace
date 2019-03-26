package com.teasystem.service;

import com.teasystem.dao.TreePlantDao;
import com.teasystem.entity.TreePlant;

public class TreePlantService {
	public TreePlant getTreePlantByIdService(String id ) {

		if (id == null || id.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreePlantDao treePlanteDao = new TreePlantDao();
		TreePlant treePlant = treePlanteDao.getTreePlantByidDao(id);
		return treePlant;
		//TeaProductDao teaProductDao = new TeaProductDao();
		//TeaProduct teaProduct = teaProductDao.getTeaProductByIdDao(qrcode);
		//return teaProduct;

	}
}
