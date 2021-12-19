package com.starimmortal.vote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starimmortal.vote.dto.PlayerDTO;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.pojo.PlayDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.vo.UnifyResponseVO;

import java.util.List;

/**
 * 参赛选手接口
 */

public interface PlayerService extends IService<PlayDO>{
    /**
     * 选手数据存储
     * @param playerDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<PlayDO> SavePlayer(PlayerDTO playerDTO) throws Exception;

    /**
     * 列举所有参赛选手数据
     * @return
     */
    UnifyResponseVO<List<PlayDO>> ListVoteData(Integer voteId);

}
