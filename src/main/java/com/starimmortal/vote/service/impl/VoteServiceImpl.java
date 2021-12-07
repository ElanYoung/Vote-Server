package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl extends ServiceImpl<VoteMapper, VoteDO> implements VoteService  {
    @Autowired
    VoteMapper voteMapper;

    @Override
    public UnifyResponseVO<VoteDO> SaveVote(VoteFirstDTO voteFirstDTO) throws Exception {
        Integer userId = voteMapper.selectUserIdByOpenId(voteFirstDTO.getOpenid());
        VoteDO voteDO = new VoteDO();
        voteDO.setUserId(userId);
        BeanUtils.copyProperties(voteFirstDTO,voteDO);
        //存数据进去（除了图片）
        voteMapper.insert(voteDO);
        return UnifyResponseVO.success(voteDO);
    }
}
