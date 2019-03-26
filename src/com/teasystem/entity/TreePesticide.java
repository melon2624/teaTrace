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
 * view_treepesticide
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TreePesticide {
	/** 农事活动编号 */
	private Integer ID;

	/** 姓名 */
	private String NAME;

	/** 茶树编号 */
	private Integer TREE_ID;

	/** 农事种类 */
	private Integer FARM_TYPE;

	/** 农事时间 */
	private Date FARM_TIME;

	/** 操作方式 */
	private String FARM_MODE;

	/** 农事活动备注 */
	private String FARM_REMARK;

	/** 农药名称 */
	private String PESTI_NAME;

	/** 农药成分 */
	private String PESTI_CONTENT;

	/** 农药用量 */
	private String PESTI_AMOUNT;

	/** 打药方法 */
	private String PESTI_TYPE;

	/**
	 * 获取农事活动编号
	 * 
	 * @return 农事活动编号
	 */
	public Integer getID() {
		return this.ID;
	}

	/**
	 * 设置农事活动编号
	 * 
	 * @param ID
	 *            农事活动编号
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

	/**
	 * 获取农事种类
	 * 
	 * @return 农事种类
	 */
	public Integer getFARM_TYPE() {
		return this.FARM_TYPE;
	}

	/**
	 * 设置农事种类
	 * 
	 * @param FARM_TYPE
	 *            农事种类
	 */
	public void setFARM_TYPE(Integer FARM_TYPE) {
		this.FARM_TYPE = FARM_TYPE;
	}

	/**
	 * 获取农事时间
	 * 
	 * @return 农事时间
	 */
	public Date getFARM_TIME() {
		return this.FARM_TIME;
	}

	/**
	 * 设置农事时间
	 * 
	 * @param FARM_TIME
	 *            农事时间
	 */
	public void setFARM_TIME(Date FARM_TIME) {
		this.FARM_TIME = FARM_TIME;
	}

	/**
	 * 获取操作方式
	 * 
	 * @return 操作方式
	 */
	public String getFARM_MODE() {
		return this.FARM_MODE;
	}

	/**
	 * 设置操作方式
	 * 
	 * @param FARM_MODE
	 *            操作方式
	 */
	public void setFARM_MODE(String FARM_MODE) {
		this.FARM_MODE = FARM_MODE;
	}

	/**
	 * 获取农事活动备注
	 * 
	 * @return 农事活动备注
	 */
	public String getFARM_REMARK() {
		return this.FARM_REMARK;
	}

	/**
	 * 设置农事活动备注
	 * 
	 * @param FARM_REMARK
	 *            农事活动备注
	 */
	public void setFARM_REMARK(String FARM_REMARK) {
		this.FARM_REMARK = FARM_REMARK;
	}

	/**
	 * 获取农药名称
	 * 
	 * @return 农药名称
	 */
	public String getPESTI_NAME() {
		return this.PESTI_NAME;
	}

	/**
	 * 设置农药名称
	 * 
	 * @param PESTI_NAME
	 *            农药名称
	 */
	public void setPESTI_NAME(String PESTI_NAME) {
		this.PESTI_NAME = PESTI_NAME;
	}

	/**
	 * 获取农药成分
	 * 
	 * @return 农药成分
	 */
	public String getPESTI_CONTENT() {
		return this.PESTI_CONTENT;
	}

	/**
	 * 设置农药成分
	 * 
	 * @param PESTI_CONTENT
	 *            农药成分
	 */
	public void setPESTI_CONTENT(String PESTI_CONTENT) {
		this.PESTI_CONTENT = PESTI_CONTENT;
	}

	/**
	 * 获取农药用量
	 * 
	 * @return 农药用量
	 */
	public String getPESTI_AMOUNT() {
		return this.PESTI_AMOUNT;
	}

	/**
	 * 设置农药用量
	 * 
	 * @param PESTI_AMOUNT
	 *            农药用量
	 */
	public void setPESTI_AMOUNT(String PESTI_AMOUNT) {
		this.PESTI_AMOUNT = PESTI_AMOUNT;
	}

	/**
	 * 获取打药方法
	 * 
	 * @return 打药方法
	 */
	public String getPESTI_TYPE() {
		return this.PESTI_TYPE;
	}

	/**
	 * 设置打药方法
	 * 
	 * @param PESTI_TYPE
	 *            打药方法
	 */
	public void setPESTI_TYPE(String PESTI_TYPE) {
		this.PESTI_TYPE = PESTI_TYPE;
	}

	@Override
	public String toString() {
		return "TreePesticide [ID=" + ID + ", NAME=" + NAME + ", TREE_ID=" + TREE_ID + ", FARM_TYPE=" + FARM_TYPE
				+ ", FARM_TIME=" + FARM_TIME + ", FARM_MODE=" + FARM_MODE + ", FARM_REMARK=" + FARM_REMARK
				+ ", PESTI_NAME=" + PESTI_NAME + ", PESTI_CONTENT=" + PESTI_CONTENT + ", PESTI_AMOUNT=" + PESTI_AMOUNT
				+ ", PESTI_TYPE=" + PESTI_TYPE + "]";
	}
}