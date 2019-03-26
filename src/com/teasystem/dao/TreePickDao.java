package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.teasystem.entity.TreePick;
import com.teasystem.util.DateUtil;

public class TreePickDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_treepick`";
	//从查询结果中找到第一个符合结果的对象
	
	private TreePick getTreePickByRS(ResultSet rs) {
		TreePick tempTreePick = new TreePick();
		try {
			//根据数据库文档获取所有的值
			int tree_pick_id = rs.getInt("ID");
			tempTreePick.setID(tree_pick_id);
			
			String tree_pick_worker_name=rs.getString("NAME");
			tempTreePick.setNAME(tree_pick_worker_name);
			
			int tree_pick_type=rs.getInt("FARM_TYPE");
			tempTreePick.setFARM_TYPE(tree_pick_type);
			
			Date tree_pick_time = DateUtil.t2d(rs.getTimestamp("FARM_TYPE"));
			tempTreePick.setFARM_TIME(tree_pick_time);
			
			String tree_pick_farm_mode=rs.getString("FARM_MODE");
			tempTreePick.setFARM_MODE(tree_pick_farm_mode);
			
			String tree_pick_farm_remark=rs.getString("FARM_REMARK");
			tempTreePick.setFARM_REMARK(tree_pick_farm_remark);
			
			int tree_pick_age=rs.getInt("PICK_TREE_AGE");
			tempTreePick.setPICK_TREE_AGE(tree_pick_age);
			
			float tree_pick_weight=rs.getFloat("PICK_WEIGHT");
			tempTreePick.setPICK_WEIGHT(tree_pick_weight);
			
			String tree_pick_part=rs.getString("PICK_PART");
			tempTreePick.setPICK_PART(tree_pick_part);
			
			String tree_pick_standard=rs.getString("PICK_STANDARD");
			tempTreePick.setPICK_STANDARD(tree_pick_standard);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTreePick;
	}
	
	/*
	 * 通过 id 去数据库中 取出 teaProduct对象
	 * 
	 */
	public TreePick getTreePickByIdDao(String farm_id) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据product_qr_code查询对应的结果
		String sql = generalSql + " where view_treepick.id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TreePick treePick = null;
		
		try {
			//将传入的参数farm_id填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, farm_id);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				treePick = getTreePickByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return treePick;
	}
}
