package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * ÊôÐÔ·Ö×é
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

