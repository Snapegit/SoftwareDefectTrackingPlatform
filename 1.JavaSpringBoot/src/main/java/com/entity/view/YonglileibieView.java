package com.entity.view;

import com.entity.YonglileibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 用例类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@TableName("yonglileibie")
public class YonglileibieView  extends YonglileibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonglileibieView(){
	}
 
 	public YonglileibieView(YonglileibieEntity yonglileibieEntity){
 	try {
			BeanUtils.copyProperties(this, yonglileibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
