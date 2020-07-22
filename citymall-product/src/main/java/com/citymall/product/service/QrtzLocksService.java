package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.QrtzLocksEntity;

import java.util.Map;

/**
 * 
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface QrtzLocksService extends IService<QrtzLocksEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

