package com.starimmortal.vote.controller.v1;


import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.mapper.VoteMapper;
import com.starimmortal.vote.pojo.UserDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.service.UserService;
import com.starimmortal.vote.service.VoteDraftService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.ssl.Debug;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/v1/vote")
public class VoteController {
    @Autowired
    VoteService voteService;
    @Autowired
    VoteDraftService voteDraftService;

    @RequestMapping("/saveDraft")
    public UnifyResponseVO<VoteDraftDO> save(@RequestBody VoteFirstDTO voteFirstDTO) throws Exception {
        UnifyResponseVO<VoteDraftDO> voteDOUnifyResponseVO = voteDraftService.SaveVote(voteFirstDTO);
        return voteDOUnifyResponseVO;
    }

    @RequestMapping("/saveNextDraft")
    public UnifyResponseVO<VoteDraftDO> saveNext(@RequestBody VoteNextDTO voteNextDTO) throws Exception {
        UnifyResponseVO<VoteDraftDO> voteDOUnifyResponseVO = voteDraftService.SaveNextVote(voteNextDTO);
        return voteDOUnifyResponseVO;
    }

    /**
     * 成功传入数据库
     * @param voteAllDTO
     * @return
     * @throws Exception
     */
    @RequestMapping("/saveAll")
    public UnifyResponseVO<VoteDO> saveAll(@RequestBody VoteAllDTO voteAllDTO) throws Exception {
        UnifyResponseVO<VoteDO> voteDOUnifyResponseVO = voteService.SaveAllVote(voteAllDTO);
        return voteDOUnifyResponseVO;
    }

    /**
     * 前端展示数据
     * @return
     */
    @GetMapping("/list")
    public UnifyResponseVO<List<VoteDO>> list(){
        UnifyResponseVO<List<VoteDO>> listUnifyResponseVO = voteService.ListVoteData();
        return listUnifyResponseVO;
    }
}
