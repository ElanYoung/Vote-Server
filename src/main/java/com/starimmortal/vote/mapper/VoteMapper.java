package com.starimmortal.vote.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  投票详情 Vote 接口
 * </p>
 *
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Repository
public interface VoteMapper extends BaseMapper<VoteDO> {
    /**
     * 查询openid对应的tb_user中对应id
     */
     Integer selectUserIdByOpenId(String openid);

    /**
     * 查询所有的值包含图片 级联查询
     * @return
     */
     List<VoteDO> selectVoteAllData();

}
