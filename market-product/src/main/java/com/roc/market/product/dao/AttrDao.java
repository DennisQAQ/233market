package com.roc.market.product.dao;

import com.roc.market.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:55:48
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
