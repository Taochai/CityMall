package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.QrtzTriggersDao;
import com.citymall.product.entity.QrtzTriggersEntity;
import com.citymall.product.service.QrtzTriggersService;


@Service("qrtzTriggersService")
public class QrtzTriggersServiceImpl extends ServiceImpl<QrtzTriggersDao, QrtzTriggersEntity> implements QrtzTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzTriggersEntity> page = this.page(
                new Query<QrtzTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzTriggersEntity>()
        );

        return new PageUtils(page);
    }

}