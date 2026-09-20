package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuexianwentiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuexianwentiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuexianwentiView;


/**
 * 缺陷问题
 *
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
public interface QuexianwentiService extends IService<QuexianwentiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuexianwentiVO> selectListVO(Wrapper<QuexianwentiEntity> wrapper);
   	
   	QuexianwentiVO selectVO(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);
   	
   	List<QuexianwentiView> selectListView(Wrapper<QuexianwentiEntity> wrapper);
   	
   	QuexianwentiView selectView(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuexianwentiEntity> wrapper);

   	

}

