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
 * view_treepick
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TreePick {
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

	/** 茶树年龄 */
	private Integer PICK_TREE_AGE;

	/** 重量 */
	private Float PICK_WEIGHT;

	/** 采摘部位 */
	private String PICK_PART;

	/** 采摘方法 */
	private String PICK_STANDARD;

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
	 * 获取茶树年龄
	 * 
	 * @return 茶树年龄
	 */
	public Integer getPICK_TREE_AGE() {
		return this.PICK_TREE_AGE;
	}

	/**
	 * 设置茶树年龄
	 * 
	 * @param PICK_TREE_AGE
	 *            茶树年龄
	 */
	public void setPICK_TREE_AGE(Integer PICK_TREE_AGE) {
		this.PICK_TREE_AGE = PICK_TREE_AGE;
	}

	/**
	 * 获取重量
	 * 
	 * @return 重量
	 */
	public Float getPICK_WEIGHT() {
		return this.PICK_WEIGHT;
	}

	/**
	 * 设置重量
	 * 
	 * @param PICK_WEIGHT
	 *            重量
	 */
	public void setPICK_WEIGHT(Float PICK_WEIGHT) {
		this.PICK_WEIGHT = PICK_WEIGHT;
	}

	/**
	 * 获取采摘部位
	 * 
	 * @return 采摘部位
	 */
	public String getPICK_PART() {
		return this.PICK_PART;
	}

	/**
	 * 设置采摘部位
	 * 
	 * @param PICK_PART
	 *            采摘部位
	 */
	public void setPICK_PART(String PICK_PART) {
		this.PICK_PART = PICK_PART;
	}

	/**
	 * 获取采摘方法
	 * 
	 * @return 采摘方法
	 */
	public String getPICK_STANDARD() {
		return this.PICK_STANDARD;
	}

	/**
	 * 设置采摘方法
	 * 
	 * @param PICK_STANDARD
	 *            采摘方法
	 */
	public void setPICK_STANDARD(String PICK_STANDARD) {
		this.PICK_STANDARD = PICK_STANDARD;
	}

	@Override
	public String toString() {
		return "TreePick [ID=" + ID + ", NAME=" + NAME + ", TREE_ID=" + TREE_ID + ", FARM_TYPE=" + FARM_TYPE
				+ ", FARM_TIME=" + FARM_TIME + ", FARM_MODE=" + FARM_MODE + ", FARM_REMARK=" + FARM_REMARK
				+ ", PICK_TREE_AGE=" + PICK_TREE_AGE + ", PICK_WEIGHT=" + PICK_WEIGHT + ", PICK_PART=" + PICK_PART
				+ ", PICK_STANDARD=" + PICK_STANDARD + "]";
	}
}