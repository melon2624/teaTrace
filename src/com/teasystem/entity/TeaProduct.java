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
 * view_teaproduct
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TeaProduct {
	/** 茶叶名称 */
	private String TEA_TYPE_NAME;

	/** 产品追溯编号 */
	private String PRODUCT_QR_CODE;

	/** 生产产地 */
	private String PRODUCE_ORIGIN;

	/** 生产开始时间 */
	private Date PRODUCE_START_TIME;

	/** 生产日期 */
	private Date PRODUCT_TIME;

	/** 茶叶重量 */
	private String PRODUCT_WEIGHT;

	/** 茶叶简介 */
	private String TEA_INFO;

	/** 茶叶冲泡方法 */
	private String TEA_BREW_INFO;

	/** 生产编号 */
	private Integer PRODUCE_ID;

	/**
	 * 获取茶叶名称
	 * 
	 * @return 茶叶名称
	 */
	public String getTEA_TYPE_NAME() {
		return this.TEA_TYPE_NAME;
	}

	/**
	 * 设置茶叶名称
	 * 
	 * @param TEA_TYPE_NAME
	 *            茶叶名称
	 */
	public void setTEA_TYPE_NAME(String TEA_TYPE_NAME) {
		this.TEA_TYPE_NAME = TEA_TYPE_NAME;
	}

	/**
	 * 获取产品追溯编号
	 * 
	 * @return 产品追溯编号
	 */
	public String getPRODUCT_QR_CODE() {
		return this.PRODUCT_QR_CODE;
	}

	/**
	 * 设置产品追溯编号
	 * 
	 * @param PRODUCT_QR_CODE
	 *            产品追溯编号
	 */
	public void setPRODUCT_QR_CODE(String PRODUCT_QR_CODE) {
		this.PRODUCT_QR_CODE = PRODUCT_QR_CODE;
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
	 * 获取生产日期
	 * 
	 * @return 生产日期
	 */
	public Date getPRODUCT_TIME() {
		return this.PRODUCT_TIME;
	}

	/**
	 * 设置生产日期
	 * 
	 * @param PRODUCT_TIME
	 *            生产日期
	 */
	public void setPRODUCT_TIME(Date PRODUCT_TIME) {
		this.PRODUCT_TIME = PRODUCT_TIME;
	}

	/**
	 * 获取茶叶重量
	 * 
	 * @return 茶叶重量
	 */
	public String getPRODUCT_WEIGHT() {
		return this.PRODUCT_WEIGHT;
	}

	/**
	 * 设置茶叶重量
	 * 
	 * @param PRODUCT_WEIGHT
	 *            茶叶重量
	 */
	public void setPRODUCT_WEIGHT(String PRODUCT_WEIGHT) {
		this.PRODUCT_WEIGHT = PRODUCT_WEIGHT;
	}

	/**
	 * 获取茶叶简介
	 * 
	 * @return 茶叶简介
	 */
	public String getTEA_INFO() {
		return this.TEA_INFO;
	}

	/**
	 * 设置茶叶简介
	 * 
	 * @param TEA_INFO
	 *            茶叶简介
	 */
	public void setTEA_INFO(String TEA_INFO) {
		this.TEA_INFO = TEA_INFO;
	}

	/**
	 * 获取茶叶冲泡方法
	 * 
	 * @return 茶叶冲泡方法
	 */
	public String getTEA_BREW_INFO() {
		return this.TEA_BREW_INFO;
	}

	/**
	 * 设置茶叶冲泡方法
	 * 
	 * @param TEA_BREW_INFO
	 *            茶叶冲泡方法
	 */
	public void setTEA_BREW_INFO(String TEA_BREW_INFO) {
		this.TEA_BREW_INFO = TEA_BREW_INFO;
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

	@Override
	public String toString() {
		return "TeaProduct [TEA_TYPE_NAME=" + TEA_TYPE_NAME + ", PRODUCT_QR_CODE=" + PRODUCT_QR_CODE
				+ ", PRODUCE_ORIGIN=" + PRODUCE_ORIGIN + ", PRODUCE_START_TIME=" + PRODUCE_START_TIME
				+ ", PRODUCT_TIME=" + PRODUCT_TIME + ", PRODUCT_WEIGHT=" + PRODUCT_WEIGHT + ", TEA_INFO=" + TEA_INFO
				+ ", TEA_BREW_INFO=" + TEA_BREW_INFO + ", PRODUCE_ID=" + PRODUCE_ID + "]";
	}
}