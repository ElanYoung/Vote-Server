package com.starimmortal.vote.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.starimmortal.vote.mapper.PlayerImgMapper;
import com.starimmortal.vote.mapper.VoteImgMapper;
import com.starimmortal.vote.pojo.PlayImgDO;
import com.starimmortal.vote.pojo.VoteImgDO;
import com.starimmortal.vote.service.PlayerImgService;
import com.starimmortal.vote.service.VoteImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerImgServiceImpl extends ServiceImpl<PlayerImgMapper, PlayImgDO> implements PlayerImgService {
    @Autowired
    private PlayerImgMapper playerImgMapper;
}
