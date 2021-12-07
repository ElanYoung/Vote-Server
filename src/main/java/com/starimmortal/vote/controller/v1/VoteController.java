package com.starimmortal.vote.controller.v1;


import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.service.UserService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.ssl.Debug;

@RestController
@RequestMapping("/v1/vote")
public class VoteController {
    @Autowired
    VoteService voteService;

    @RequestMapping("/saveDraft")
    public UnifyResponseVO<VoteDO> test(@RequestBody VoteFirstDTO voteFirstDTO) throws Exception {
        //调用service层
        UnifyResponseVO<VoteDO> voteDOUnifyResponseVO = voteService.SaveVote(voteFirstDTO);
        return voteDOUnifyResponseVO;

    }

}
