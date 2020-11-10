package com.roc.market.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.roc.market.commons.utils.PageUtils;
import com.roc.market.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:53:30
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

