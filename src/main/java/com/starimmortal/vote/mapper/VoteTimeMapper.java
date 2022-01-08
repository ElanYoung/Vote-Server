package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.pojo.PlayImgDO;
import com.starimmortal.vote.pojo.VoteTimeDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 投票次数 接口
 */
@Repository
public interface VoteTimeMapper extends BaseMapper<VoteTimeDO> {
    Integer selectCountUserId(@Param("user_id") Integer userId,@Param("vote_id")Integer voteId);
}
