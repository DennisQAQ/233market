package com.roc.market.order.dao;

import com.roc.market.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:56:50
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
