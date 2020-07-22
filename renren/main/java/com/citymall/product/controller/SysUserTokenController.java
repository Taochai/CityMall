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

import com.citymall.product.entity.SysUserTokenEntity;
import com.citymall.product.service.SysUserTokenService;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.R;



/**
 * 系统用户Token
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@RestController
@RequestMapping("product/sysusertoken")
public class SysUserTokenController {
    @Autowired
    private SysUserTokenService sysUserTokenService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:sysusertoken:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysUserTokenService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
    @RequiresPermissions("product:sysusertoken:info")
    public R info(@PathVariable("userId") Long userId){
		SysUserTokenEntity sysUserToken = sysUserTokenService.getById(userId);

        return R.ok().put("sysUserToken", sysUserToken);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:sysusertoken:save")
    public R save(@RequestBody SysUserTokenEntity sysUserToken){
		sysUserTokenService.save(sysUserToken);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:sysusertoken:update")
    public R update(@RequestBody SysUserTokenEntity sysUserToken){
		sysUserTokenService.updateById(sysUserToken);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:sysusertoken:delete")
    public R delete(@RequestBody Long[] userIds){
		sysUserTokenService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
