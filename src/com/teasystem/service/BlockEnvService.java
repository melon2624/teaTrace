package com.teasystem.service;
import com.teasystem.dao.BlockEnvDao;


import com.teasystem.entity.BlockEnv;

/*
 * 
 * 用来处理茶叶产品数据的业务逻辑
 * 
 * */
public class BlockEnvService {
	/*
	 * 查询茶叶产品数据的业务逻辑
	 * 
	 * 创建dao层对象，去数据库中取出数据
	 */
	public BlockEnv getBlockEnvByIdService(String blockid) {

		if (blockid == null || blockid.length()==0) {
			// 数据错误
			return null;
		}
		// 调用 Dao层方法去操作数据库
		BlockEnvDao blockenvDao = new BlockEnvDao();
		BlockEnv blockenv = blockenvDao.getBlockEnvByIdDao(blockid);
		return blockenv;

	}
}
