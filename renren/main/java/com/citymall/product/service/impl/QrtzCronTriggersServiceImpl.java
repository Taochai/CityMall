package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.QrtzCronTriggersDao;
import com.citymall.product.entity.QrtzCronTriggersEntity;
import com.citymall.product.service.QrtzCronTriggersService;


@Service("qrtzCronTriggersService")
public class QrtzCronTriggersServiceImpl extends ServiceImpl<QrtzCronTriggersDao, QrtzCronTriggersEntity> implements QrtzCronTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzCronTriggersEntity> page = this.page(
                new Query<QrtzCronTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzCronTriggersEntity>()
        );

        return new PageUtils(page);
    }

}