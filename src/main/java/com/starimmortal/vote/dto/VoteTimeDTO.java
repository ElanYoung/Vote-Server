package com.starimmortal.vote.dto;

import lombok.Data;

/**
 * 用户给选手投票
 * @author
 * @date 2021/11/25
 */
@Data
public class VoteTimeDTO {
    //投票人id
    private Integer userId;
    //被投票选手id
    private Integer playerId;
    //投票表id
    private Integer voteId;

}
