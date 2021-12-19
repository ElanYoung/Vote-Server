package com.starimmortal.vote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.vo.UnifyResponseVO;

/**
 * 投票详情类 草稿
 */

public interface VoteDraftService extends IService<VoteDraftDO>{

    /**
     * 存第一个界面数据入数据库
     * @param voteFirstDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<VoteDraftDO> SaveVote(VoteFirstDTO voteFirstDTO) throws Exception;

    /**
     * 存第二个界面数据入数据库
     * @param voteNextDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<VoteDraftDO> SaveNextVote(VoteNextDTO voteNextDTO) throws Exception;

}
