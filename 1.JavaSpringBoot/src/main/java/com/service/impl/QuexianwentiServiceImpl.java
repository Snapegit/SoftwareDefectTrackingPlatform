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


import com.dao.QuexianwentiDao;
import com.entity.QuexianwentiEntity;
import com.service.QuexianwentiService;
import com.entity.vo.QuexianwentiVO;
import com.entity.view.QuexianwentiView;

@Service("quexianwentiService")
public class QuexianwentiServiceImpl extends ServiceImpl<QuexianwentiDao, QuexianwentiEntity> implements QuexianwentiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuexianwentiEntity> page = this.selectPage(
                new Query<QuexianwentiEntity>(params).getPage(),
                new EntityWrapper<QuexianwentiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuexianwentiEntity> wrapper) {
		  Page<QuexianwentiView> page =new Query<QuexianwentiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QuexianwentiVO> selectListVO(Wrapper<QuexianwentiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuexianwentiVO selectVO(Wrapper<QuexianwentiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuexianwentiView> selectListView(Wrapper<QuexianwentiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuexianwentiView selectView(Wrapper<QuexianwentiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
