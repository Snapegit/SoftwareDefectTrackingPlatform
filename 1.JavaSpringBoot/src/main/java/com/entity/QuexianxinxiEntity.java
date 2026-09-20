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
 * 缺陷信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
@TableName("quexianxinxi")
public class QuexianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuexianxinxiEntity() {
		
	}
	
	public QuexianxinxiEntity(T t) {
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
	 * 缺陷名称
	 */
					
	private String quexianmingcheng;
	
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
	 * 设置：缺陷名称
	 */
	public void setQuexianmingcheng(String quexianmingcheng) {
		this.quexianmingcheng = quexianmingcheng;
	}
	/**
	 * 获取：缺陷名称
	 */
	public String getQuexianmingcheng() {
		return quexianmingcheng;
	}
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
