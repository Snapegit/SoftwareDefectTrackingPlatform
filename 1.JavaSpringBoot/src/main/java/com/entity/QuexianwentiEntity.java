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
 * 缺陷问题
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
@TableName("quexianwenti")
public class QuexianwentiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuexianwentiEntity() {
		
	}
	
	public QuexianwentiEntity(T t) {
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
	 * 问题名称
	 */
					
	private String wentimingcheng;
	
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
	 * 设置：问题名称
	 */
	public void setWentimingcheng(String wentimingcheng) {
		this.wentimingcheng = wentimingcheng;
	}
	/**
	 * 获取：问题名称
	 */
	public String getWentimingcheng() {
		return wentimingcheng;
	}
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
