package com.starimmortal.vote.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 创建投票第一个界面
 */
@Data
public class VoteFirstDTO {
    private String openid;
    private String name;
    private Integer categoryId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date endTime;
    private Integer status;
    /**
     * 所有图片的路径
     */
    private String[] imageList;
    //TODO 模板之后设计
}
