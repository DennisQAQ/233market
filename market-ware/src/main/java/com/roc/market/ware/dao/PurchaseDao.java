package com.roc.market.ware.dao;

import com.roc.market.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:53:30
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
