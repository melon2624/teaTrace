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
 * view_blockenv
 * 
 * @author bianj
 * @version 1.0.0 2018-05-06
 */
public class BlockEnv {
	/** 茶园名称 */
	private Integer ID;
	
	/** 茶园名称 */
	private String BLOCK_NAME;

	/** 记录时间 */
	private Date ENV_TIME;

	/** 土壤温度 */
	private Float SOIL_TEMP;

	/** 土壤湿度 */
	private Float SOIL_HUMIDITY;

	/** 空气温度 */
	private Float ENV_TEMP;

	/** 空气湿度 */
	private Float ENV_HUMIDITY;

	/** 日降水量 */
	private Float ENV_RAINFALL;

    /**
     * 获取茶园编号
     * 
     * @return 茶园编号
     */
    public Integer getID() {
        return this.ID;
    }

    /**
     * 设置茶园编号
     * 
     * @param ID
     *          茶园编号
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
	 * 获取记录时间
	 * 
	 * @return 记录时间
	 */
	public Date getENV_TIME() {
		return this.ENV_TIME;
	}

	/**
	 * 设置记录时间
	 * 
	 * @param ENV_TIME
	 *            记录时间
	 */
	public void setENV_TIME(Date ENV_TIME) {
		this.ENV_TIME = ENV_TIME;
	}

	/**
	 * 获取土壤温度
	 * 
	 * @return 土壤温度
	 */
	public Float getSOIL_TEMP() {
		return this.SOIL_TEMP;
	}

	/**
	 * 设置土壤温度
	 * 
	 * @param SOIL_TEMP
	 *            土壤温度
	 */
	public void setSOIL_TEMP(Float SOIL_TEMP) {
		this.SOIL_TEMP = SOIL_TEMP;
	}

	/**
	 * 获取土壤湿度
	 * 
	 * @return 土壤湿度
	 */
	public Float getSOIL_HUMIDITY() {
		return this.SOIL_HUMIDITY;
	}

	/**
	 * 设置土壤湿度
	 * 
	 * @param SOIL_HUMIDITY
	 *            土壤湿度
	 */
	public void setSOIL_HUMIDITY(Float SOIL_HUMIDITY) {
		this.SOIL_HUMIDITY = SOIL_HUMIDITY;
	}

	/**
	 * 获取空气温度
	 * 
	 * @return 空气温度
	 */
	public Float getENV_TEMP() {
		return this.ENV_TEMP;
	}

	/**
	 * 设置空气温度
	 * 
	 * @param ENV_TEMP
	 *            空气温度
	 */
	public void setENV_TEMP(Float ENV_TEMP) {
		this.ENV_TEMP = ENV_TEMP;
	}

	/**
	 * 获取空气湿度
	 * 
	 * @return 空气湿度
	 */
	public Float getENV_HUMIDITY() {
		return this.ENV_HUMIDITY;
	}

	/**
	 * 设置空气湿度
	 * 
	 * @param ENV_HUMIDITY
	 *            空气湿度
	 */
	public void setENV_HUMIDITY(Float ENV_HUMIDITY) {
		this.ENV_HUMIDITY = ENV_HUMIDITY;
	}

	/**
	 * 获取日降水量
	 * 
	 * @return 日降水量
	 */
	public Float getENV_RAINFALL() {
		return this.ENV_RAINFALL;
	}

	/**
	 * 设置日降水量
	 * 
	 * @param ENV_RAINFALL
	 *            日降水量
	 */
	public void setENV_RAINFALL(Float ENV_RAINFALL) {
		this.ENV_RAINFALL = ENV_RAINFALL;
	}

	@Override
	public String toString() {
		return "BlockEnv [ID=" + ID + ", BLOCK_NAME=" + BLOCK_NAME + ", ENV_TIME=" + ENV_TIME + ", SOIL_TEMP="
				+ SOIL_TEMP + ", SOIL_HUMIDITY=" + SOIL_HUMIDITY + ", ENV_TEMP=" + ENV_TEMP + ", ENV_HUMIDITY="
				+ ENV_HUMIDITY + ", ENV_RAINFALL=" + ENV_RAINFALL + "]";
	}
}