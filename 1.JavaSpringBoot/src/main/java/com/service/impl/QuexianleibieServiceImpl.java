package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QuexianleibieDao;
import com.entity.QuexianleibieEntity;
import com.service.QuexianleibieService;
import com.entity.vo.QuexianleibieVO;
import com.entity.view.QuexianleibieView;

@Service("quexianleibieService")
public class QuexianleibieServiceImpl extends ServiceImpl<QuexianleibieDao, QuexianleibieEntity> implements QuexianleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuexianleibieEntity> page = this.selectPage(
                new Query<QuexianleibieEntity>(params).getPage(),
                new EntityWrapper<QuexianleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuexianleibieEntity> wrapper) {
		  Page<QuexianleibieView> page =new Query<QuexianleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QuexianleibieVO> selectListVO(Wrapper<QuexianleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuexianleibieVO selectVO(Wrapper<QuexianleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuexianleibieView> selectListView(Wrapper<QuexianleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuexianleibieView selectView(Wrapper<QuexianleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
