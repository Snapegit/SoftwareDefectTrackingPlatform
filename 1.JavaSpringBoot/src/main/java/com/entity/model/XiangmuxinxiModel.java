package com.entity.model;

import com.entity.XiangmuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 项目信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public class XiangmuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类别
	 */
	
	private String xiangmuleibie;
		
	/**
	 * 项目图片
	 */
	
	private String xiangmutupian;
		
	/**
	 * 项目介绍
	 */
	
	private String xiangmujieshao;
		
	/**
	 * 项目资料
	 */
	
	private String xiangmuziliao;
		
	/**
	 * 创建时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianshijian;
				
	
	/**
	 * 设置：项目类别
	 */
	 
	public void setXiangmuleibie(String xiangmuleibie) {
		this.xiangmuleibie = xiangmuleibie;
	}
	
	/**
	 * 获取：项目类别
	 */
	public String getXiangmuleibie() {
		return xiangmuleibie;
	}
				
	
	/**
	 * 设置：项目图片
	 */
	 
	public void setXiangmutupian(String xiangmutupian) {
		this.xiangmutupian = xiangmutupian;
	}
	
	/**
	 * 获取：项目图片
	 */
	public String getXiangmutupian() {
		return xiangmutupian;
	}
				
	
	/**
	 * 设置：项目介绍
	 */
	 
	public void setXiangmujieshao(String xiangmujieshao) {
		this.xiangmujieshao = xiangmujieshao;
	}
	
	/**
	 * 获取：项目介绍
	 */
	public String getXiangmujieshao() {
		return xiangmujieshao;
	}
				
	
	/**
	 * 设置：项目资料
	 */
	 
	public void setXiangmuziliao(String xiangmuziliao) {
		this.xiangmuziliao = xiangmuziliao;
	}
	
	/**
	 * 获取：项目资料
	 */
	public String getXiangmuziliao() {
		return xiangmuziliao;
	}
				
	
	/**
	 * 设置：创建时间
	 */
	 
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
			
}
