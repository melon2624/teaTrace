package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import com.teasystem.entity.TeaProcess;


public class TeaProcessDao {
	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_teaprocess`";
	//下面的代码调用此方法
	private TeaProcess getTeaProcessByRS(ResultSet rs) {
		TeaProcess tempTeaProcess = new TeaProcess();
		try {
			int id = rs.getInt("id");
			tempTeaProcess.setID(id);
			
			String name=rs.getString("name");
			tempTeaProcess.setNAME(name);
			
			int produce_id = rs.getInt("produce_id");
			tempTeaProcess.setPRODUCE_ID(produce_id);
			
			int process_type = rs.getInt("process_type");
			tempTeaProcess.setPROCESS_TYPE(process_type);
			
			Time process_time=rs.getTime("process_time");
			tempTeaProcess.setPROCESS_TIME(process_time);
			
			String process_workshop=rs.getString("process_workshop");
			tempTeaProcess.setPROCESS_WORKSHOP(process_workshop);
			
			String process_temp=rs.getString("process_temp");
			tempTeaProcess.setPROCESS_TEMP(process_temp);
			
			String process_mode=rs.getString("process_mode");
			tempTeaProcess.setPROCESS_MODE(process_mode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTeaProcess;
	}
	/*
	 * 通过 id 去数据库中 取出 teaProcess对象的属性的值
	 * 
	 */
	public TeaProcess getTeaProcessByIdDao(String produceId) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//查询对应的结果
		String sql = generalSql + " where view_teaprocess.produce_id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TeaProcess teaProcess = null;
		try {
			//将传入的参数produceId填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, produceId);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				teaProcess = getTeaProcessByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return teaProcess;
	}
}
