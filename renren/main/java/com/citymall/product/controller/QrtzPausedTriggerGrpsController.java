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

import com.citymall.product.entity.QrtzPausedTriggerGrpsEntity;
import com.citymall.product.service.QrtzPausedTriggerGrpsService;
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
@RequestMapping("product/qrtzpausedtriggergrps")
public class QrtzPausedTriggerGrpsController {
    @Autowired
    private QrtzPausedTriggerGrpsService qrtzPausedTriggerGrpsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:qrtzpausedtriggergrps:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzPausedTriggerGrpsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("product:qrtzpausedtriggergrps:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps = qrtzPausedTriggerGrpsService.getById(schedName);

        return R.ok().put("qrtzPausedTriggerGrps", qrtzPausedTriggerGrps);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:qrtzpausedtriggergrps:save")
    public R save(@RequestBody QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsService.save(qrtzPausedTriggerGrps);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:qrtzpausedtriggergrps:update")
    public R update(@RequestBody QrtzPausedTriggerGrpsEntity qrtzPausedTriggerGrps){
		qrtzPausedTriggerGrpsService.updateById(qrtzPausedTriggerGrps);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:qrtzpausedtriggergrps:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzPausedTriggerGrpsService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
