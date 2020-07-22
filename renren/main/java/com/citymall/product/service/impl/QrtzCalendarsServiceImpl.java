package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.QrtzCalendarsDao;
import com.citymall.product.entity.QrtzCalendarsEntity;
import com.citymall.product.service.QrtzCalendarsService;


@Service("qrtzCalendarsService")
public class QrtzCalendarsServiceImpl extends ServiceImpl<QrtzCalendarsDao, QrtzCalendarsEntity> implements QrtzCalendarsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzCalendarsEntity> page = this.page(
                new Query<QrtzCalendarsEntity>().getPage(params),
                new QueryWrapper<QrtzCalendarsEntity>()
        );

        return new PageUtils(page);
    }

}