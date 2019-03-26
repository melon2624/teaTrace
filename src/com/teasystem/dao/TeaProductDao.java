package com.teasystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.teasystem.entity.TeaProduct;
import com.teasystem.util.DateUtil;

/*
 * 		处理茶叶产品数据的数据持久层
 */

public class TeaProductDao {

	private Connection conn = null;
	// 执行SQL语句，修改时需要替换对应的表名
	private String generalSql = "SELECT * FROM `view_teaproduct`";

	//从查询结果中找到第一个符合结果的对象
	private TeaProduct getTeaProductByRS(ResultSet rs) {
		TeaProduct tempTeaProduct = new TeaProduct();
		try {
			//根据数据库文档获取所有的值
			String tea_type_name = rs.getString("tea_type_name");
			tempTeaProduct.setTEA_TYPE_NAME(tea_type_name);
			
			String product_qr_code = rs.getString("product_qr_code");
			tempTeaProduct.setPRODUCT_QR_CODE(product_qr_code);
			
			String produce_origin = rs.getString("produce_origin");
			tempTeaProduct.setPRODUCE_ORIGIN(produce_origin);

			// 调用静态方法DateUtil.d2d将java.sql.Date类型的时间转换为java.util.Date的时间
			Date produce_start_time = DateUtil.t2d(rs.getTimestamp("produce_start_time"));
			tempTeaProduct.setPRODUCE_START_TIME(produce_start_time);
			
			Date product_time = DateUtil.t2d(rs.getTimestamp("product_time"));
			tempTeaProduct.setPRODUCT_TIME(product_time);

			String product_weight = rs.getString("product_weight");
			tempTeaProduct.setPRODUCT_WEIGHT(product_weight);
			
			String tea_info = rs.getString("tea_info");
			tempTeaProduct.setTEA_INFO(tea_info);
			
			String tea_brew_info = rs.getString("tea_brew_info");
			tempTeaProduct.setTEA_BREW_INFO(tea_brew_info);

			int produce_id = rs.getInt("produce_id");
			tempTeaProduct.setPRODUCE_ID(produce_id);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempTeaProduct;
	}

	/*
	 * 通过 id 去数据库中 取出 teaProduct对象
	 * 
	 */
	public TeaProduct getTeaProductByIdDao(String qrcode) {
		//获取数据库连接
		conn = BaseDao.getConnection();
		//根据product_qr_code查询对应的结果
		String sql = generalSql + " where view_teaproduct.product_qr_code = ?";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		TeaProduct teaProduct = null;
		try {
			//将传入的参数qrcode填入预编译sql语句中
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, qrcode);
			//执行查询
			rs = pstm.executeQuery();
			//找到结果
			while (rs.next()) {
				teaProduct = getTeaProductByRS(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.close(pstm, rs);
		}
		return teaProduct;
	}
}
