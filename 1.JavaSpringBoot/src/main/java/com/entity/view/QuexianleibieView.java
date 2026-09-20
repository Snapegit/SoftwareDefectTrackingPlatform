package com.entity.view;

import com.entity.QuexianleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 缺陷类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@TableName("quexianleibie")
public class QuexianleibieView  extends QuexianleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuexianleibieView(){
	}
 
 	public QuexianleibieView(QuexianleibieEntity quexianleibieEntity){
 	try {
			BeanUtils.copyProperties(this, quexianleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
