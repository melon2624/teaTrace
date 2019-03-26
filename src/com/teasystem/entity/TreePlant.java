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
 * view_treeplant
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TreePlant {
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

	/** 是否铺草 */
	private String SWARD;

	/** 是否嫁接 */
	private String GRAFTING;

	/** 栽种天气 */
	private String PLANT_WEATHER;

	/** 间种作物 */
	private String INTERPLANT;

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
	 * 获取是否铺草
	 * 
	 * @return 是否铺草
	 */
	public String getSWARD() {
		return this.SWARD;
	}

	/**
	 * 设置是否铺草
	 * 
	 * @param SWARD
	 *            是否铺草
	 */
	public void setSWARD(String SWARD) {
		this.SWARD = SWARD;
	}

	/**
	 * 获取是否嫁接
	 * 
	 * @return 是否嫁接
	 */
	public String getGRAFTING() {
		return this.GRAFTING;
	}

	/**
	 * 设置是否嫁接
	 * 
	 * @param GRAFTING
	 *            是否嫁接
	 */
	public void setGRAFTING(String GRAFTING) {
		this.GRAFTING = GRAFTING;
	}

	/**
	 * 获取栽种天气
	 * 
	 * @return 栽种天气
	 */
	public String getPLANT_WEATHER() {
		return this.PLANT_WEATHER;
	}

	/**
	 * 设置栽种天气
	 * 
	 * @param PLANT_WEATHER
	 *            栽种天气
	 */
	public void setPLANT_WEATHER(String PLANT_WEATHER) {
		this.PLANT_WEATHER = PLANT_WEATHER;
	}

	/**
	 * 获取间种作物
	 * 
	 * @return 间种作物
	 */
	public String getINTERPLANT() {
		return this.INTERPLANT;
	}

	/**
	 * 设置间种作物
	 * 
	 * @param INTERPLANT
	 *            间种作物
	 */
	public void setINTERPLANT(String INTERPLANT) {
		this.INTERPLANT = INTERPLANT;
	}

	@Override
	public String toString() {
		return "TreePlant [ID=" + ID + ", NAME=" + NAME + ", TREE_ID=" + TREE_ID + ", FARM_TYPE=" + FARM_TYPE
				+ ", FARM_TIME=" + FARM_TIME + ", FARM_MODE=" + FARM_MODE + ", FARM_REMARK=" + FARM_REMARK + ", SWARD="
				+ SWARD + ", GRAFTING=" + GRAFTING + ", PLANT_WEATHER=" + PLANT_WEATHER + ", INTERPLANT=" + INTERPLANT
				+ "]";
	}
}