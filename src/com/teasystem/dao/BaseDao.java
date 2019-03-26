package com.teasystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1）获取 Connection 对象  
 * 		使用 单例模式 去获取 Connection 对象
 * 2）释放相关资源
 * */

public class BaseDao {

	// 维护一个私有的 Connection 对象
	private static Connection conn = null;

	public static final String url = "jdbc:mysql://www.adamqqq.com:3306/teasystem?serverTimezone=GMT%2B8&useSSL=true";
	public static final String drivername = "com.mysql.cj.jdbc.Driver";
	public static final String username = "teauser";
	public static final String password = "xed6^PKQ@d";

	// 提供一个公共的方法让别人能获取到这个Connection 对象
	public static Connection getConnection() {
		if (conn == null) {
			try {
				// The newInstance() call is a work around for some
				// broken Java implementations
				Class.forName(drivername).newInstance();

				// 连接数据库实例，获取连接对象
				conn = DriverManager.getConnection(url, username, password);
				System.out.println(conn);
			} catch (SQLException ex) {
				// handle any errors
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			} catch (Exception e) {
				e.printStackTrace();
				// 自定义异常
				System.out.println("数据库连接异常");
			}
		}
		return conn;
	}

	/*
	 * 关闭相关资源
	 * 
	 */
	public static void close(Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("释放资源异常");
		}
	}
}
