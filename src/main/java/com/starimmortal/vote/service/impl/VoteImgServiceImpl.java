package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.mapper.UserMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.service.VoteImgService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteImgServiceImpl extends ServiceImpl<VoteImgMapper, VoteImgDO> implements VoteImgService {
    @Autowired
    private VoteImgMapper voteImgMapper;

}
