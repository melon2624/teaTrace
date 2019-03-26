package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.teasystem.entity.Tree;


public class TreeDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_tree`";
	//从查询结果中找到第一个符合结果的对象
	
	private Tree getTreeByRS(ResultSet rs) {
		Tree tempTree = new Tree();
		try {
			//根据数据库文档获取所有的值
			int tree_id = rs.getInt("ID");
			tempTree.setID(tree_id);
			
			String block_name=rs.getString("BLOCK_NAME");
			tempTree.setBLOCK_NAME(block_name);
			
			String company=rs.getString("COMPANY");
			tempTree.setCOMPANY(company);
			
			String topography=rs.getString("TOPOGRAPHY");
			tempTree.setTOPOGRAPHY(topography);
			
			String location=rs.getString("LOCATION");
			tempTree.setLOCATION(location);
			
			String block_info=rs.getString("BLOCK_INFO");
			tempTree.setBLOCK_INFO(block_info);
			
			String tree_type_name=rs.getString("TREE_TYPE_NAME");
			tempTree.setTREE_TYPE_NAME(tree_type_name);
			
			String tree_origin=rs.getString("TREE_ORIGIN");
			tempTree.setTREE_ORIGIN(tree_origin);
			
			String product_tea=rs.getString("PRODUCT_TEA");
			tempTree.setPRODUCT_TEA(product_tea);
			
			String morph_charact=rs.getString("MORPH_CHARACT");
			tempTree.setMORPH_CHARACT(morph_charact);
					
			String plant_important=rs.getString("PLANT_IMPORTANT");
			tempTree.setPLANT_IMPORTANT(plant_important);
			
			int block_id=rs.getInt("BLOCK_ID");
			tempTree.setBLOCK_ID(block_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTree;
	}
	
	/*
	 * 通过 id 去数据库中 取出 teaProduct对象
	 * 
	 */
	public Tree getTreeByIdDao(String tree_id) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据product_qr_code查询对应的结果
		String sql = generalSql + " where view_tree.id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Tree tree = null;
		
		try {
			//将传入的参数farm_id填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, tree_id);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				tree = getTreeByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return tree;
	}
}
