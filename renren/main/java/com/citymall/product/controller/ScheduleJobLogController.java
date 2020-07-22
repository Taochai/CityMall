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

import com.citymall.product.entity.ScheduleJobLogEntity;
import com.citymall.product.service.ScheduleJobLogService;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.R;



/**
 * 定时任务日志
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@RestController
@RequestMapping("product/schedulejoblog")
public class ScheduleJobLogController {
    @Autowired
    private ScheduleJobLogService scheduleJobLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:schedulejoblog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = scheduleJobLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{logId}")
    @RequiresPermissions("product:schedulejoblog:info")
    public R info(@PathVariable("logId") Long logId){
		ScheduleJobLogEntity scheduleJobLog = scheduleJobLogService.getById(logId);

        return R.ok().put("scheduleJobLog", scheduleJobLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:schedulejoblog:save")
    public R save(@RequestBody ScheduleJobLogEntity scheduleJobLog){
		scheduleJobLogService.save(scheduleJobLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:schedulejoblog:update")
    public R update(@RequestBody ScheduleJobLogEntity scheduleJobLog){
		scheduleJobLogService.updateById(scheduleJobLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:schedulejoblog:delete")
    public R delete(@RequestBody Long[] logIds){
		scheduleJobLogService.removeByIds(Arrays.asList(logIds));

        return R.ok();
    }

}
