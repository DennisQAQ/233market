package com.roc.market.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roc.market.commons.utils.PageUtils;
import com.roc.market.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:56:50
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

