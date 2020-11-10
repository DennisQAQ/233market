package com.roc.market.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.roc.market.commons.utils.PageUtils;
import com.roc.market.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:53:30
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

