package com.roc.market.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roc.market.commons.utils.PageUtils;
import com.roc.market.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:55:48
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

