package com.citymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citymall.common.utils.PageUtils;
import com.citymall.product.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
public interface SysOssService extends IService<SysOssEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

