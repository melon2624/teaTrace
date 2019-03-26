package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.teasystem.entity.TreePlant;
import com.teasystem.util.DateUtil;

public class TreePlantDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_treeplant`";
	//从查询结果中找到第一个符合结果的对象
		private  TreePlant getTreePlantByRS(ResultSet rs) {
			 TreePlant tempTreePlant = new  TreePlant();
			try {
				//根据数据库文档获取所有的值
				//获得id（农事活动编号）
				int id = rs.getInt("id");
				tempTreePlant.setID(id);
				//获得name（获得姓名）
				String name= rs.getString("name");
				tempTreePlant.setNAME(name);
				//获得茶树编号
				int tree_id = rs.getInt("tree_id");
				tempTreePlant.setTREE_ID(tree_id);
				//获得农事种类
				int farm_type = rs.getInt("farm_type");
				tempTreePlant.setFARM_TYPE(farm_type);
				//获得操作方式
				String farm_mode = rs.getString("farm_mode");
				tempTreePlant.setFARM_MODE(farm_mode);
				// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
				Date farm_time = DateUtil.t2d(rs.getTimestamp("farm_time"));
				tempTreePlant.setFARM_TIME(farm_time);
				//获得农事活动备注
				String farm_remark = rs.getString("farm_remark");
				tempTreePlant.setFARM_REMARK(farm_remark);
				//获得铺草
				String sward = rs.getString("sward");
				tempTreePlant.setSWARD(sward);
				//获得嫁接
				String grafting = rs.getString("grafting");
				tempTreePlant.setGRAFTING(grafting);
				//获得栽种天气
				String plant_weather = rs.getString("plant_weather");
				tempTreePlant.setPLANT_WEATHER(plant_weather);
				//获得间种作物
				String interplant = rs.getString("interplant");
				tempTreePlant.setPLANT_WEATHER(interplant);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return tempTreePlant;
		}
		/*
		 * 通过 id 去数据库中 取出 ID对象
		 * 
		 */
		public TreePlant getTreePlantByidDao(String id) {
			//获取数据库连接
			conn = BaseDao.getConnection();
			//根据id查询对应的结果
			String sql = generalSql + " where view_treeplant.id = ?";
			PreparedStatement pstm = null;
			ResultSet rs = null;
			TreePlant treePlant = null;
			try {
				//将传入的参数id填入预编译sql语句中
				pstm = conn.prepareStatement(sql);
				pstm.setString(1,id );
				//执行查询
				rs = pstm.executeQuery();
				//找到结果
				while (rs.next()) {
					treePlant = getTreePlantByRS(rs);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				BaseDao.close(pstm, rs);
			}
			return treePlant;
		}
}
