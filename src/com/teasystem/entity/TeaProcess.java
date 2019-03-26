/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.0
 */

package com.teasystem.entity;

import java.util.Date;

/**
 * view_teaprocess
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TeaProcess {
	/** 加工编号 */
	private Integer ID;

	/** 姓名 */
	private String NAME;

	/** 生产编号 */
	private Integer PRODUCE_ID;

	/** 加工类型 */
	private Integer PROCESS_TYPE;

	/** 加工时间 */
	private Date PROCESS_TIME;

	/** 加工车间 */
	private String PROCESS_WORKSHOP;

	/** 加工温度 */
	private String PROCESS_TEMP;

	/** 加工操作方式 */
	private String PROCESS_MODE;

	/**
	 * 获取加工编号
	 * 
	 * @return 加工编号
	 */
	public Integer getID() {
		return this.ID;
	}

	/**
	 * 设置加工编号
	 * 
	 * @param ID
	 *            加工编号
	 */
	public void setID(Integer ID) {
		this.ID = ID;
	}

	/**
	 * 获取姓名
	 * 
	 * @return 姓名
	 */
	public String getNAME() {
		return this.NAME;
	}

	/**
	 * 设置姓名
	 * 
	 * @param NAME
	 *            姓名
	 */
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	/**
	 * 获取生产编号
	 * 
	 * @return 生产编号
	 */
	public Integer getPRODUCE_ID() {
		return this.PRODUCE_ID;
	}

	/**
	 * 设置生产编号
	 * 
	 * @param PRODUCE_ID
	 *            生产编号
	 */
	public void setPRODUCE_ID(Integer PRODUCE_ID) {
		this.PRODUCE_ID = PRODUCE_ID;
	}

	/**
	 * 获取加工类型
	 * 
	 * @return 加工类型
	 */
	public Integer getPROCESS_TYPE() {
		return this.PROCESS_TYPE;
	}

	/**
	 * 设置加工类型
	 * 
	 * @param PROCESS_TYPE
	 *            加工类型
	 */
	public void setPROCESS_TYPE(Integer PROCESS_TYPE) {
		this.PROCESS_TYPE = PROCESS_TYPE;
	}

	/**
	 * 获取加工时间
	 * 
	 * @return 加工时间
	 */
	public Date getPROCESS_TIME() {
		return this.PROCESS_TIME;
	}

	/**
	 * 设置加工时间
	 * 
	 * @param PROCESS_TIME
	 *            加工时间
	 */
	public void setPROCESS_TIME(Date PROCESS_TIME) {
		this.PROCESS_TIME = PROCESS_TIME;
	}

	/**
	 * 获取加工车间
	 * 
	 * @return 加工车间
	 */
	public String getPROCESS_WORKSHOP() {
		return this.PROCESS_WORKSHOP;
	}

	/**
	 * 设置加工车间
	 * 
	 * @param PROCESS_WORKSHOP
	 *            加工车间
	 */
	public void setPROCESS_WORKSHOP(String PROCESS_WORKSHOP) {
		this.PROCESS_WORKSHOP = PROCESS_WORKSHOP;
	}

	/**
	 * 获取加工温度
	 * 
	 * @return 加工温度
	 */
	public String getPROCESS_TEMP() {
		return this.PROCESS_TEMP;
	}

	/**
	 * 设置加工温度
	 * 
	 * @param PROCESS_TEMP
	 *            加工温度
	 */
	public void setPROCESS_TEMP(String PROCESS_TEMP) {
		this.PROCESS_TEMP = PROCESS_TEMP;
	}

	/**
	 * 获取加工操作方式
	 * 
	 * @return 加工操作方式
	 */
	public String getPROCESS_MODE() {
		return this.PROCESS_MODE;
	}

	/**
	 * 设置加工操作方式
	 * 
	 * @param PROCESS_MODE
	 *            加工操作方式
	 */
	public void setPROCESS_MODE(String PROCESS_MODE) {
		this.PROCESS_MODE = PROCESS_MODE;
	}

	@Override
	public String toString() {
		return "TeaProcess [ID=" + ID + ", NAME=" + NAME + ", PRODUCE_ID=" + PRODUCE_ID + ", PROCESS_TYPE="
				+ PROCESS_TYPE + ", PROCESS_TIME=" + PROCESS_TIME + ", PROCESS_WORKSHOP=" + PROCESS_WORKSHOP
				+ ", PROCESS_TEMP=" + PROCESS_TEMP + ", PROCESS_MODE=" + PROCESS_MODE + "]";
	}
}