package com.starimmortal.vote.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 投票草稿表实体类
 */
@Data
@TableName("tb_vote_draft")
public class VoteDraftDO {

    //type = IdType.AUTO 主键自增策略(必须在sql中设置主键自增开启)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人id
     */
    private Integer userId;

    /**
     * 模板id
     */
    private Integer templateId;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 投票名称
     */
    private String name;

    /**
     * 参与选手人数
     */
    private Integer totalTurnout;

    /**
     * 总票数
     */
    private Integer voteTotal;

    /**
     * 总访问数
     */
    private Integer visitNum;

    /**
     * 投票限制
     */
    private String voteLimit;

    /**
     * 投票次数限制
     */
    private Integer voteNumLimit;

    /**
     * 活动介绍
     */
    private String description;

    /**
     * 投票快照
     */
    private String snapVote;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;
    
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
