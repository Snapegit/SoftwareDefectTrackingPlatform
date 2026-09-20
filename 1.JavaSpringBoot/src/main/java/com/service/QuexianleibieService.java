package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuexianleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuexianleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuexianleibieView;


/**
 * 缺陷类别
 *
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public interface QuexianleibieService extends IService<QuexianleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuexianleibieVO> selectListVO(Wrapper<QuexianleibieEntity> wrapper);
   	
   	QuexianleibieVO selectVO(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);
   	
   	List<QuexianleibieView> selectListView(Wrapper<QuexianleibieEntity> wrapper);
   	
   	QuexianleibieView selectView(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuexianleibieEntity> wrapper);

   	

}

