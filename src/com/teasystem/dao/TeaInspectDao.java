package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.teasystem.entity.TeaInspect;
import com.teasystem.util.DateUtil;

/*
 * 		处理茶叶检测数据的数据持久层
 */

public class TeaInspectDao {

	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_teainspect`";

	//从查询结果中找到第一个符合结果的对象
	private TeaInspect getTeaInspectByRS(ResultSet rs) {
		TeaInspect tempTeaInspect = new TeaInspect();
		try {
			//根据数据库文档获取所有的值
			String product_qr_code = rs.getString("product_qr_code");
			tempTeaInspect.setPRODUCT_QR_CODE(product_qr_code);
			
			String name = rs.getString("name");
			tempTeaInspect.setNAME(name);

			// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
			Date inspect_time = DateUtil.t2d(rs.getTimestamp("inspect_time"));
			tempTeaInspect.setINSPECT_TIME(inspect_time);

			String inspect_level = rs.getString("inspect_level");
			tempTeaInspect.setINSPECT_LEVEL(inspect_level);
			
			String inspect_pesticide_content = rs.getString("inspect_pesticide_content");
			tempTeaInspect.setINSPECT_PESTICIDE_CONTENT(inspect_pesticide_content);
			
			String inspect_comment = rs.getString("inspect_comment");
			tempTeaInspect.setINSPECT_COMMENT(inspect_comment);

			int produce_id = rs.getInt("produce_id");
			tempTeaInspect.setPRODUCE_ID(produce_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTeaInspect;
	}

	/*
	 * 通过 qrcode 去数据库中 取出 teaInspect对象
	 * 
	 */
	public TeaInspect getTeaInspectByQrCodeDao(String qrcode) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据inspect_qr_code查询对应的结果
		String sql = generalSql + " where view_teainspect.product_qr_code = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TeaInspect teaInspect = null;
		try {
			//将传入的参数qrcode填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, qrcode);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				teaInspect = getTeaInspectByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return teaInspect;
	}
	
	/*
	 * 通过 id 去数据库中 取出 produce_id对象
	 * 
	 */
	public TeaInspect getTeaInspectByProduceIdDao(String produceId) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据produce_id查询对应的结果
		String sql = generalSql + " where view_teainspect.produce_id = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TeaInspect teaInspect = null;
		try {
			//将传入的参数produceId填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, produceId);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				teaInspect = getTeaInspectByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return teaInspect;
	}
}
