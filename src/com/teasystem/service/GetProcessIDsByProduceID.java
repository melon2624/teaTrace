package com.teasystem.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.teasystem.dao.BaseDao;

public class GetProcessIDsByProduceID {
	
	public static List<Integer> getIDs(int produceid)
	{
		Connection conn = null;
		conn=BaseDao.getConnection();
		
		String generalSql = "SELECT * FROM `view_teaprocess`";
		String sql = generalSql + " where view_teaprocess.produce_id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<Integer> ProcessIDs = new ArrayList<Integer>();
		
		try{
			//将传入的参数produceid填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			String produceid_s=Integer.toString(produceid);
			pstm.setString(1, produceid_s);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				int processID = rs.getInt("ID");
				ProcessIDs.add(processID);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			} finally {
				BaseDao.close(pstm, rs);
			}
		return ProcessIDs;	//返回茶叶处理的ID
	}
}
