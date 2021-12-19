package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  投票详情 Vote 接口 草稿
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Repository
public interface VoteDraftMapper extends BaseMapper<VoteDraftDO> {
    /**
     * 查询openid对应的tb_user中对应id
     */
     Integer selectUserIdByOpenId(String openid);

}
