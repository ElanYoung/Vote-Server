package com.starimmortal.vote.controller.v1;


import com.starimmortal.vote.dto.PlayerDTO;
import com.starimmortal.vote.dto.VoteAllDTO;
import com.starimmortal.vote.dto.VoteFirstDTO;
import com.starimmortal.vote.dto.VoteNextDTO;
import com.starimmortal.vote.pojo.PlayDO;
import com.starimmortal.vote.pojo.VoteDO;
import com.starimmortal.vote.pojo.VoteDraftDO;
import com.starimmortal.vote.service.PlayerService;
import com.starimmortal.vote.service.VoteDraftService;
import com.starimmortal.vote.service.VoteService;
import com.starimmortal.vote.vo.UnifyResponseVO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/player")
@Slf4j
public class PlayerController {
    @Autowired
    PlayerService playerService;

    /**
     * 保存参赛选手信息
     * @param playerDTO
     * @return
     * @throws Exception
     */
    @PostMapping("/savePlayer")
    public UnifyResponseVO<PlayDO> save(@RequestBody PlayerDTO playerDTO) throws Exception {
        UnifyResponseVO<PlayDO> voteDOUnifyResponseVO = playerService.SavePlayer(playerDTO);
        return voteDOUnifyResponseVO;
    }

    /**
     * 前端展示选手数据
     * @return
     */
    @PostMapping("/list")
    public UnifyResponseVO<List<PlayDO>> list(@RequestParam Integer voteId){
        log.info(voteId.toString());
        UnifyResponseVO<List<PlayDO>> listUnifyResponseVO = playerService.ListVoteData(voteId);
        return listUnifyResponseVO;
    }

}
