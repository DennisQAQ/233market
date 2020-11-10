package com.roc.market.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.roc.market.commons.utils.PageUtils;
import com.roc.market.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:57:55
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

