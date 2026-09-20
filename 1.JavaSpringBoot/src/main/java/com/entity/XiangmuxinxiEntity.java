package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 项目信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@TableName("xiangmuxinxi")
public class XiangmuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmuxinxiEntity() {
		
	}
	
	public XiangmuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
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
