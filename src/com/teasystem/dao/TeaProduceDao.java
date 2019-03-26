package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.teasystem.entity.TeaProduce;
import com.teasystem.util.DateUtil;

/*
 * 		处理茶叶产品数据的数据持久层
 */

public class TeaProduceDao {

	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_teaproduce`";

	//从查询结果中找到第一个符合结果的对象
	private TeaProduce getTeaProduceByRS(ResultSet rs) {
		TeaProduce tempTeaProduce = new TeaProduce();
		try {
			//根据数据库文档获取所有的值
			int id = rs.getInt("id");
			tempTeaProduce.setID(id);
			
			String name = rs.getString("name");
			tempTeaProduce.setNAME(name);
			
			int produce_in_process = rs.getInt("produce_in_process");
			tempTeaProduce.setPRODUCE_IN_PROCESS(produce_in_process);

			// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
			Date produce_start_time = DateUtil.t2d(rs.getTimestamp("produce_start_time"));
			tempTeaProduce.setPRODUCE_START_TIME(produce_start_time);

			String produce_origin = rs.getString("produce_origin");
			tempTeaProduce.setPRODUCE_ORIGIN(produce_origin);
			
			String produce_type = rs.getString("produce_type");
			tempTeaProduce.setPRODUCE_TYPE(produce_type);
			
			String produce_level = rs.getString("produce_level");
			tempTeaProduce.setPRODUCE_LEVEL(produce_level);
			
			String produce_remark = rs.getString("produce_remark");
			tempTeaProduce.setPRODUCE_REMARK(produce_remark);

			int tree_id= rs.getInt("tree_id");
			tempTeaProduce.setTREE_ID(tree_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTeaProduce;
	}

	/*
	 * 通过 id 去数据库中 取出 teaProduce对象
	 * 
	 */
	public TeaProduce getTeaProduceByIdDao(String produceid) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据id查询对应的结果
		String sql = generalSql + " where view_teaproduce.id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TeaProduce teaProduce = null;
		try {
			//将传入的参数produceid填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, produceid);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				teaProduce = getTeaProduceByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return teaProduce;
	}
}
