package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.mapper.VoteDraftMapper;
import com.starimmortal.vote.mapper.VoteImgDraftMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.pojo.VoteImgDraftDO;
import com.starimmortal.vote.service.VoteDraftService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VoteDraftServiceImpl extends ServiceImpl<VoteDraftMapper, VoteDraftDO> implements VoteDraftService {
    @Autowired
    VoteDraftMapper voteDraftMapper;
    @Autowired
    VoteImgDraftMapper voteImgDraftMapper;


    /**
     * 存储第一个界面 草稿存储
     *
     * @param voteFirstDTO
     * @return
     * @throws Exception
     */
    @Override
    public UnifyResponseVO<VoteDraftDO> SaveVote(VoteFirstDTO voteFirstDTO) throws Exception {
        Integer userId = voteDraftMapper.selectUserIdByOpenId(voteFirstDTO.getOpenid());
        System.out.println(userId);
        VoteDraftDO voteDraftDO = new VoteDraftDO();
        voteDraftDO.setUserId(userId);
        BeanUtils.copyProperties(voteFirstDTO, voteDraftDO);
        //存数据进去（除了图片）
        voteDraftMapper.insert(voteDraftDO);
        //将图片存入数据库，同时给到对应的id voteDO.getId()可以获得自增ID
        VoteImgDraftDO voteImgDraftDO = new VoteImgDraftDO();
        String[] imageList = voteFirstDTO.getImageList();
        //遍历存储图片数据进入数据库
        for (int i = 0; i < imageList.length; i++) {
            voteImgDraftDO.setVoteId(voteDraftDO.getId());
            voteImgDraftDO.setImage(imageList[i]);
            voteImgDraftMapper.insert(voteImgDraftDO);
        }
        return UnifyResponseVO.success(voteDraftDO);
    }

    /**
     * 存储第二个界面
     * @param voteNextDTO 第二个界面的量 草稿存储
     * @return
     * @throws Exception
     */
    @Override
    public UnifyResponseVO<VoteDraftDO> SaveNextVote(VoteNextDTO voteNextDTO) throws Exception {
        Integer userId = voteDraftMapper.selectUserIdByOpenId(voteNextDTO.getOpenid());
        VoteDraftDO voteDraftDO = new VoteDraftDO();
        voteDraftDO.setUserId(userId);
        BeanUtils.copyProperties(voteNextDTO, voteDraftDO);
        //存数据进去（除了图片）
        voteDraftMapper.insert(voteDraftDO);
        //将图片存入数据库，同时给到对应的id voteDO.getId()可以获得自增ID
        VoteImgDraftDO voteImgDraftDO = new VoteImgDraftDO();
        String[] imageList = voteNextDTO.getImageList();
        //遍历存储图片数据进入数据库
        for (int i = 0; i < imageList.length; i++) {
            voteImgDraftDO.setVoteId(voteDraftDO.getId());
            voteImgDraftDO.setImage(imageList[i]);
            voteImgDraftMapper.insert(voteImgDraftDO);
        }
        return UnifyResponseVO.success(voteDraftDO);
    }

}
