package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.TbUserEntity;

import java.util.Map;

/**
 * 用户
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface TbUserService extends IService<TbUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

