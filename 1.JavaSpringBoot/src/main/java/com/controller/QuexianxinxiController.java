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

import com.entity.QuexianxinxiEntity;
import com.entity.view.QuexianxinxiView;

import com.service.QuexianxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 缺陷信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 10:16:47
 */
@RestController
@RequestMapping("/quexianxinxi")
public class QuexianxinxiController {
    @Autowired
    private QuexianxinxiService quexianxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuexianxinxiEntity quexianxinxi,
		HttpServletRequest request){
        EntityWrapper<QuexianxinxiEntity> ew = new EntityWrapper<QuexianxinxiEntity>();

		PageUtils page = quexianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quexianxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuexianxinxiEntity quexianxinxi, 
		HttpServletRequest request){
        EntityWrapper<QuexianxinxiEntity> ew = new EntityWrapper<QuexianxinxiEntity>();

		PageUtils page = quexianxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quexianxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuexianxinxiEntity quexianxinxi){
       	EntityWrapper<QuexianxinxiEntity> ew = new EntityWrapper<QuexianxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quexianxinxi, "quexianxinxi")); 
        return R.ok().put("data", quexianxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuexianxinxiEntity quexianxinxi){
        EntityWrapper< QuexianxinxiEntity> ew = new EntityWrapper< QuexianxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quexianxinxi, "quexianxinxi")); 
		QuexianxinxiView quexianxinxiView =  quexianxinxiService.selectView(ew);
		return R.ok("查询缺陷信息成功").put("data", quexianxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuexianxinxiEntity quexianxinxi = quexianxinxiService.selectById(id);
        return R.ok().put("data", quexianxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuexianxinxiEntity quexianxinxi = quexianxinxiService.selectById(id);
        return R.ok().put("data", quexianxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增缺陷信息") 
    public R save(@RequestBody QuexianxinxiEntity quexianxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quexianxinxi);
        quexianxinxiService.insert(quexianxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增缺陷信息")
    @RequestMapping("/add")
    public R add(@RequestBody QuexianxinxiEntity quexianxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(quexianxinxi);
        quexianxinxiService.insert(quexianxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改缺陷信息")
    public R update(@RequestBody QuexianxinxiEntity quexianxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quexianxinxi);
        quexianxinxiService.updateById(quexianxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除缺陷信息")
    public R delete(@RequestBody Long[] ids){
        quexianxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
