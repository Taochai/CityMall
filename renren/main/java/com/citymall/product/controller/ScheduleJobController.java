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

import com.citymall.product.entity.ScheduleJobEntity;
import com.citymall.product.service.ScheduleJobService;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.R;



/**
 * 定时任务
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@RestController
@RequestMapping("product/schedulejob")
public class ScheduleJobController {
    @Autowired
    private ScheduleJobService scheduleJobService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:schedulejob:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = scheduleJobService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{jobId}")
    @RequiresPermissions("product:schedulejob:info")
    public R info(@PathVariable("jobId") Long jobId){
		ScheduleJobEntity scheduleJob = scheduleJobService.getById(jobId);

        return R.ok().put("scheduleJob", scheduleJob);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:schedulejob:save")
    public R save(@RequestBody ScheduleJobEntity scheduleJob){
		scheduleJobService.save(scheduleJob);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:schedulejob:update")
    public R update(@RequestBody ScheduleJobEntity scheduleJob){
		scheduleJobService.updateById(scheduleJob);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:schedulejob:delete")
    public R delete(@RequestBody Long[] jobIds){
		scheduleJobService.removeByIds(Arrays.asList(jobIds));

        return R.ok();
    }

}
