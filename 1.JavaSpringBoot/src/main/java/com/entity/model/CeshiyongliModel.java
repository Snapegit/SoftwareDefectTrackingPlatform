package com.entity.model;

import com.entity.CeshiyongliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测试用例
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public class CeshiyongliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用例类别
	 */
	
	private String yonglileibie;
		
	/**
	 * 用例图片
	 */
	
	private String yonglitupian;
		
	/**
	 * 用例内容
	 */
	
	private String yonglineirong;
		
	/**
	 * 关联项目
	 */
	
	private String guanlianxiangmu;
		
	/**
	 * 用例资料
	 */
	
	private String yongliziliao;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：用例类别
	 */
	 
	public void setYonglileibie(String yonglileibie) {
		this.yonglileibie = yonglileibie;
	}
	
	/**
	 * 获取：用例类别
	 */
	public String getYonglileibie() {
		return yonglileibie;
	}
				
	
	/**
	 * 设置：用例图片
	 */
	 
	public void setYonglitupian(String yonglitupian) {
		this.yonglitupian = yonglitupian;
	}
	
	/**
	 * 获取：用例图片
	 */
	public String getYonglitupian() {
		return yonglitupian;
	}
				
	
	/**
	 * 设置：用例内容
	 */
	 
	public void setYonglineirong(String yonglineirong) {
		this.yonglineirong = yonglineirong;
	}
	
	/**
	 * 获取：用例内容
	 */
	public String getYonglineirong() {
		return yonglineirong;
	}
				
	
	/**
	 * 设置：关联项目
	 */
	 
	public void setGuanlianxiangmu(String guanlianxiangmu) {
		this.guanlianxiangmu = guanlianxiangmu;
	}
	
	/**
	 * 获取：关联项目
	 */
	public String getGuanlianxiangmu() {
		return guanlianxiangmu;
	}
				
	
	/**
	 * 设置：用例资料
	 */
	 
	public void setYongliziliao(String yongliziliao) {
		this.yongliziliao = yongliziliao;
	}
	
	/**
	 * 获取：用例资料
	 */
	public String getYongliziliao() {
		return yongliziliao;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
