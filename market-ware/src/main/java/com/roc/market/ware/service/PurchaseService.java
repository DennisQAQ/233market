package com.roc.market.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.roc.market.commons.utils.PageUtils;
import com.roc.market.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:53:30
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

