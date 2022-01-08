package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.pojo.UserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  用户 Mapper 接口
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Repository
public interface UserMapper extends BaseMapper<UserDO> {
    /**
     * 搜索判断该用户是否存在
     * @param openid
     * @return
     */
    UserDO selectByOpenid(String openid);

    /**
     * 更新投票数
     * @param playerId
     * @return
     */
    Integer updateTicketNum(@Param("player_id") Integer playerId);

    /**
     * 查询投票限制的次数
     * @param voteId
     * @return
     */
    Integer selectVoteNumLimit(@Param("vote_id") Integer voteId);

}
