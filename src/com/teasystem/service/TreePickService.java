package com.teasystem.service;

import com.teasystem.dao.TreePickDao;
import com.teasystem.entity.TreePick;

public class TreePickService {
	
	public TreePick getTreePickByFarmIdService(String farm_id) {

		if (farm_id == null || farm_id.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreePickDao treePickDao = new TreePickDao();
		TreePick treePick = treePickDao.getTreePickByIdDao(farm_id);
		return treePick;

	}
}
