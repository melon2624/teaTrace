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
 * view_teainspect
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class TeaInspect {
	/** 产品追溯编号 */
	private String PRODUCT_QR_CODE;

	/** 姓名 */
	private String NAME;

	/** 检验时间 */
	private Date INSPECT_TIME;

	/** 产品质量 */
	private String INSPECT_LEVEL;

	/** 农药含量 */
	private String INSPECT_PESTICIDE_CONTENT;

	/** 检验评语 */
	private String INSPECT_COMMENT;

	/** 生产编号 */
	private Integer PRODUCE_ID;

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
	 * 获取检验时间
	 * 
	 * @return 检验时间
	 */
	public Date getINSPECT_TIME() {
		return this.INSPECT_TIME;
	}

	/**
	 * 设置检验时间
	 * 
	 * @param INSPECT_TIME
	 *            检验时间
	 */
	public void setINSPECT_TIME(Date INSPECT_TIME) {
		this.INSPECT_TIME = INSPECT_TIME;
	}

	/**
	 * 获取产品质量
	 * 
	 * @return 产品质量
	 */
	public String getINSPECT_LEVEL() {
		return this.INSPECT_LEVEL;
	}

	/**
	 * 设置产品质量
	 * 
	 * @param INSPECT_LEVEL
	 *            产品质量
	 */
	public void setINSPECT_LEVEL(String INSPECT_LEVEL) {
		this.INSPECT_LEVEL = INSPECT_LEVEL;
	}

	/**
	 * 获取农药含量
	 * 
	 * @return 农药含量
	 */
	public String getINSPECT_PESTICIDE_CONTENT() {
		return this.INSPECT_PESTICIDE_CONTENT;
	}

	/**
	 * 设置农药含量
	 * 
	 * @param INSPECT_PESTICIDE_CONTENT
	 *            农药含量
	 */
	public void setINSPECT_PESTICIDE_CONTENT(String INSPECT_PESTICIDE_CONTENT) {
		this.INSPECT_PESTICIDE_CONTENT = INSPECT_PESTICIDE_CONTENT;
	}

	/**
	 * 获取检验评语
	 * 
	 * @return 检验评语
	 */
	public String getINSPECT_COMMENT() {
		return this.INSPECT_COMMENT;
	}

	/**
	 * 设置检验评语
	 * 
	 * @param INSPECT_COMMENT
	 *            检验评语
	 */
	public void setINSPECT_COMMENT(String INSPECT_COMMENT) {
		this.INSPECT_COMMENT = INSPECT_COMMENT;
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
		return "TeaInspect [PRODUCT_QR_CODE=" + PRODUCT_QR_CODE + ", NAME=" + NAME + ", INSPECT_TIME=" + INSPECT_TIME
				+ ", INSPECT_LEVEL=" + INSPECT_LEVEL + ", INSPECT_PESTICIDE_CONTENT=" + INSPECT_PESTICIDE_CONTENT
				+ ", INSPECT_COMMENT=" + INSPECT_COMMENT + ", PRODUCE_ID=" + PRODUCE_ID + "]";
	}
}