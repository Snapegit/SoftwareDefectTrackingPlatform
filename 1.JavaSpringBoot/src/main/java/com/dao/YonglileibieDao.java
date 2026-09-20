package com.dao;

import com.entity.YonglileibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonglileibieVO;
import com.entity.view.YonglileibieView;


/**
 * 用例类别
 * 
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public interface YonglileibieDao extends BaseMapper<YonglileibieEntity> {
	
	List<YonglileibieVO> selectListVO(@Param("ew") Wrapper<YonglileibieEntity> wrapper);
	
	YonglileibieVO selectVO(@Param("ew") Wrapper<YonglileibieEntity> wrapper);
	
	List<YonglileibieView> selectListView(@Param("ew") Wrapper<YonglileibieEntity> wrapper);

	List<YonglileibieView> selectListView(Pagination page,@Param("ew") Wrapper<YonglileibieEntity> wrapper);

	
	YonglileibieView selectView(@Param("ew") Wrapper<YonglileibieEntity> wrapper);
	

}
