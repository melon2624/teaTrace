package com.teasystem.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.teasystem.dao.BaseDao;

public class GetPestIDsByTreeID {
	
	public static List<Integer> getIDs(int treeid)
	{
		Connection conn = null;
		conn=BaseDao.getConnection();
		
		String generalSql = "SELECT * FROM `view_treepesticide`";
		String sql = generalSql + " where view_treepesticide.tree_id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<Integer> PesticideIDs = new ArrayList<Integer>();
		
		try{
			//将传入的参数treeid填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			String treeid_s=Integer.toString(treeid);
			pstm.setString(1, treeid_s);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				int pesticideID = rs.getInt("ID");
				PesticideIDs.add(pesticideID);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			} finally {
				BaseDao.close(pstm, rs);
			}
		return PesticideIDs;	//返回杀虫的ID
	}
}
