package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.SysCaptchaDao;
import com.citymall.product.entity.SysCaptchaEntity;
import com.citymall.product.service.SysCaptchaService;


@Service("sysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao, SysCaptchaEntity> implements SysCaptchaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysCaptchaEntity> page = this.page(
                new Query<SysCaptchaEntity>().getPage(params),
                new QueryWrapper<SysCaptchaEntity>()
        );

        return new PageUtils(page);
    }

}