package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.SysUserTokenEntity;

import java.util.Map;

/**
 * 系统用户Token
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

