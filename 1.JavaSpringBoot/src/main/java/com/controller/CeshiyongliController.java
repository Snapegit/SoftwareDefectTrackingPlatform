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

import com.entity.CeshiyongliEntity;
import com.entity.view.CeshiyongliView;

import com.service.CeshiyongliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 测试用例
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@RestController
@RequestMapping("/ceshiyongli")
public class CeshiyongliController {
    @Autowired
    private CeshiyongliService ceshiyongliService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CeshiyongliEntity ceshiyongli,
		HttpServletRequest request){
        EntityWrapper<CeshiyongliEntity> ew = new EntityWrapper<CeshiyongliEntity>();

		PageUtils page = ceshiyongliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshiyongli), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CeshiyongliEntity ceshiyongli, 
		HttpServletRequest request){
        EntityWrapper<CeshiyongliEntity> ew = new EntityWrapper<CeshiyongliEntity>();

		PageUtils page = ceshiyongliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ceshiyongli), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CeshiyongliEntity ceshiyongli){
       	EntityWrapper<CeshiyongliEntity> ew = new EntityWrapper<CeshiyongliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ceshiyongli, "ceshiyongli")); 
        return R.ok().put("data", ceshiyongliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CeshiyongliEntity ceshiyongli){
        EntityWrapper< CeshiyongliEntity> ew = new EntityWrapper< CeshiyongliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ceshiyongli, "ceshiyongli")); 
		CeshiyongliView ceshiyongliView =  ceshiyongliService.selectView(ew);
		return R.ok("查询测试用例成功").put("data", ceshiyongliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CeshiyongliEntity ceshiyongli = ceshiyongliService.selectById(id);
        return R.ok().put("data", ceshiyongli);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CeshiyongliEntity ceshiyongli = ceshiyongliService.selectById(id);
        return R.ok().put("data", ceshiyongli);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增测试用例") 
    public R save(@RequestBody CeshiyongliEntity ceshiyongli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ceshiyongli);
        ceshiyongliService.insert(ceshiyongli);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增测试用例")
    @RequestMapping("/add")
    public R add(@RequestBody CeshiyongliEntity ceshiyongli, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(ceshiyongli);
        ceshiyongliService.insert(ceshiyongli);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改测试用例")
    public R update(@RequestBody CeshiyongliEntity ceshiyongli, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ceshiyongli);
        ceshiyongliService.updateById(ceshiyongli);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除测试用例")
    public R delete(@RequestBody Long[] ids){
        ceshiyongliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
