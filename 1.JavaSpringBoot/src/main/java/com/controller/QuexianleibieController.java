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

import com.entity.QuexianleibieEntity;
import com.entity.view.QuexianleibieView;

import com.service.QuexianleibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 缺陷类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@RestController
@RequestMapping("/quexianleibie")
public class QuexianleibieController {
    @Autowired
    private QuexianleibieService quexianleibieService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuexianleibieEntity quexianleibie,
		HttpServletRequest request){
        EntityWrapper<QuexianleibieEntity> ew = new EntityWrapper<QuexianleibieEntity>();

		PageUtils page = quexianleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quexianleibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuexianleibieEntity quexianleibie, 
		HttpServletRequest request){
        EntityWrapper<QuexianleibieEntity> ew = new EntityWrapper<QuexianleibieEntity>();

		PageUtils page = quexianleibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quexianleibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuexianleibieEntity quexianleibie){
       	EntityWrapper<QuexianleibieEntity> ew = new EntityWrapper<QuexianleibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quexianleibie, "quexianleibie")); 
        return R.ok().put("data", quexianleibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuexianleibieEntity quexianleibie){
        EntityWrapper< QuexianleibieEntity> ew = new EntityWrapper< QuexianleibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quexianleibie, "quexianleibie")); 
		QuexianleibieView quexianleibieView =  quexianleibieService.selectView(ew);
		return R.ok("查询缺陷类别成功").put("data", quexianleibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QuexianleibieEntity quexianleibie = quexianleibieService.selectById(id);
        return R.ok().put("data", quexianleibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QuexianleibieEntity quexianleibie = quexianleibieService.selectById(id);
        return R.ok().put("data", quexianleibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增缺陷类别") 
    public R save(@RequestBody QuexianleibieEntity quexianleibie, HttpServletRequest request){
        if(quexianleibieService.selectCount(new EntityWrapper<QuexianleibieEntity>().eq("quexianleibie", quexianleibie.getQuexianleibie()))>0) {
            return R.error("缺陷类别已存在");
        }
    	//ValidatorUtils.validateEntity(quexianleibie);
        quexianleibieService.insert(quexianleibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增缺陷类别")
    @RequestMapping("/add")
    public R add(@RequestBody QuexianleibieEntity quexianleibie, HttpServletRequest request){
        if(quexianleibieService.selectCount(new EntityWrapper<QuexianleibieEntity>().eq("quexianleibie", quexianleibie.getQuexianleibie()))>0) {
            return R.error("缺陷类别已存在");
        }
    	//ValidatorUtils.validateEntity(quexianleibie);
        quexianleibieService.insert(quexianleibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改缺陷类别")
    public R update(@RequestBody QuexianleibieEntity quexianleibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quexianleibie);
        if(quexianleibieService.selectCount(new EntityWrapper<QuexianleibieEntity>().ne("id", quexianleibie.getId()).eq("quexianleibie", quexianleibie.getQuexianleibie()))>0) {
            return R.error("缺陷类别已存在");
        }
        quexianleibieService.updateById(quexianleibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除缺陷类别")
    public R delete(@RequestBody Long[] ids){
        quexianleibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
