package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;
import com.annotation.SysLog;

import com.entity.XiangmuleibieEntity;
import com.entity.view.XiangmuleibieView;

import com.service.XiangmuleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 项目类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@RestController
@RequestMapping("/xiangmuleibie")
public class XiangmuleibieController {
    @Autowired
    private XiangmuleibieService xiangmuleibieService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiangmuleibieEntity xiangmuleibie,
		HttpServletRequest request){
        EntityWrapper<XiangmuleibieEntity> ew = new EntityWrapper<XiangmuleibieEntity>();

		PageUtils page = xiangmuleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiangmuleibieEntity xiangmuleibie, 
		HttpServletRequest request){
        EntityWrapper<XiangmuleibieEntity> ew = new EntityWrapper<XiangmuleibieEntity>();

		PageUtils page = xiangmuleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiangmuleibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiangmuleibieEntity xiangmuleibie){
       	EntityWrapper<XiangmuleibieEntity> ew = new EntityWrapper<XiangmuleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiangmuleibie, "xiangmuleibie")); 
        return R.ok().put("data", xiangmuleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiangmuleibieEntity xiangmuleibie){
        EntityWrapper< XiangmuleibieEntity> ew = new EntityWrapper< XiangmuleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiangmuleibie, "xiangmuleibie")); 
		XiangmuleibieView xiangmuleibieView =  xiangmuleibieService.selectView(ew);
		return R.ok("查询项目类别成功").put("data", xiangmuleibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiangmuleibieEntity xiangmuleibie = xiangmuleibieService.selectById(id);
        return R.ok().put("data", xiangmuleibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiangmuleibieEntity xiangmuleibie = xiangmuleibieService.selectById(id);
        return R.ok().put("data", xiangmuleibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增项目类别") 
    public R save(@RequestBody XiangmuleibieEntity xiangmuleibie, HttpServletRequest request){
        if(xiangmuleibieService.selectCount(new EntityWrapper<XiangmuleibieEntity>().eq("xiangmuleibie", xiangmuleibie.getXiangmuleibie()))>0) {
            return R.error("项目类别已存在");
        }
    	//ValidatorUtils.validateEntity(xiangmuleibie);
        xiangmuleibieService.insert(xiangmuleibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增项目类别")
    @RequestMapping("/add")
    public R add(@RequestBody XiangmuleibieEntity xiangmuleibie, HttpServletRequest request){
        if(xiangmuleibieService.selectCount(new EntityWrapper<XiangmuleibieEntity>().eq("xiangmuleibie", xiangmuleibie.getXiangmuleibie()))>0) {
            return R.error("项目类别已存在");
        }
    	//ValidatorUtils.validateEntity(xiangmuleibie);
        xiangmuleibieService.insert(xiangmuleibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改项目类别")
    public R update(@RequestBody XiangmuleibieEntity xiangmuleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiangmuleibie);
        if(xiangmuleibieService.selectCount(new EntityWrapper<XiangmuleibieEntity>().ne("id", xiangmuleibie.getId()).eq("xiangmuleibie", xiangmuleibie.getXiangmuleibie()))>0) {
            return R.error("项目类别已存在");
        }
        xiangmuleibieService.updateById(xiangmuleibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除项目类别")
    public R delete(@RequestBody Long[] ids){
        xiangmuleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
