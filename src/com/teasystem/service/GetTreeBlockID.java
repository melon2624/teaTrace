package com.teasystem.service;


import com.teasystem.dao.TreeDao;
import com.teasystem.entity.Tree;


public class GetTreeBlockID {
	
	public static String getTreeBlockID(String treeid)
	{
		if (treeid == null || treeid.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		TreeDao treeDao = new TreeDao();
		Tree tree = treeDao.getTreeByIdDao(treeid);
		return String.valueOf(tree.getBLOCK_ID());
	}
}
