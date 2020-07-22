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

import com.citymall.product.entity.SysMenuEntity;
import com.citymall.product.service.SysMenuService;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.R;



/**
 * 菜单管理
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@RestController
@RequestMapping("product/sysmenu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("product:sysmenu:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysMenuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    @RequiresPermissions("product:sysmenu:info")
    public R info(@PathVariable("menuId") Long menuId){
		SysMenuEntity sysMenu = sysMenuService.getById(menuId);

        return R.ok().put("sysMenu", sysMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("product:sysmenu:save")
    public R save(@RequestBody SysMenuEntity sysMenu){
		sysMenuService.save(sysMenu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("product:sysmenu:update")
    public R update(@RequestBody SysMenuEntity sysMenu){
		sysMenuService.updateById(sysMenu);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("product:sysmenu:delete")
    public R delete(@RequestBody Long[] menuIds){
		sysMenuService.removeByIds(Arrays.asList(menuIds));

        return R.ok();
    }

}
