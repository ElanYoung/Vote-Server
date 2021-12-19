package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.mapper.VoteDraftMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@Slf4j
public class VoteServiceImpl extends ServiceImpl<VoteMapper, VoteDO> implements VoteService {
    @Autowired
    VoteMapper voteMapper;
    @Autowired
    VoteImgMapper voteImgMapper;

    /**
     * 成功发布
     *
     * @param voteAllDTO 成功数据量
     * @return
     * @throws Exception
     */
    @Override
    public UnifyResponseVO<VoteDO> SaveAllVote(VoteAllDTO voteAllDTO) throws Exception {
        //检测是否存在该id 存在则更新 不存在则插入
        if (voteAllDTO.getOpenid() != null) {
            /**
             * 存在更新
             */
            Integer userId = voteMapper.selectUserIdByOpenId(voteAllDTO.getOpenid());
            VoteDO voteDO = new VoteDO();
            voteDO.setUserId(userId);
            BeanUtils.copyProperties(voteAllDTO, voteDO);
            //存数据进去（除了图片）
            voteMapper.insert(voteDO);
            //将图片存入数据库，同时给到对应的id voteDO.getId()可以获得自增ID
            VoteImgDO voteImgDO = new VoteImgDO();
            String[] imageList = voteAllDTO.getImageList();
            //遍历存储图片数据进入数据库
            for (int i = 0; i < imageList.length; i++) {
                voteImgDO.setVoteId(voteDO.getId());
                voteImgDO.setImage(imageList[i]);
                voteImgMapper.insert(voteImgDO);
            }
            return UnifyResponseVO.success(voteDO);
        } else {
            /**
             * 不存在创建
             */
            return null;
        }
    }

    @Override
    public UnifyResponseVO<List<VoteDO>> ListVoteData() {
//        List<VoteDO> list = this.list();
//        voteMapper.selectImageByVoteId(list.get(0))
        List<VoteDO> voteDOS = voteMapper.selectVoteAllData();
        System.out.println(voteDOS);
        return UnifyResponseVO.success(voteDOS);
    }
}
