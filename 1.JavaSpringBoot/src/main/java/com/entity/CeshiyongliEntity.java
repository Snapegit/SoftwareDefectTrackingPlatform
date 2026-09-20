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
 * 测试用例
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@TableName("ceshiyongli")
public class CeshiyongliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshiyongliEntity() {
		
	}
	
	public CeshiyongliEntity(T t) {
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
	 * 用例名称
	 */
					
	private String yonglimingcheng;
	
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
	 * 设置：用例名称
	 */
	public void setYonglimingcheng(String yonglimingcheng) {
		this.yonglimingcheng = yonglimingcheng;
	}
	/**
	 * 获取：用例名称
	 */
	public String getYonglimingcheng() {
		return yonglimingcheng;
	}
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
