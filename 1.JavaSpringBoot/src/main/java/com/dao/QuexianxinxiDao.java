package com.dao;

import com.entity.QuexianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuexianxinxiVO;
import com.entity.view.QuexianxinxiView;


/**
 * 缺陷信息
 * 
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
public interface QuexianxinxiDao extends BaseMapper<QuexianxinxiEntity> {
	
	List<QuexianxinxiVO> selectListVO(@Param("ew") Wrapper<QuexianxinxiEntity> wrapper);
	
	QuexianxinxiVO selectVO(@Param("ew") Wrapper<QuexianxinxiEntity> wrapper);
	
	List<QuexianxinxiView> selectListView(@Param("ew") Wrapper<QuexianxinxiEntity> wrapper);

	List<QuexianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QuexianxinxiEntity> wrapper);

	
	QuexianxinxiView selectView(@Param("ew") Wrapper<QuexianxinxiEntity> wrapper);
	

}
