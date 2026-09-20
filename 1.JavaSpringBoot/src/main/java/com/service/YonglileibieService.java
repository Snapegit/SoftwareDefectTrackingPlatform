package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonglileibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonglileibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonglileibieView;


/**
 * 用例类别
 *
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public interface YonglileibieService extends IService<YonglileibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonglileibieVO> selectListVO(Wrapper<YonglileibieEntity> wrapper);
   	
   	YonglileibieVO selectVO(@Param("ew") Wrapper<YonglileibieEntity> wrapper);
   	
   	List<YonglileibieView> selectListView(Wrapper<YonglileibieEntity> wrapper);
   	
   	YonglileibieView selectView(@Param("ew") Wrapper<YonglileibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonglileibieEntity> wrapper);

   	

}

