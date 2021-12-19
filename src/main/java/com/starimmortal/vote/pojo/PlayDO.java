package com.starimmortal.vote.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 选手实体类
 */
@Data
@TableName("tb_player")
public class PlayDO {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 选手姓名
     */
    private String name;

    /**
     * 选手个人票数
     */
    private Integer ticketNum;

    /**
     * 用户id,防止同一个用户报名多次
     */
    private Integer userId;

    /**
     * 选手对应的投票表id
     */
    private Integer voteId;

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

    /**
     * 选手对应的图片
     */
    @TableField(exist = false)
    private List<PlayImgDO> playerImages;
}
