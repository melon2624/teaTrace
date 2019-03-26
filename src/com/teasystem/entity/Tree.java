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

/**
 * view_tree
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class Tree {
	/** 茶树编号 */
	private Integer ID;

	/** 茶园名称 */
	private String BLOCK_NAME;
	
	/** 茶园编号 */
	private Integer BLOCK_ID;

	/** 企业名称 */
	private String COMPANY;

	/** 茶园地形 */
	private String TOPOGRAPHY;

	/** 茶园地址 */
	private String LOCATION;

	/** 茶园简介 */
	private String BLOCK_INFO;

	/** 茶树品种名称 */
	private String TREE_TYPE_NAME;

	/** 品种产地 */
	private String TREE_ORIGIN;

	/** 适制茶类 */
	private String PRODUCT_TEA;

	/** 形态特征 */
	private String MORPH_CHARACT;

	/** 栽培要点 */
	private String PLANT_IMPORTANT;

	/**
	 * 获取茶树编号
	 * 
	 * @return 茶树编号
	 */
	public Integer getID() {
		return this.ID;
	}

	/**
	 * 设置茶树编号
	 * 
	 * @param ID
	 *            茶树编号
	 */
	public void setID(Integer ID) {
		this.ID = ID;
	}

	/**
	 * 获取茶园名称
	 * 
	 * @return 茶园名称
	 */
	public String getBLOCK_NAME() {
		return this.BLOCK_NAME;
	}

	/**
	 * 设置茶园名称
	 * 
	 * @param BLOCK_NAME
	 *            茶园名称
	 */
	public void setBLOCK_NAME(String BLOCK_NAME) {
		this.BLOCK_NAME = BLOCK_NAME;
	}

	/**
	 * 获取企业名称
	 * 
	 * @return 企业名称
	 */
	public String getCOMPANY() {
		return this.COMPANY;
	}

	/**
	 * 设置企业名称
	 * 
	 * @param COMPANY
	 *            企业名称
	 */
	public void setCOMPANY(String COMPANY) {
		this.COMPANY = COMPANY;
	}

	/**
	 * 获取茶园地形
	 * 
	 * @return 茶园地形
	 */
	public String getTOPOGRAPHY() {
		return this.TOPOGRAPHY;
	}

	/**
	 * 设置茶园地形
	 * 
	 * @param TOPOGRAPHY
	 *            茶园地形
	 */
	public void setTOPOGRAPHY(String TOPOGRAPHY) {
		this.TOPOGRAPHY = TOPOGRAPHY;
	}

	/**
	 * 获取茶园地址
	 * 
	 * @return 茶园地址
	 */
	public String getLOCATION() {
		return this.LOCATION;
	}

	/**
	 * 设置茶园地址
	 * 
	 * @param LOCATION
	 *            茶园地址
	 */
	public void setLOCATION(String LOCATION) {
		this.LOCATION = LOCATION;
	}

	/**
	 * 获取茶园简介
	 * 
	 * @return 茶园简介
	 */
	public String getBLOCK_INFO() {
		return this.BLOCK_INFO;
	}

	/**
	 * 设置茶园简介
	 * 
	 * @param BLOCK_INFO
	 *            茶园简介
	 */
	public void setBLOCK_INFO(String BLOCK_INFO) {
		this.BLOCK_INFO = BLOCK_INFO;
	}

	/**
	 * 获取茶树品种名称
	 * 
	 * @return 茶树品种名称
	 */
	public String getTREE_TYPE_NAME() {
		return this.TREE_TYPE_NAME;
	}

	/**
	 * 设置茶树品种名称
	 * 
	 * @param TREE_TYPE_NAME
	 *            茶树品种名称
	 */
	public void setTREE_TYPE_NAME(String TREE_TYPE_NAME) {
		this.TREE_TYPE_NAME = TREE_TYPE_NAME;
	}

	/**
	 * 获取品种产地
	 * 
	 * @return 品种产地
	 */
	public String getTREE_ORIGIN() {
		return this.TREE_ORIGIN;
	}

	/**
	 * 设置品种产地
	 * 
	 * @param TREE_ORIGIN
	 *            品种产地
	 */
	public void setTREE_ORIGIN(String TREE_ORIGIN) {
		this.TREE_ORIGIN = TREE_ORIGIN;
	}

	/**
	 * 获取适制茶类
	 * 
	 * @return 适制茶类
	 */
	public String getPRODUCT_TEA() {
		return this.PRODUCT_TEA;
	}

	/**
	 * 设置适制茶类
	 * 
	 * @param PRODUCT_TEA
	 *            适制茶类
	 */
	public void setPRODUCT_TEA(String PRODUCT_TEA) {
		this.PRODUCT_TEA = PRODUCT_TEA;
	}

	/**
	 * 获取形态特征
	 * 
	 * @return 形态特征
	 */
	public String getMORPH_CHARACT() {
		return this.MORPH_CHARACT;
	}

	/**
	 * 设置形态特征
	 * 
	 * @param MORPH_CHARACT
	 *            形态特征
	 */
	public void setMORPH_CHARACT(String MORPH_CHARACT) {
		this.MORPH_CHARACT = MORPH_CHARACT;
	}

	/**
	 * 获取栽培要点
	 * 
	 * @return 栽培要点
	 */
	public String getPLANT_IMPORTANT() {
		return this.PLANT_IMPORTANT;
	}

	/**
	 * 设置栽培要点
	 * 
	 * @param PLANT_IMPORTANT
	 *            栽培要点
	 */
	public void setPLANT_IMPORTANT(String PLANT_IMPORTANT) {
		this.PLANT_IMPORTANT = PLANT_IMPORTANT;
	}
	
	public void setBLOCK_ID(Integer BLOCK_ID)
	{
		this.BLOCK_ID=BLOCK_ID;
	}
	
	public Integer getBLOCK_ID()
	{
		return this.BLOCK_ID;
	}

	@Override
	public String toString() {
		return "Tree [ID=" + ID + ", BLOCK_NAME=" + BLOCK_NAME + ", COMPANY=" + COMPANY + ", TOPOGRAPHY=" + TOPOGRAPHY
				+ ", LOCATION=" + LOCATION + ", BLOCK_INFO=" + BLOCK_INFO + ", TREE_TYPE_NAME=" + TREE_TYPE_NAME
				+ ", TREE_ORIGIN=" + TREE_ORIGIN + ", PRODUCT_TEA=" + PRODUCT_TEA + ", MORPH_CHARACT=" + MORPH_CHARACT
				+ ", PLANT_IMPORTANT=" + PLANT_IMPORTANT + "]";
	}
}