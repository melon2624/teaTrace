package com.teasystem.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import com.teasystem.entity.TreeFertilize;
import com.teasystem.util.DateUtil;

public class TreeFertilizeDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_treefertilize`";
	//从查询结果中找到第一个符合结果的对象
		private TreeFertilize getTreeFertilizeByRS(ResultSet rs) {
			TreeFertilize tempTreeFertilize = new TreeFertilize();
			try {
				//根据数据库文档获取所有的值
				//获得id（农事活动编号）
				int id = rs.getInt("id");
				tempTreeFertilize.setID(id);
				//获得name（获得姓名）
				String NAME= rs.getString("name");
				tempTreeFertilize.setNAME(NAME);
				//获得茶树编号
				int tree_id = rs.getInt("tree_id");
				tempTreeFertilize.setTREE_ID(tree_id);
				//获得农事种类
				int farm_type = rs.getInt("farm_type");
				tempTreeFertilize.setFARM_TYPE(farm_type);
				// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
				Date farm_time = DateUtil.t2d(rs.getTimestamp("farm_time"));
				tempTreeFertilize.setFARM_TIME(farm_time);
				//获得操作方式
				String farm_mode = rs.getString("farm_mode");
				tempTreeFertilize.setFARM_MODE(farm_mode);
				//获得农事活动备注
				String farm_remark = rs.getString("farm_remark");
				tempTreeFertilize.setFARM_REMARK(farm_remark);
				//获得肥料名称
				String fert_name = rs.getString("fert_name");
				tempTreeFertilize.setFERT_NAME(fert_name);
				//获得肥料成分
				String fert_content = rs.getString("fert_content");
				tempTreeFertilize.setFERT_CONTENT(fert_content);
				//获得肥料用量
				String fert_amount = rs.getString("fert_amount");
				tempTreeFertilize.setFERT_AMOUNT(fert_amount);
				
				String fert_method = rs.getString("fert_method");
				tempTreeFertilize.setFERT_METHOD(fert_method);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return tempTreeFertilize;
		}
		/*
		 * 通过 id 去数据库中 取出 ID对象
		 * 
		 */
		public TreeFertilize getTreeFertilizeByidDao(String id) {
			//获取数据库连接
			conn = BaseDao.getConnection();
			//根据id查询对应的结果
			String sql = generalSql + " where view_treefertilize.id = ?";
			PreparedStatement pstm = null;
			ResultSet rs = null;
			TreeFertilize treeFertilize = null;
			try {
				//将传入的参数qrcode填入预编译sql语句中
				pstm = conn.prepareStatement(sql);
				pstm.setString(1,id );
				//执行查询
				rs = pstm.executeQuery();
				//找到结果
				while (rs.next()) {
					treeFertilize = getTreeFertilizeByRS(rs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				BaseDao.close(pstm, rs);
			}
			return treeFertilize;
		}
		
}
