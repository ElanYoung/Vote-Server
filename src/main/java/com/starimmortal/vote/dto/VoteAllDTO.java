package com.starimmortal.vote.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 成功创建
 */
@Data
public class VoteAllDTO {
    //第二个界面独有的
    private String voteLimit;
    private Integer voteNumLimit;
    private String description;
    private String snapVote; //TODO 进行中 未做 死数据
    //第一个界面独有的
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

}
