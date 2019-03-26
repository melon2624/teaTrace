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
 * view_teaproduce
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TeaProduce {
	/** 生产编号 */
	private Integer ID;

	/** 姓名 */
	private String NAME;

	/** 生产阶段 */
	private Integer PRODUCE_IN_PROCESS;

	/** 生产开始时间 */
	private Date PRODUCE_START_TIME;

	/** 生产产地 */
	private String PRODUCE_ORIGIN;

	/** 生产种类 */
	private String PRODUCE_TYPE;

	/** 生产等级 */
	private String PRODUCE_LEVEL;

	/** 生产备注 */
	private String PRODUCE_REMARK;

	/** 茶树编号 */
	private Integer TREE_ID;

	/**
	 * 获取生产编号
	 * 
	 * @return 生产编号
	 */
	public Integer getID() {
		return this.ID;
	}

	/**
	 * 设置生产编号
	 * 
	 * @param ID
	 *            生产编号
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
	 * 获取生产阶段
	 * 
	 * @return 生产阶段
	 */
	public Integer getPRODUCE_IN_PROCESS() {
		return this.PRODUCE_IN_PROCESS;
	}

	/**
	 * 设置生产阶段
	 * 
	 * @param PRODUCE_IN_PROCESS
	 *            生产阶段
	 */
	public void setPRODUCE_IN_PROCESS(Integer PRODUCE_IN_PROCESS) {
		this.PRODUCE_IN_PROCESS = PRODUCE_IN_PROCESS;
	}

	/**
	 * 获取生产开始时间
	 * 
	 * @return 生产开始时间
	 */
	public Date getPRODUCE_START_TIME() {
		return this.PRODUCE_START_TIME;
	}

	/**
	 * 设置生产开始时间
	 * 
	 * @param PRODUCE_START_TIME
	 *            生产开始时间
	 */
	public void setPRODUCE_START_TIME(Date PRODUCE_START_TIME) {
		this.PRODUCE_START_TIME = PRODUCE_START_TIME;
	}

	/**
	 * 获取生产产地
	 * 
	 * @return 生产产地
	 */
	public String getPRODUCE_ORIGIN() {
		return this.PRODUCE_ORIGIN;
	}

	/**
	 * 设置生产产地
	 * 
	 * @param PRODUCE_ORIGIN
	 *            生产产地
	 */
	public void setPRODUCE_ORIGIN(String PRODUCE_ORIGIN) {
		this.PRODUCE_ORIGIN = PRODUCE_ORIGIN;
	}

	/**
	 * 获取生产种类
	 * 
	 * @return 生产种类
	 */
	public String getPRODUCE_TYPE() {
		return this.PRODUCE_TYPE;
	}

	/**
	 * 设置生产种类
	 * 
	 * @param PRODUCE_TYPE
	 *            生产种类
	 */
	public void setPRODUCE_TYPE(String PRODUCE_TYPE) {
		this.PRODUCE_TYPE = PRODUCE_TYPE;
	}

	/**
	 * 获取生产等级
	 * 
	 * @return 生产等级
	 */
	public String getPRODUCE_LEVEL() {
		return this.PRODUCE_LEVEL;
	}

	/**
	 * 设置生产等级
	 * 
	 * @param PRODUCE_LEVEL
	 *            生产等级
	 */
	public void setPRODUCE_LEVEL(String PRODUCE_LEVEL) {
		this.PRODUCE_LEVEL = PRODUCE_LEVEL;
	}

	/**
	 * 获取生产备注
	 * 
	 * @return 生产备注
	 */
	public String getPRODUCE_REMARK() {
		return this.PRODUCE_REMARK;
	}

	/**
	 * 设置生产备注
	 * 
	 * @param PRODUCE_REMARK
	 *            生产备注
	 */
	public void setPRODUCE_REMARK(String PRODUCE_REMARK) {
		this.PRODUCE_REMARK = PRODUCE_REMARK;
	}

	/**
	 * 获取茶树编号
	 * 
	 * @return 茶树编号
	 */
	public Integer getTREE_ID() {
		return this.TREE_ID;
	}

	/**
	 * 设置茶树编号
	 * 
	 * @param TREE_ID
	 *            茶树编号
	 */
	public void setTREE_ID(Integer TREE_ID) {
		this.TREE_ID = TREE_ID;
	}

	@Override
	public String toString() {
		return "TeaProduce [ID=" + ID + ", NAME=" + NAME + ", PRODUCE_IN_PROCESS=" + PRODUCE_IN_PROCESS
				+ ", PRODUCE_START_TIME=" + PRODUCE_START_TIME + ", PRODUCE_ORIGIN=" + PRODUCE_ORIGIN
				+ ", PRODUCE_TYPE=" + PRODUCE_TYPE + ", PRODUCE_LEVEL=" + PRODUCE_LEVEL + ", PRODUCE_REMARK="
				+ PRODUCE_REMARK + ", TREE_ID=" + TREE_ID + "]";
	}
}