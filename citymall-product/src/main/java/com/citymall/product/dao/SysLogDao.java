package com.citymall.product.dao;

import com.citymall.product.entity.SysLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
