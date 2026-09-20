package com.dao;

import com.entity.QuexianleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuexianleibieVO;
import com.entity.view.QuexianleibieView;


/**
 * 缺陷类别
 * 
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
public interface QuexianleibieDao extends BaseMapper<QuexianleibieEntity> {
	
	List<QuexianleibieVO> selectListVO(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);
	
	QuexianleibieVO selectVO(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);
	
	List<QuexianleibieView> selectListView(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);

	List<QuexianleibieView> selectListView(Pagination page,@Param("ew") Wrapper<QuexianleibieEntity> wrapper);

	
	QuexianleibieView selectView(@Param("ew") Wrapper<QuexianleibieEntity> wrapper);
	

}
