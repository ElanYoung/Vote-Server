package com.starimmortal.vote.dto;

import lombok.Data;

/**
 * 选手报名表
 */
@Data
public class PlayerDTO {
    private String name;
    private Integer userId;
    private Integer voteId;

    /**
     * 所有图片的路径
     */
    private String[] imageList;
}
