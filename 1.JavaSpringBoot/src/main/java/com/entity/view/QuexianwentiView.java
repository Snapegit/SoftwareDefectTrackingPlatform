package com.entity.view;

import com.entity.QuexianwentiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 缺陷问题
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
@TableName("quexianwenti")
public class QuexianwentiView  extends QuexianwentiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuexianwentiView(){
	}
 
 	public QuexianwentiView(QuexianwentiEntity quexianwentiEntity){
 	try {
			BeanUtils.copyProperties(this, quexianwentiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
