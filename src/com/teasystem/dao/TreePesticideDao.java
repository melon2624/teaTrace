package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;



import com.teasystem.entity.TreePesticide;

public class TreePesticideDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_treepesticide`";
	//下面的代码调用此方法
	private TreePesticide getTreePesticideByRS(ResultSet rs) {
		TreePesticide tempTreePesticide = new TreePesticide();
		try {
			int id = rs.getInt("id");
			tempTreePesticide.setID(id);
			
			String name=rs.getString("name");
			tempTreePesticide.setNAME(name);
			
			int tree_id = rs.getInt("tree_id");
			tempTreePesticide.setTREE_ID(tree_id);
			
			int farm_type = rs.getInt("farm_type");
			tempTreePesticide.setFARM_TYPE(farm_type);
			
			Timestamp farm_time = rs.getTimestamp("farm_time");
			tempTreePesticide.setFARM_TIME(farm_time);
			
			String farm_mode=rs.getString("farm_mode");
			tempTreePesticide.setFARM_MODE(farm_mode);
			
			String farm_remark=rs.getString("farm_remark");
			tempTreePesticide.setFARM_REMARK(farm_remark);
			
			String pesti_name=rs.getString("pesti_name");
			tempTreePesticide.setPESTI_NAME(pesti_name);
			
			String pesti_content=rs.getString("pesti_content");
			tempTreePesticide.setPESTI_CONTENT(pesti_content);
			
			String pesti_amount=rs.getString("pesti_amount");
			tempTreePesticide.setPESTI_AMOUNT(pesti_amount);
			
			String pesti_type=rs.getString("pesti_type");
			tempTreePesticide.setPESTI_TYPE(pesti_type);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return tempTreePesticide;
	}
	/*
	 * 通过 id 去数据库中treePesticide取出对象的属性的值
	 * 
	 */
	public TreePesticide getTreePesticideByIdDao(String farmid) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//查询对应的结果
		String sql = generalSql + " where view_treepesticide.id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TreePesticide treePesticide = null;
		try {
			//将传入的参数farmid填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, farmid);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				treePesticide = getTreePesticideByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return treePesticide;
	}
}
