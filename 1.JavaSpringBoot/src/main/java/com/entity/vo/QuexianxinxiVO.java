package com.entity.vo;

import com.entity.QuexianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缺陷信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
public class QuexianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 缺陷类别
	 */
	
	private String quexianleibie;
		
	/**
	 * 缺陷图片
	 */
	
	private String quexiantupian;
		
	/**
	 * 缺陷描述
	 */
	
	private String quexianmiaoshu;
		
	/**
	 * 管理项目
	 */
	
	private String guanlixiangmu;
		
	/**
	 * 缺陷资料
	 */
	
	private String quexianziliao;
		
	/**
	 * 发现时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faxianshijian;
				
	
	/**
	 * 设置：缺陷类别
	 */
	 
	public void setQuexianleibie(String quexianleibie) {
		this.quexianleibie = quexianleibie;
	}
	
	/**
	 * 获取：缺陷类别
	 */
	public String getQuexianleibie() {
		return quexianleibie;
	}
				
	
	/**
	 * 设置：缺陷图片
	 */
	 
	public void setQuexiantupian(String quexiantupian) {
		this.quexiantupian = quexiantupian;
	}
	
	/**
	 * 获取：缺陷图片
	 */
	public String getQuexiantupian() {
		return quexiantupian;
	}
				
	
	/**
	 * 设置：缺陷描述
	 */
	 
	public void setQuexianmiaoshu(String quexianmiaoshu) {
		this.quexianmiaoshu = quexianmiaoshu;
	}
	
	/**
	 * 获取：缺陷描述
	 */
	public String getQuexianmiaoshu() {
		return quexianmiaoshu;
	}
				
	
	/**
	 * 设置：管理项目
	 */
	 
	public void setGuanlixiangmu(String guanlixiangmu) {
		this.guanlixiangmu = guanlixiangmu;
	}
	
	/**
	 * 获取：管理项目
	 */
	public String getGuanlixiangmu() {
		return guanlixiangmu;
	}
				
	
	/**
	 * 设置：缺陷资料
	 */
	 
	public void setQuexianziliao(String quexianziliao) {
		this.quexianziliao = quexianziliao;
	}
	
	/**
	 * 获取：缺陷资料
	 */
	public String getQuexianziliao() {
		return quexianziliao;
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
			
}
