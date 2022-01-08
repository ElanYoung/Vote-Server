package com.starimmortal.vote.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 用户投票次数表
 */
@Data
@TableName("tb_vote_time")
public class VoteTimeDO {

    //type = IdType.AUTO 主键自增策略(必须在sql中设置主键自增开启)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 投票表id
     */
    private Integer voteId;

    /**
     * 参加选手id
     */
    private Integer playerId;



    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除时间
     */
    @TableLogic
    private Date deleteTime;

}
