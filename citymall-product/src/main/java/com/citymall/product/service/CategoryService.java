package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * ÉÌÆ·Èý¼¶·ÖÀà
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

