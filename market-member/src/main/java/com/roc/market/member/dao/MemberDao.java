package com.roc.market.member.dao;

import com.roc.market.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Dennis Wang
 * @email DennisEverglow@gmail.com
 * @date 2020-11-10 21:57:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
