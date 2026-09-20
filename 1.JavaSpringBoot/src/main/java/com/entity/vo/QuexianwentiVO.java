package com.entity.vo;

import com.entity.QuexianwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缺陷问题
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
public class QuexianwentiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问题描述
	 */
	
	private String wentimiaoshu;
		
	/**
	 * 问题图片
	 */
	
	private String wentitupian;
		
	/**
	 * 发现时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faxianshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 提出人
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：问题描述
	 */
	 
	public void setWentimiaoshu(String wentimiaoshu) {
		this.wentimiaoshu = wentimiaoshu;
	}
	
	/**
	 * 获取：问题描述
	 */
	public String getWentimiaoshu() {
		return wentimiaoshu;
	}
				
	
	/**
	 * 设置：问题图片
	 */
	 
	public void setWentitupian(String wentitupian) {
		this.wentitupian = wentitupian;
	}
	
	/**
	 * 获取：问题图片
	 */
	public String getWentitupian() {
		return wentitupian;
	}
				
	
	/**
	 * 设置：发现时间
	 */
	 
	public void setFaxianshijian(Date faxianshijian) {
		this.faxianshijian = faxianshijian;
	}
	
	/**
	 * 获取：发现时间
	 */
	public Date getFaxianshijian() {
		return faxianshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：提出人
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：提出人
	 */
	public String getXingming() {
		return xingming;
	}
			
}
