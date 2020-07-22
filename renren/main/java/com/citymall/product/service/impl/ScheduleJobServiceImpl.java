package com.citymall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citymall.common.utils.PageUtils;
import com.citymall.common.utils.Query;

import com.citymall.product.dao.ScheduleJobDao;
import com.citymall.product.entity.ScheduleJobEntity;
import com.citymall.product.service.ScheduleJobService;


@Service("scheduleJobService")
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobDao, ScheduleJobEntity> implements ScheduleJobService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ScheduleJobEntity> page = this.page(
                new Query<ScheduleJobEntity>().getPage(params),
                new QueryWrapper<ScheduleJobEntity>()
        );

        return new PageUtils(page);
    }

}