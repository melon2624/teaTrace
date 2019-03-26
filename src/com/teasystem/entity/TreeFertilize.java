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
 * view_treefertilize
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TreeFertilize {
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

	/** 肥料名称 */
	private String FERT_NAME;

	/** 肥料成分 */
	private String FERT_CONTENT;

	/** 肥料用量 */
	private String FERT_AMOUNT;

	/** 施肥方法 */
	private String FERT_METHOD;

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
	 * 获取肥料名称
	 * 
	 * @return 肥料名称
	 */
	public String getFERT_NAME() {
		return this.FERT_NAME;
	}

	/**
	 * 设置肥料名称
	 * 
	 * @param FERT_NAME
	 *            肥料名称
	 */
	public void setFERT_NAME(String FERT_NAME) {
		this.FERT_NAME = FERT_NAME;
	}

	/**
	 * 获取肥料成分
	 * 
	 * @return 肥料成分
	 */
	public String getFERT_CONTENT() {
		return this.FERT_CONTENT;
	}

	/**
	 * 设置肥料成分
	 * 
	 * @param FERT_CONTENT
	 *            肥料成分
	 */
	public void setFERT_CONTENT(String FERT_CONTENT) {
		this.FERT_CONTENT = FERT_CONTENT;
	}

	/**
	 * 获取肥料用量
	 * 
	 * @return 肥料用量
	 */
	public String getFERT_AMOUNT() {
		return this.FERT_AMOUNT;
	}

	/**
	 * 设置肥料用量
	 * 
	 * @param FERT_AMOUNT
	 *            肥料用量
	 */
	public void setFERT_AMOUNT(String FERT_AMOUNT) {
		this.FERT_AMOUNT = FERT_AMOUNT;
	}

	/**
	 * 获取施肥方法
	 * 
	 * @return 施肥方法
	 */
	public String getFERT_METHOD() {
		return this.FERT_METHOD;
	}

	/**
	 * 设置施肥方法
	 * 
	 * @param FERT_METHOD
	 *            施肥方法
	 */
	public void setFERT_METHOD(String FERT_METHOD) {
		this.FERT_METHOD = FERT_METHOD;
	}

	@Override
	public String toString() {
		return "TreeFertilize [ID=" + ID + ", NAME=" + NAME + ", TREE_ID=" + TREE_ID + ", FARM_TYPE=" + FARM_TYPE
				+ ", FARM_TIME=" + FARM_TIME + ", FARM_MODE=" + FARM_MODE + ", FARM_REMARK=" + FARM_REMARK
				+ ", FERT_NAME=" + FERT_NAME + ", FERT_CONTENT=" + FERT_CONTENT + ", FERT_AMOUNT=" + FERT_AMOUNT
				+ ", FERT_METHOD=" + FERT_METHOD + "]";
	}
}