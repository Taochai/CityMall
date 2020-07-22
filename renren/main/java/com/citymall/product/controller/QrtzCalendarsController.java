package com.citymall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citymall.product.entity.QrtzCalendarsEntity;
import com.citymall.product.service.QrtzCalendarsService;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.R;



/**
 * 
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@RestController
@RequestMapping("product/qrtzcalendars")
public class QrtzCalendarsController {
    @Autowired
    private QrtzCalendarsService qrtzCalendarsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:qrtzcalendars:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzCalendarsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("product:qrtzcalendars:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzCalendarsEntity qrtzCalendars = qrtzCalendarsService.getById(schedName);

        return R.ok().put("qrtzCalendars", qrtzCalendars);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:qrtzcalendars:save")
    public R save(@RequestBody QrtzCalendarsEntity qrtzCalendars){
		qrtzCalendarsService.save(qrtzCalendars);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:qrtzcalendars:update")
    public R update(@RequestBody QrtzCalendarsEntity qrtzCalendars){
		qrtzCalendarsService.updateById(qrtzCalendars);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:qrtzcalendars:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzCalendarsService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
