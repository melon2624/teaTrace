package com.teasystem.service;

import com.teasystem.dao.TreeDao;
import com.teasystem.entity.Tree;

public class TreeService {
	
	public Tree getTreeByTreeIdService(String tree_id) {

		if (tree_id == null || tree_id.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreeDao treeDao = new TreeDao();
		Tree tree = treeDao.getTreeByIdDao(tree_id);
		return tree;
	}
}
