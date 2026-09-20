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


import com.dao.YonglileibieDao;
import com.entity.YonglileibieEntity;
import com.service.YonglileibieService;
import com.entity.vo.YonglileibieVO;
import com.entity.view.YonglileibieView;

@Service("yonglileibieService")
public class YonglileibieServiceImpl extends ServiceImpl<YonglileibieDao, YonglileibieEntity> implements YonglileibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonglileibieEntity> page = this.selectPage(
                new Query<YonglileibieEntity>(params).getPage(),
                new EntityWrapper<YonglileibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonglileibieEntity> wrapper) {
		  Page<YonglileibieView> page =new Query<YonglileibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YonglileibieVO> selectListVO(Wrapper<YonglileibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonglileibieVO selectVO(Wrapper<YonglileibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonglileibieView> selectListView(Wrapper<YonglileibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonglileibieView selectView(Wrapper<YonglileibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
