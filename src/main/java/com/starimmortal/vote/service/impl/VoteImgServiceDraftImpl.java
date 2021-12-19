package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.mapper.VoteImgDraftMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.pojo.VoteImgDraftDO;
import com.starimmortal.vote.service.VoteImgDraftService;
import com.starimmortal.vote.service.VoteImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteImgServiceDraftImpl extends ServiceImpl<VoteImgDraftMapper, VoteImgDraftDO> implements VoteImgDraftService {
    @Autowired
    private VoteImgDraftMapper voteImgDraftMapper;

}
