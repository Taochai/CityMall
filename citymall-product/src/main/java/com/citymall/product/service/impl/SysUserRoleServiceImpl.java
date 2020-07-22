package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.SysUserRoleDao;
import com.citymall.product.entity.SysUserRoleEntity;
import com.citymall.product.service.SysUserRoleService;


@Service("sysUserRoleService")
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysUserRoleEntity> page = this.page(
                new Query<SysUserRoleEntity>().getPage(params),
                new QueryWrapper<SysUserRoleEntity>()
        );

        return new PageUtils(page);
    }

}