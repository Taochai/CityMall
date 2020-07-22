package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.QrtzBlobTriggersDao;
import com.citymall.product.entity.QrtzBlobTriggersEntity;
import com.citymall.product.service.QrtzBlobTriggersService;


@Service("qrtzBlobTriggersService")
public class QrtzBlobTriggersServiceImpl extends ServiceImpl<QrtzBlobTriggersDao, QrtzBlobTriggersEntity> implements QrtzBlobTriggersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrtzBlobTriggersEntity> page = this.page(
                new Query<QrtzBlobTriggersEntity>().getPage(params),
                new QueryWrapper<QrtzBlobTriggersEntity>()
        );

        return new PageUtils(page);
    }

}