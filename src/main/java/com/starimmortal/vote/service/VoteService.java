package com.starimmortal.vote.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starimmortal.vote.dto.LoginDTO;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.vo.UnifyResponseVO;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 投票详情类
 */

public interface VoteService extends IService<VoteDO>{

    /**
     * 成功传入
     * @param voteAllDTO
     * @return
     * @throws Exception
     */
    UnifyResponseVO<VoteDO> SaveAllVote(VoteAllDTO voteAllDTO) throws Exception;

    /**
     * 列举所有数据
     * @return
     */
    UnifyResponseVO<List<VoteDO>> ListVoteData();
}
