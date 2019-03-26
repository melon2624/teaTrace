package com.teasystem.service;

import com.teasystem.dao.TreeFertilizeDao;
import com.teasystem.entity.TreeFertilize;

public class TreeFertilizeService {
	public TreeFertilize getTreeFertilizeByIdService(String id ) {

		if (id == null || id.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreeFertilizeDao treeFertilizeDao = new TreeFertilizeDao();
		TreeFertilize treeFertilize = treeFertilizeDao.getTreeFertilizeByidDao(id);
		return treeFertilize;
		//TeaProductDao teaProductDao = new TeaProductDao();
		//TeaProduct teaProduct = teaProductDao.getTeaProductByIdDao(qrcode);
		//return teaProduct;

	}
		
}
