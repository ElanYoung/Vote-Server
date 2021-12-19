package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.dto.PlayerDTO;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.mapper.PlayerImgMapper;
import com.starimmortal.vote.mapper.PlayerMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.PlayDO;
import com.starimmortal.vote.pojo.PlayImgDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.service.PlayerService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, PlayDO> implements PlayerService {
    @Autowired
    PlayerMapper playerMapper;
    @Autowired
    PlayerImgMapper playerImgMapper;

    @Override
    public UnifyResponseVO<PlayDO> SavePlayer(PlayerDTO playerDTO) throws Exception {
        log.info(playerDTO.toString());
        PlayDO playDO = new PlayDO();
        BeanUtils.copyProperties(playerDTO, playDO);
        //存数据进去（除了图片）
        playerMapper.insert(playDO);
        //将图片存入数据库，同时给到对应的id voteDO.getId()可以获得自增ID
        PlayImgDO playImgDO = new PlayImgDO();
        String[] imageList = playerDTO.getImageList();
        //遍历存储图片数据进入数据库
        for (int i = 0; i < imageList.length; i++) {
            playImgDO.setPlayerId(playDO.getId());
            playImgDO.setImage(imageList[i]);
            log.info(playImgDO.toString());
            playerImgMapper.insert(playImgDO);
        }
        return UnifyResponseVO.success(playDO);
    }

    @Override
    public UnifyResponseVO<List<PlayDO>> ListVoteData(Integer voteId) {
        //        List<VoteDO> list = this.list();
//        voteMapper.selectImageByVoteId(list.get(0))
        List<PlayDO> playDOS = playerMapper.selectPlayerAllData(voteId);
        System.out.println(playDOS);
        return UnifyResponseVO.success(playDOS);
    }
}
