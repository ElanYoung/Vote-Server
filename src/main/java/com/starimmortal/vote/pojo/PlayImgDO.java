package com.starimmortal.vote.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 选手图片实体类
 */
@Data
@TableName("tb_player_img")
public class PlayImgDO {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对应的选手id
     */
    private int playerId;

    /**
     * 图片路径
     */
    private String image;

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
