package com.dao;

import com.entity.QuexianwentiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuexianwentiVO;
import com.entity.view.QuexianwentiView;


/**
 * 缺陷问题
 * 
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
public interface QuexianwentiDao extends BaseMapper<QuexianwentiEntity> {
	
	List<QuexianwentiVO> selectListVO(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);
	
	QuexianwentiVO selectVO(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);
	
	List<QuexianwentiView> selectListView(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);

	List<QuexianwentiView> selectListView(Pagination page,@Param("ew") Wrapper<QuexianwentiEntity> wrapper);

	
	QuexianwentiView selectView(@Param("ew") Wrapper<QuexianwentiEntity> wrapper);
	

}
