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

import com.entity.YonglileibieEntity;
import com.entity.view.YonglileibieView;

import com.service.YonglileibieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 用例类别
 * 后端接口
 * @author 
 * @email 
 * @date 2024-01-11 10:16:46
 */
@RestController
@RequestMapping("/yonglileibie")
public class YonglileibieController {
    @Autowired
    private YonglileibieService yonglileibieService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YonglileibieEntity yonglileibie,
		HttpServletRequest request){
        EntityWrapper<YonglileibieEntity> ew = new EntityWrapper<YonglileibieEntity>();

		PageUtils page = yonglileibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonglileibie), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YonglileibieEntity yonglileibie, 
		HttpServletRequest request){
        EntityWrapper<YonglileibieEntity> ew = new EntityWrapper<YonglileibieEntity>();

		PageUtils page = yonglileibieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yonglileibie), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YonglileibieEntity yonglileibie){
       	EntityWrapper<YonglileibieEntity> ew = new EntityWrapper<YonglileibieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yonglileibie, "yonglileibie")); 
        return R.ok().put("data", yonglileibieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YonglileibieEntity yonglileibie){
        EntityWrapper< YonglileibieEntity> ew = new EntityWrapper< YonglileibieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yonglileibie, "yonglileibie")); 
		YonglileibieView yonglileibieView =  yonglileibieService.selectView(ew);
		return R.ok("查询用例类别成功").put("data", yonglileibieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YonglileibieEntity yonglileibie = yonglileibieService.selectById(id);
        return R.ok().put("data", yonglileibie);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YonglileibieEntity yonglileibie = yonglileibieService.selectById(id);
        return R.ok().put("data", yonglileibie);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    @SysLog("新增用例类别") 
    public R save(@RequestBody YonglileibieEntity yonglileibie, HttpServletRequest request){
        if(yonglileibieService.selectCount(new EntityWrapper<YonglileibieEntity>().eq("yonglileibie", yonglileibie.getYonglileibie()))>0) {
            return R.error("用例类别已存在");
        }
    	//ValidatorUtils.validateEntity(yonglileibie);
        yonglileibieService.insert(yonglileibie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @SysLog("新增用例类别")
    @RequestMapping("/add")
    public R add(@RequestBody YonglileibieEntity yonglileibie, HttpServletRequest request){
        if(yonglileibieService.selectCount(new EntityWrapper<YonglileibieEntity>().eq("yonglileibie", yonglileibie.getYonglileibie()))>0) {
            return R.error("用例类别已存在");
        }
    	//ValidatorUtils.validateEntity(yonglileibie);
        yonglileibieService.insert(yonglileibie);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @SysLog("修改用例类别")
    public R update(@RequestBody YonglileibieEntity yonglileibie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yonglileibie);
        if(yonglileibieService.selectCount(new EntityWrapper<YonglileibieEntity>().ne("id", yonglileibie.getId()).eq("yonglileibie", yonglileibie.getYonglileibie()))>0) {
            return R.error("用例类别已存在");
        }
        yonglileibieService.updateById(yonglileibie);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @SysLog("删除用例类别")
    public R delete(@RequestBody Long[] ids){
        yonglileibieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
