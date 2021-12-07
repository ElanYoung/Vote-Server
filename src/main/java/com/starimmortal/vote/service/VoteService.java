package com.starimmortal.vote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.vo.UnifyResponseVO;

/**
 * 投票详情类
 */

public interface VoteService extends IService<VoteDO>{

    /**
     * 存数据入数据库
     * @param voteFirstDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<VoteDO> SaveVote(VoteFirstDTO voteFirstDTO) throws Exception;
}
