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

import com.citymall.product.entity.QrtzBlobTriggersEntity;
import com.citymall.product.service.QrtzBlobTriggersService;
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
@RequestMapping("product/qrtzblobtriggers")
public class QrtzBlobTriggersController {
    @Autowired
    private QrtzBlobTriggersService qrtzBlobTriggersService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:qrtzblobtriggers:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrtzBlobTriggersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schedName}")
    @RequiresPermissions("product:qrtzblobtriggers:info")
    public R info(@PathVariable("schedName") String schedName){
		QrtzBlobTriggersEntity qrtzBlobTriggers = qrtzBlobTriggersService.getById(schedName);

        return R.ok().put("qrtzBlobTriggers", qrtzBlobTriggers);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:qrtzblobtriggers:save")
    public R save(@RequestBody QrtzBlobTriggersEntity qrtzBlobTriggers){
		qrtzBlobTriggersService.save(qrtzBlobTriggers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:qrtzblobtriggers:update")
    public R update(@RequestBody QrtzBlobTriggersEntity qrtzBlobTriggers){
		qrtzBlobTriggersService.updateById(qrtzBlobTriggers);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:qrtzblobtriggers:delete")
    public R delete(@RequestBody String[] schedNames){
		qrtzBlobTriggersService.removeByIds(Arrays.asList(schedNames));

        return R.ok();
    }

}
