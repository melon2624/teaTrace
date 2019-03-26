package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;

import com.teasystem.util.DateUtil;
import com.teasystem.entity.BlockEnv;

public class BlockEnvDao {

	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_blockenv`";
	private BlockEnv getBlockEnvByRS(ResultSet rs){
		BlockEnv  tempBlockEnv=new BlockEnv();
		try{
			//根据数据库文档获取所有的值
			int id=rs. getInt("id");
			tempBlockEnv.setID(id);
			
			String block_name=rs.getString("block_name");
			tempBlockEnv.setBLOCK_NAME(block_name);
	
			Float  soil_temp=rs.getFloat ("soil_temp");
			tempBlockEnv.setSOIL_TEMP(soil_temp);
			
			// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
			Date env_time=DateUtil.t2d(rs.getTimestamp("env_time"));
			tempBlockEnv.setENV_TIME(env_time);
			
			Float soil_humidity=rs.getFloat("soil_humidity");
			tempBlockEnv.setSOIL_HUMIDITY(soil_humidity);
			
			Float env_temp=rs.getFloat("env_temp");
			tempBlockEnv.setENV_TEMP(env_temp);
			
			Float env_humidity=rs.getFloat("env_humidity");
			tempBlockEnv.setENV_HUMIDITY(env_humidity);
			
			Float env_rainfall=rs.getFloat("env_rainfall");
			tempBlockEnv.setENV_RAINFALL(env_rainfall);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return tempBlockEnv;
		
	}
	/*
	 * 通过 id 去数据库中 取出 teaProduct对象
	 * 
	 */
	public BlockEnv  getBlockEnvByIdDao(String blockid){
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据blockenv_block_id查询对应的结果
		String sql = generalSql + " where view_blockenv.id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		BlockEnv blockenv=null;
		try{
			//将传入的参数blockid填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, blockid);
			//执行查询
			 rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				blockenv = getBlockEnvByRS(rs);
			}

		}catch (SQLException e) {
			e.printStackTrace();
			} finally {
				BaseDao.close(pstm, rs);
			}
		return blockenv;
	}
	

}
