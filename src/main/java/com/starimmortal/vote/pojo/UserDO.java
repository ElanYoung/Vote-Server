package com.starimmortal.vote.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author generator@StarImmortal
 * @date 2021/04/10
 */
@Data
@TableName("tb_user")
public class UserDO {

    //type = IdType.AUTO 主键自增策略(必须在sql中设置主键自增开启)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户唯一标识
     */
    private String openid;

    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 会话密钥
     */
    private String sessionKey;

    /**
     * 微信用户资料
     */
    private String wxProfile;

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
