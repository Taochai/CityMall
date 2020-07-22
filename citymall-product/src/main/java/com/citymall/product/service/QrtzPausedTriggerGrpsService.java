package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.QrtzPausedTriggerGrpsEntity;

import java.util.Map;

/**
 * 
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface QrtzPausedTriggerGrpsService extends IService<QrtzPausedTriggerGrpsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

