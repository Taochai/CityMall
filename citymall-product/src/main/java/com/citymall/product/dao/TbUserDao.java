package com.citymall.product.dao;

import com.citymall.product.entity.TbUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author Eric chai
 * @email qinshuichaitao@gmail.com
 * @date 2020-07-22 01:04:53
 */
@Mapper
public interface TbUserDao extends BaseMapper<TbUserEntity> {
	
}
